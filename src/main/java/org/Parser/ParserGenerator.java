package org.Parser;

import org.Lexer.Token;
import org.Lexer.TokenLexer;
import org.Util.GrammarAnalyzer;
import org.Util.RuleExtractor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ParserGenerator {
    private static final File TOKEN_FILE  = new File("../Lexer/Token.java");
    private static final File LEXER_FILE  = new File("../Lexer/Lexer.java");
    private static final File TOKEN_LEXER_FILE  = new File("../Lexer/TokenLexer.java");
    private static final File LEXEME_FILE  = new File("../Lexer/Lexeme.java");
    private static final File GRAMMAR_ANALYZER_FILE = new File("../Util/GrammarAnalyzer.java");
    private static final File RULE_FILE = new File("../Util/Rule.java");
    private static final File RULE_EXTRACTOR_FILE = new File("../Util/RuleExtractor.java");

    private static final List<File> FILES_TO_COPY = List.of(
            TOKEN_FILE, LEXER_FILE, TOKEN_LEXER_FILE, LEXEME_FILE, GRAMMAR_ANALYZER_FILE, RULE_FILE, RULE_EXTRACTOR_FILE
    );



    public static void main(String[] args) throws Exception {
        // Проверяем аргументы командной строки
        if (args.length != 2) {
            System.err.println("Usage: java KLangTranslator <input_file> <output_file>");
            System.exit(1);
        }

        String source = "C:/your/source";
        File srcDir = new File(source);

        String destination = "C:/your/destination";
        File destDir = new File(destination);

//        try {
//            FileUtils.copyDirectory(srcDir, destDir);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Files.copy(Paths.get("../Lexer/"), Paths.get("../gen/"), REPLACE_EXISTING);

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
    public static void copyFile(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
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

//    public void createClasses(String name) {
//        createClass(name + "_in", in_fields);
//        createClass(name + "_out", out_fields);
//    }
//
//    public void createClass(String name, List<Variable> fields) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + name + ".java"))) {
//            writer.write("package %s;%n%n".formatted(packageName));
//            writer.write("public class %s {%n".formatted(name));
//            for (Variable field : fields) {
//                writer.write("    public %s %s;%n".formatted(field.getType(), field.getName()));
//            }
//            writer.write("}%n".formatted());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

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
                parserWriter.write("import %s;%n".formatted(imp));
            }

            parserWriter.write("%npublic class %s {%n".formatted("Parser"));

            parserWriter.write("\tprivate final TokenLexer lexer;%n%n".formatted());
            parserWriter.write(
                    ("    private final GrammarAnalyzer analyzer;%n%n" +
                            "    {%n" +
                            "        try {%n" +
                            "            analyzer = new GrammarAnalyzer((new RuleExtractor(new FileReader(\"rules.txt\"))).getRules());%n" +
                            "        } catch (FileNotFoundException e) {%n" +
                            "            throw new RuntimeException(e);%n" +
                            "        }%n" +
                            "    }%n%n")
                            .formatted());

            parserWriter.write((
                    "    private boolean isInsideFirst1(Token token, String alpha) {%n" +
                            "        Set<Token> first1 = analyzer.countFirst(Arrays.stream(alpha.split(\" \")).map(Token::new).toList());%n" +
                            "        return first1.contains(token);%n" +
                            "    }%n%n"
            ).formatted());

            parserWriter.write("\tpublic Parser(Reader reader) {\n" +
                    "        try {\n" +
                    "            lexer = new TokenLexer(reader);\n" +
                    "        } catch (IOException e) {\n" +
                    "            throw new RuntimeException(e);\n" +
                    "        }\n" +
                    "    }%n"
                    .formatted());

            parserWriter.write("\tprivate void assertToken(String tokenName, List<Tree> children) {\n" +
                    "\t\tToken token = new Token(tokenName);\n" +
                    "\t\tassert (lexer.getToken() == token);\n" +
                    "\t\tchildren.add(new Tree(token.getName()));\n" +
                    "        try {\n" +
                    "            lexer.nextToken();\n" +
                    "        } catch (IOException e) {\n" +
                    "            throw new RuntimeException(e);\n" +
                    "        }\n" +
                    "    }%n".formatted());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private final GrammarAnalyzer analyzer;

    {
        try {
            analyzer = new GrammarAnalyzer((new RuleExtractor(new FileReader("rules.txt"))).getRules());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isInsideFirst1(Token token, String alpha) {
        Set<Token> first1 = analyzer.countFirst(Arrays.stream(alpha.split(" ")).map(Token::new).toList());
        return first1.contains(token);
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

    private void writeCheckInFirst(String alpha) {
        writeParser("\tif (isInsideFirst1(lexer.getToken(), %s)) {%n".formatted(alpha));
    }

    private StringBuilder sb = new StringBuilder();

    private void writeAfter(String str) {
        sb.append(str);
    }

    int id = 0;

    private void after() {
        writeParser(sb.toString());
        id = 0;
    }

    private void call(String parseRuleName) {
        id++;
        int token_value = Integer.parseInt(lexer.getToken().getName());
        writeAfter("\t\t\t%s_in %s_in_%d = new %s_in()\t\t\tTreeVal<%s_out> tree_%s_%d = %s(%s_in_%d);%n\t\t\t%s_out %s_res_%d = tree_%s_%d.getRes();%n\t\t\tTree %s_tree_%d = tree_%s_%d.getTree();%n\t\t\tchildren.add(%s_tree_%d);%n"
                .formatted(parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, id, parseRuleName, id, parseRuleName, id, parseRuleName, id, parseRuleName, id));
    }

    private List<String> variablesNames = new ArrayList<>();

    private void addVariable(String name) {
        variablesNames.add(name.substring(1));
    }

    private static final String RULES_PATH = path + "rules.txt";

    private final Writer rulesWriter;

    {
        try {
            rulesWriter = new BufferedWriter(new FileWriter(RULES_PATH));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    private void printToRules(String ruleName) {
//        try {
//            rulesWriter.write("%s:%s".formatted(ruleName, alpha.toString()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}

