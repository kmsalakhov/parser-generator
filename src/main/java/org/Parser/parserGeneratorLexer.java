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
			null, "':'", "'|'", "';'", "'{'", "','", "'}'", null, "'''", null, null, 
			null, null, null, null, "'+'", "'*'"
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
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + name + ".java"))) {
	            writer.write("package %s;%n".formatted(packageName));
	            writer.write("public class %s {%n".formatted(name));
	            createClass(name + "_in", in_fields, writer);
	            writer.write("%n%n%n".formatted());
	            createClass(name + "_out", out_fields, writer);
	            writer.write("}%n".formatted());
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }

	    public void createClass(String name, List<Variable> fields, Writer writer) {
	        try {
	            writer.write("    public class %s {%n".formatted(name));
	            for (Variable field : fields) {
	                writer.write("        public %s %s;%n".formatted(field.getType(), field.getName()));
	            }
	            writer.write("    }%n".formatted());
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

	    private void initParserRule(String name) {
	        createClasses(name);

	        writeParser("    public Tree<%s_out> %s(%s_in in) {%n".formatted(name, name, name));
	        writeParser("\t\t%s_out out = new %s_out();%n".formatted(name, name));
	        writeParser("\t\tList<Tree> children = new ArrayList<>();%n".formatted());
	    }

	    private void writeAssertToken(String str) {
	        writeParser("\t\tassertToken(%s);%n".formatted(str));
	    }



	    private void writeCode(String code) {
	        String[] lines = code.substring(1, code.length() - 1).split("\\r?\\n");
	        for (String line : lines) {
	            writeParser("\t\t%s%n".formatted(line));
	        }
	    }

	    private void end() {
	        try {
	            parserWriter.close();
	            lexerWriter.close();
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
		"\u0004\u0000\u0011s\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u00062\b\u0006\n\u0006\f\u00065\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b=\b\b\n\b\f\b@\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\tF\b\t\n\t\f\tI\t\t\u0001\n\u0001\n\u0005\nM"+
		"\b\n\n\n\f\nP\t\n\u0001\u000b\u0001\u000b\u0004\u000bT\b\u000b\u000b\u000b"+
		"\f\u000bU\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\\\b\f\n\f\f\f_\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010n\b\u0010"+
		"\u000b\u0010\f\u0010o\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011\u0001\u0000\b\u0001\u0000@@\u0001\u0000]]\u0001"+
		"\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u0000\n\n\u0001\u0000"+
		"\'\'\u0003\u0000\t\n\r\r  y\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000"+
		"\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000"+
		"\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001"+
		"\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f8\u0001\u0000\u0000"+
		"\u0000\u0011:\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015"+
		"J\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019W\u0001"+
		"\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000"+
		"\u0000\u001fj\u0001\u0000\u0000\u0000!m\u0001\u0000\u0000\u0000#$\u0005"+
		":\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005|\u0000\u0000&\u0004"+
		"\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0006\u0001\u0000\u0000"+
		"\u0000)*\u0005{\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005,\u0000"+
		"\u0000,\n\u0001\u0000\u0000\u0000-.\u0005}\u0000\u0000.\f\u0001\u0000"+
		"\u0000\u0000/3\u0005@\u0000\u000002\b\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0005@\u0000\u00007\u000e\u0001\u0000\u0000\u000089\u0005\'\u0000\u0000"+
		"9\u0010\u0001\u0000\u0000\u0000:>\u0005[\u0000\u0000;=\b\u0001\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AB\u0005]\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CG\u0007"+
		"\u0002\u0000\u0000DF\u0007\u0003\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0014\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JN\u0007"+
		"\u0004\u0000\u0000KM\u0007\u0003\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u0016\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0005"+
		"$\u0000\u0000RT\u0007\u0003\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\u0018\u0001\u0000\u0000\u0000WX\u0005/\u0000\u0000XY\u0005/\u0000\u0000"+
		"Y]\u0001\u0000\u0000\u0000Z\\\b\u0005\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005"+
		"\n\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\f\u0000\u0000c\u001a"+
		"\u0001\u0000\u0000\u0000de\u0003\u000f\u0007\u0000ef\b\u0006\u0000\u0000"+
		"fg\u0003\u000f\u0007\u0000g\u001c\u0001\u0000\u0000\u0000hi\u0005+\u0000"+
		"\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0005*\u0000\u0000k \u0001\u0000"+
		"\u0000\u0000ln\u0007\u0007\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0006\u0010\u0000\u0000r\"\u0001\u0000\u0000"+
		"\u0000\b\u00003>GNU]o\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}