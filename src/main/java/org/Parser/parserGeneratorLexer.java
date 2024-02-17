// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class parserGeneratorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXT=7, QUOT=8, REGEXP=9, 
		PARSE_NAME=10, LEXER_NAME=11, COMMAND=12, COMMENT=13, STRING=14, PLUS=15, 
		MUL=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TEXT", "QUOT", "REGEXP", 
			"PARSE_NAME", "LEXER_NAME", "COMMAND", "COMMENT", "STRING", "PLUS", "MUL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'DEFAULT'", "'{'", "','", "'}'", null, "'''", null, 
			null, null, null, null, null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TEXT", "QUOT", "REGEXP", "PARSE_NAME", 
			"LEXER_NAME", "COMMAND", "COMMENT", "STRING", "PLUS", "MUL", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public parserGeneratorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "parserGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u00068\b\u0006\n\u0006\f\u0006;\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\bC\b\b\n\b\f\bF\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\tL\b\t\n\t\f\tO\t\t\u0001\n\u0001\n\u0005\nS"+
		"\b\n\n\n\f\nV\t\n\u0001\u000b\u0001\u000b\u0004\u000bZ\b\u000b\u000b\u000b"+
		"\f\u000b[\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fb\b\f\n\f\f\fe\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010t\b\u0010"+
		"\u000b\u0010\f\u0010u\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011\u0001\u0000\b\u0001\u0000@@\u0001\u0000]]\u0001"+
		"\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u0000\n\n\u0001\u0000"+
		"\'\'\u0003\u0000\t\n\r\r  \u007f\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000"+
		"\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011@\u0001\u0000\u0000\u0000\u0013I\u0001\u0000\u0000\u0000\u0015"+
		"P\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019]\u0001"+
		"\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000"+
		"\u0000\u001fp\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#$\u0005"+
		";\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005:\u0000\u0000&\u0004"+
		"\u0001\u0000\u0000\u0000\'(\u0005D\u0000\u0000()\u0005E\u0000\u0000)*"+
		"\u0005F\u0000\u0000*+\u0005A\u0000\u0000+,\u0005U\u0000\u0000,-\u0005"+
		"L\u0000\u0000-.\u0005T\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005"+
		"{\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005,\u0000\u00002\n\u0001"+
		"\u0000\u0000\u000034\u0005}\u0000\u00004\f\u0001\u0000\u0000\u000059\u0005"+
		"@\u0000\u000068\b\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005@\u0000\u0000"+
		"=\u000e\u0001\u0000\u0000\u0000>?\u0005\'\u0000\u0000?\u0010\u0001\u0000"+
		"\u0000\u0000@D\u0005[\u0000\u0000AC\b\u0001\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GH\u0005]\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IM\u0007\u0002\u0000"+
		"\u0000JL\u0007\u0003\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0014"+
		"\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PT\u0007\u0004\u0000"+
		"\u0000QS\u0007\u0003\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0016"+
		"\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0005$\u0000\u0000"+
		"XZ\u0007\u0003\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0018\u0001"+
		"\u0000\u0000\u0000]^\u0005/\u0000\u0000^_\u0005/\u0000\u0000_c\u0001\u0000"+
		"\u0000\u0000`b\b\u0005\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\n\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0006\f\u0000\u0000i\u001a\u0001\u0000\u0000\u0000"+
		"jk\u0003\u000f\u0007\u0000kl\b\u0006\u0000\u0000lm\u0003\u000f\u0007\u0000"+
		"m\u001c\u0001\u0000\u0000\u0000no\u0005+\u0000\u0000o\u001e\u0001\u0000"+
		"\u0000\u0000pq\u0005*\u0000\u0000q \u0001\u0000\u0000\u0000rt\u0007\u0007"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0006\u0010\u0000\u0000x\"\u0001\u0000\u0000\u0000\b\u00009DMT[cu\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}