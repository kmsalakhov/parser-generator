grammar parserGenerator;

@header {
package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
}

@members {
    public static final String packageName = "org.gen";
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

    public void createClasses(String name) {
        createClass(name + "_in", in_fields);
        createClass(name + "_out", out_fields);
    }

    public void createClass(String name, List<Variable> fields) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + name + ".java"))) {
            writer.write("package %s;%n%n".formatted(packageName));
            writer.write("public class %s {%n".formatted(name));
            for (Variable field : fields) {
                writer.write("    public %s %s;%n".formatted(field.getType(), field.getName()));
            }
            writer.write("}%n".formatted());
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

    public void printToLexems(String str) {
        try {
            lexerWriter.write(str);
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


    private static final String PARSER_PACKAGE_NAME = "org.gen";
    private final List<String> imports = new ArrayList<>();
    {
        imports.add("java.io.*");
        imports.add("java.util.ArrayList");
        imports.add("java.util.List");
        imports.add("java.util.Arrays");
        imports.add("java.util.Set");
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
                            "        Set<Token> first1 = analyzer.countFirst1(Arrays.stream(alpha.split(\" \")).map(Token::new).toList());%n" +
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
                    "\t\tassert (lexer.getToken().equals(token));\n" +
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

    private void initParserRule(String name) {
        createClasses(name);

        writeParser("    public TreeVal<%s_out> %s(%s_in in) {%n".formatted(name, name, name));
        writeParser("\t\t%s_out out = new %s_out();%n".formatted(name, name));
        writeParser("\t\tList<Tree> children = new ArrayList<>();%n".formatted());
    }

    private void writeAssertToken(String str) {
        writeAfter("\t\t\tassertToken(\"%s\", children);%n".formatted(str));
    }



    private void writeCode(String code) {
        String[] lines = code.substring(1, code.length() - 1).split("\\r?\\n");
        for (String line : lines) {
            writeAfter("\t\t\t%s%n".formatted(line));
        }
    }

    boolean firstCall = false;
    private void writeCheckInFirst(String alpha) {
        if (firstCall) {
            writeParser("\t\tif (isInsideFirst1(lexer.getToken(), \"%s\")) {%n".formatted(alpha));
        } else {
            writeParser("\t\telse if (isInsideFirst1(lexer.getToken(), \"%s\")) {%n".formatted(alpha));
        }
    }



    private StringBuilder sb = new StringBuilder();
    private StringBuilder alpha = new StringBuilder();

    private void writeAfter(String str) {
        sb.append(str);
    }

    int id = 0;

    private void after() {
        writeParser(sb.toString());
        sb = new StringBuilder();
        alpha = new StringBuilder();
        id = 0;
    }

    private void call(String parseRuleName) {
        id++;
        writeAfter("\t\t\t%s_in %s_in_%d = new %s_in();%n\t\t\tTreeVal<%s_out> tree_%s_%d = %s(%s_in_%d);%n\t\t\t%s_out %s_res_%d = tree_%s_%d.getRes();%n\t\t\tTree %s_tree_%d = tree_%s_%d.getTree();%n\t\t\tchildren.add(%s_tree_%d);%n"
                .formatted(parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, id, parseRuleName, parseRuleName, id, parseRuleName, id, parseRuleName, id, parseRuleName, id, parseRuleName, id));
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

    private void printToRules(String ruleName) {
        try {
            rulesWriter.write("%s:%s%n".formatted(ruleName, alpha.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private void end() {
        try {
            parserWriter.close();
            lexerWriter.close();
            rulesWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

grm: {initParser();} rule+ EOF {writeParser("}%n".formatted()); end();};

rule: parse_rule_init | lexer_rule;

//parse_rule: PARSE_NAME ':' (parse_rule_arg+ '|')* parse_rule_arg+ ';';
//parse_rule: PARSE_NAME init_variables? init_variables? ':' parse_expression ';';
//parse_expression: parse_factor+ ('|' parse_factor+)*;
//parse_factor: parse_atom | code;
//parse_atom: parse_primitive | '(' parse_expression ')' | parse_atom operation;
//parse_primitive: STRING | LEXER_NAME | PARSE_NAME;

parse_rule_init: PARSE_NAME init_variables_in init_variables_out {firstCall = true; initParserRule($PARSE_NAME.text);} ';' parse_rule
                {writeParser("\t\treturn new TreeVal<%s_out>(out, new Tree(\"%s\", children));%n\t}%n%n".formatted($PARSE_NAME.text, $PARSE_NAME.text));};

parse_rule: PARSE_NAME ':' ((alpha=parse_rule_arg+ ';'
            {writeCheckInFirst(alpha.toString()); firstCall = false; printToRules($PARSE_NAME.text); after(); writeParser("\t\t}%n".formatted());})
             | 'DEFAULT' code {writeParser("\t\telse {%n".formatted()); writeCode($code.text); after(); writeParser("\t\t}%n".formatted());} ';')
            parse_rule?;

parse_rule_arg: parse_rule_call
                | code {writeCode($code.text);}
                | LEXER_NAME {writeAssertToken($LEXER_NAME.text);} {alpha.append($LEXER_NAME.text + " ");};

parse_rule_call: PARSE_NAME pass_variables
            {call($PARSE_NAME.text);}
            {alpha.append($PARSE_NAME.text + " ");}
            ;

pass_variables: '{' (variable (',' variable)*)? '}';

init_variables_in: {in_fields = new ArrayList<>(); }
                   '{' (init_variable_in (',' init_variable_in)*)? '}';
init_variable_in: type variable {in_fields.add(new Variable($type.text, $variable.text));};


init_variables_out: {out_fields = new ArrayList<>(); }
                    '{' (init_variable_out (',' init_variable_out)*)? '}';
init_variable_out: type variable {out_fields.add(new Variable($type.text, $variable.text));};


variable: COMMAND;
type: COMMAND;
code: TEXT+;

//lexer_rule: LEXER_NAME ':' lexer_expression ('-> skip')? ';';
//lexer_expression: lexer_factor+ ('|' lexer_factor+)*;
//lexer_factor: lexer_primitive | '(' lexer_expression ')' | lexer_factor operation;
//lexer_primitive: STRING | LEXER_NAME;

lexer_rule: LEXER_NAME ':' REGEXP ';' {printToLexems(String.format("%s:%s%n", $LEXER_NAME.text, $REGEXP.text));};


//lexer_rule: LEXER_NAME ':' (lexer_rule_arg+ '|')* lexer_rule_arg+ ';';
//lexer_rule_arg: STRING | LEXER_NAME | '(' lexer_rule_arg ')' | lexer_rule_arg operation;
//parse_rule_arg: lexer_rule_arg | PARSE_NAME | '(' parse_rule_arg ')' | parse_rule_arg operation;
operation: PLUS | MUL;

TEXT: '@' (~'@')* '@';
QUOT: '\'';
REGEXP: '[' (~']')* ']';
PARSE_NAME: [a-z] [a-zA-Z_0-9]*;
LEXER_NAME: [A-Z] [a-zA-Z_0-9]*;
COMMAND: '$' [a-zA-Z_0-9]+;
COMMENT: '//' (~'\n')* '\n' -> skip;
STRING: QUOT ~('\'') QUOT;
PLUS: '+';
MUL: '*';

WS: [ \t\r\n]+ -> skip;



