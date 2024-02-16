package org.Parser;

import org.Lexer.Token;
import org.Lexer.TokenLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParserGenerator {
    public static void main(String[] args) throws Exception {
        // Проверяем аргументы командной строки
        if (args.length != 2) {
            System.err.println("Usage: java KLangTranslator <input_file> <output_file>");
            System.exit(1);
        }

        // Создаем поток ввода для входного файла
        InputStream inputStream = Files.newInputStream(Paths.get(args[0]));

        // Создаем лексер для входного потока
        parserGeneratorLexer lexer = new parserGeneratorLexer(CharStreams.fromStream(inputStream));

        // Создаем поток токенов на основе лексера
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Создаем парсер на основе потока токенов
        parserGeneratorParser parser = new parserGeneratorParser(tokens);
//        parser.program();

        // Перенаправляем вывод парсера в файл
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        System.setOut(new PrintStream(outputStream));

        // Запускаем парсер на стартовом правиле программы
        parser.grm();

        // Закрываем файл после завершения трансляции
        outputStream.close();

        System.out.println("Translation completed successfully.");
    }

    public List<Variable> in_fields = new ArrayList<>(), out_fields = new ArrayList<>();

    public static class Variable {
        private final String type;
        private final String name;

        public Variable(String type, String name) {
            this.type = type.substring(1);
            this.name = name.substring(1);
        }

        public String getType() {
            return type;
        }

        public String getName() {
            return name;
        }
    }

    public static final String path = "../gen/";

    public void createClasses(String name, List<Variable> in_fields, List<Variable> out_fields) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + name))) {
            createClass(name + "_in", in_fields, writer);
            writer.write("%n%n%n".formatted());
            createClass(name + "_out", out_fields, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createClass(String name, List<Variable> fields, Writer writer) {
        try {
            writer.write("public class %s {%n".formatted(name));
            for (Variable field : fields) {
                writer.write("public %s %s;".formatted(field.getType(), field.getName()));
            }
            writer.write("}%n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String parsePath = path + "Parser.java";
    private final Writer parserWriter;

    {
        try {
            parserWriter = new BufferedWriter(new FileWriter(parsePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String lexerPath = path + "Lexemes.txt";
    private final Writer lexerWriter;

    {
        try {
            lexerWriter = new BufferedWriter(new FileWriter(lexerPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static final String PARSER_PACKAGE_NAME = "org.gen";
    private final List<String> imports = new ArrayList<>();
    {
        imports.add("java.io.*");
    }
    private void initParser() {
        try {
            parserWriter.write("package %s;%n%n".formatted(PARSER_PACKAGE_NAME));

            for (String imp : imports) {
                parserWriter.write("import %s%n".formatted(imp));
            }

            parserWriter.write("%npublic class %s {%n".formatted("Parser"));

            parserWriter.write("\tprivate final TokenLexer lexer;%n%n".formatted());
            parserWriter.write("\tpublic Parser(Reader reader) {%n\t\tlexer = new TokenLexer(reader);%n\t}%n%n"
                    .formatted());

            parserWriter.write("\tprivate assertToken(String tokenName) {%n\t\tassert (lexer.getToken() == new Token(tokenName);%n\t}%n%n".formatted());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void noExceptionWrite(Writer writer, String str) {
        try {
            writer.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeParser(String str) {
        noExceptionWrite(parserWriter, str);
    }

    private void end() {
        try {
            parserWriter.close();
            lexerWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initParserRule(String name) {
//        createClasses(name);

        writeParser("    public Tree<%s_out> %s(%s_in in) {%n".formatted(name, name, name));
        writeParser("\t\t%s_out out = new %s_out()".formatted(name, name));
    }

    private void writeCode(String code) {
        String[] lines = code.substring(1, code.length() - 1).split("\\r?\\n");
        for (String line : lines) {
            writeParser("\t\t%s%n".formatted(line));
        }
    }

    TokenLexer lexer;

    private void writeAssertToken(String str) {
        writeParser("\t\tassertToken(%s);%n".formatted(str));
    }
}

