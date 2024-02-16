// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class parserGeneratorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXT=7, QUOT=8, REGEXP=9, 
		PARSE_NAME=10, LEXER_NAME=11, COMMAND=12, COMMENT=13, STRING=14, PLUS=15, 
		MUL=16, WS=17;
	public static final int
		RULE_grm = 0, RULE_rule = 1, RULE_parse_rule = 2, RULE_parse_rule_arg = 3, 
		RULE_parse_rule_call = 4, RULE_pass_variables = 5, RULE_init_variables_in = 6, 
		RULE_init_variable_in = 7, RULE_init_variables_out = 8, RULE_init_variable_out = 9, 
		RULE_variable = 10, RULE_type = 11, RULE_code = 12, RULE_lexer_rule = 13, 
		RULE_operation = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"grm", "rule", "parse_rule", "parse_rule_arg", "parse_rule_call", "pass_variables", 
			"init_variables_in", "init_variable_in", "init_variables_out", "init_variable_out", 
			"variable", "type", "code", "lexer_rule", "operation"
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

	@Override
	public String getGrammarFileName() { return "parserGenerator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public parserGeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GrmContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(parserGeneratorParser.EOF, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public GrmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterGrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitGrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitGrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrmContext grm() throws RecognitionException {
		GrmContext _localctx = new GrmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			initParser();
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				rule_();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARSE_NAME || _la==LEXER_NAME );
			setState(36);
			match(EOF);
			writeParser("}%n".formatted()); end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public Parse_ruleContext parse_rule() {
			return getRuleContext(Parse_ruleContext.class,0);
		}
		public Lexer_ruleContext lexer_rule() {
			return getRuleContext(Lexer_ruleContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				parse_rule();
				}
				break;
			case LEXER_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				lexer_rule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_ruleContext extends ParserRuleContext {
		public Token PARSE_NAME;
		public TerminalNode PARSE_NAME() { return getToken(parserGeneratorParser.PARSE_NAME, 0); }
		public Init_variables_inContext init_variables_in() {
			return getRuleContext(Init_variables_inContext.class,0);
		}
		public Init_variables_outContext init_variables_out() {
			return getRuleContext(Init_variables_outContext.class,0);
		}
		public List<Parse_rule_argContext> parse_rule_arg() {
			return getRuleContexts(Parse_rule_argContext.class);
		}
		public Parse_rule_argContext parse_rule_arg(int i) {
			return getRuleContext(Parse_rule_argContext.class,i);
		}
		public Parse_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_ruleContext parse_rule() throws RecognitionException {
		Parse_ruleContext _localctx = new Parse_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parse_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((Parse_ruleContext)_localctx).PARSE_NAME = match(PARSE_NAME);
			setState(44);
			init_variables_in();
			setState(45);
			init_variables_out();
			initParserRule((((Parse_ruleContext)_localctx).PARSE_NAME!=null?((Parse_ruleContext)_localctx).PARSE_NAME.getText():null));
			setState(47);
			match(T__0);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				parse_rule_arg();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3200L) != 0) );
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(53);
				match(T__1);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					parse_rule_arg();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3200L) != 0) );
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__2);
			writeParser("\t\treturn new Tree<%s_out>(out, children);%n\t}%n%n".formatted((((Parse_ruleContext)_localctx).PARSE_NAME!=null?((Parse_ruleContext)_localctx).PARSE_NAME.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_rule_argContext extends ParserRuleContext {
		public CodeContext code;
		public Token LEXER_NAME;
		public Parse_rule_callContext parse_rule_call() {
			return getRuleContext(Parse_rule_callContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode LEXER_NAME() { return getToken(parserGeneratorParser.LEXER_NAME, 0); }
		public Parse_rule_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_rule_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_rule_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_rule_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_rule_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_rule_argContext parse_rule_arg() throws RecognitionException {
		Parse_rule_argContext _localctx = new Parse_rule_argContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parse_rule_arg);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				parse_rule_call();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((Parse_rule_argContext)_localctx).code = code();
				writeCode((((Parse_rule_argContext)_localctx).code!=null?_input.getText(((Parse_rule_argContext)_localctx).code.start,((Parse_rule_argContext)_localctx).code.stop):null));
				}
				break;
			case LEXER_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				((Parse_rule_argContext)_localctx).LEXER_NAME = match(LEXER_NAME);
				writeAssertToken((((Parse_rule_argContext)_localctx).LEXER_NAME!=null?((Parse_rule_argContext)_localctx).LEXER_NAME.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_rule_callContext extends ParserRuleContext {
		public TerminalNode PARSE_NAME() { return getToken(parserGeneratorParser.PARSE_NAME, 0); }
		public Pass_variablesContext pass_variables() {
			return getRuleContext(Pass_variablesContext.class,0);
		}
		public Parse_rule_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_rule_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_rule_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_rule_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_rule_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_rule_callContext parse_rule_call() throws RecognitionException {
		Parse_rule_callContext _localctx = new Parse_rule_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parse_rule_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(PARSE_NAME);
			setState(76);
			pass_variables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Pass_variablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Pass_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterPass_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitPass_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitPass_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_variablesContext pass_variables() throws RecognitionException {
		Pass_variablesContext _localctx = new Pass_variablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pass_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND) {
				{
				setState(79);
				variable();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(80);
					match(T__4);
					setState(81);
					variable();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_variables_inContext extends ParserRuleContext {
		public List<Init_variable_inContext> init_variable_in() {
			return getRuleContexts(Init_variable_inContext.class);
		}
		public Init_variable_inContext init_variable_in(int i) {
			return getRuleContext(Init_variable_inContext.class,i);
		}
		public Init_variables_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variables_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variables_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variables_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variables_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variables_inContext init_variables_in() throws RecognitionException {
		Init_variables_inContext _localctx = new Init_variables_inContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init_variables_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			in_fields = new ArrayList<>(); 
			setState(92);
			match(T__3);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND) {
				{
				setState(93);
				init_variable_in();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(94);
					match(T__4);
					setState(95);
					init_variable_in();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(103);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_variable_inContext extends ParserRuleContext {
		public TypeContext type;
		public VariableContext variable;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Init_variable_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variable_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variable_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variable_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variable_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variable_inContext init_variable_in() throws RecognitionException {
		Init_variable_inContext _localctx = new Init_variable_inContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_init_variable_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((Init_variable_inContext)_localctx).type = type();
			setState(106);
			((Init_variable_inContext)_localctx).variable = variable();
			in_fields.add(new Variable((((Init_variable_inContext)_localctx).type!=null?_input.getText(((Init_variable_inContext)_localctx).type.start,((Init_variable_inContext)_localctx).type.stop):null), (((Init_variable_inContext)_localctx).variable!=null?_input.getText(((Init_variable_inContext)_localctx).variable.start,((Init_variable_inContext)_localctx).variable.stop):null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_variables_outContext extends ParserRuleContext {
		public List<Init_variable_outContext> init_variable_out() {
			return getRuleContexts(Init_variable_outContext.class);
		}
		public Init_variable_outContext init_variable_out(int i) {
			return getRuleContext(Init_variable_outContext.class,i);
		}
		public Init_variables_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variables_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variables_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variables_out(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variables_out(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variables_outContext init_variables_out() throws RecognitionException {
		Init_variables_outContext _localctx = new Init_variables_outContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init_variables_out);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			out_fields = new ArrayList<>(); 
			setState(110);
			match(T__3);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND) {
				{
				setState(111);
				init_variable_out();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(112);
					match(T__4);
					setState(113);
					init_variable_out();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(121);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_variable_outContext extends ParserRuleContext {
		public TypeContext type;
		public VariableContext variable;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Init_variable_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variable_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variable_out(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variable_out(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variable_out(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variable_outContext init_variable_out() throws RecognitionException {
		Init_variable_outContext _localctx = new Init_variable_outContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init_variable_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((Init_variable_outContext)_localctx).type = type();
			setState(124);
			((Init_variable_outContext)_localctx).variable = variable();
			out_fields.add(new Variable((((Init_variable_outContext)_localctx).type!=null?_input.getText(((Init_variable_outContext)_localctx).type.start,((Init_variable_outContext)_localctx).type.stop):null), (((Init_variable_outContext)_localctx).variable!=null?_input.getText(((Init_variable_outContext)_localctx).variable.start,((Init_variable_outContext)_localctx).variable.stop):null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(parserGeneratorParser.COMMAND, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(parserGeneratorParser.COMMAND, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodeContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(parserGeneratorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(parserGeneratorParser.TEXT, i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					match(TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lexer_ruleContext extends ParserRuleContext {
		public Token LEXER_NAME;
		public Token REGEXP;
		public TerminalNode LEXER_NAME() { return getToken(parserGeneratorParser.LEXER_NAME, 0); }
		public TerminalNode REGEXP() { return getToken(parserGeneratorParser.REGEXP, 0); }
		public Lexer_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterLexer_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitLexer_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitLexer_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_ruleContext lexer_rule() throws RecognitionException {
		Lexer_ruleContext _localctx = new Lexer_ruleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lexer_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((Lexer_ruleContext)_localctx).LEXER_NAME = match(LEXER_NAME);
			setState(137);
			match(T__0);
			setState(138);
			((Lexer_ruleContext)_localctx).REGEXP = match(REGEXP);
			setState(139);
			match(T__2);
			printToLexems(String.format("%s:%s%n", (((Lexer_ruleContext)_localctx).LEXER_NAME!=null?((Lexer_ruleContext)_localctx).LEXER_NAME.getText():null), (((Lexer_ruleContext)_localctx).REGEXP!=null?((Lexer_ruleContext)_localctx).REGEXP.getText():null)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(parserGeneratorParser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(parserGeneratorParser.MUL, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MUL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"2\b\u0002\u000b\u0002\f\u00023\u0001\u0002\u0001\u0002\u0004\u00028\b"+
		"\u0002\u000b\u0002\f\u00029\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0003\u0005X\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t\u0006\u0003\u0006f\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bs\b\b\n\b\f\bv\t\b\u0003"+
		"\bx\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u0085\b\f\u000b\f\f\f\u0086"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u000f\u0010"+
		"\u008f\u0000\u001e\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000"+
		"\u0004+\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bK\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000"+
		"\u000ei\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012{"+
		"\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0081"+
		"\u0001\u0000\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a\u0088"+
		"\u0001\u0000\u0000\u0000\u001c\u008e\u0001\u0000\u0000\u0000\u001e \u0006"+
		"\u0000\uffff\uffff\u0000\u001f!\u0003\u0002\u0001\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#"+
		"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000"+
		"\u0001%&\u0006\u0000\uffff\uffff\u0000&\u0001\u0001\u0000\u0000\u0000"+
		"\'*\u0003\u0004\u0002\u0000(*\u0003\u001a\r\u0000)\'\u0001\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005"+
		"\n\u0000\u0000,-\u0003\f\u0006\u0000-.\u0003\u0010\b\u0000./\u0006\u0002"+
		"\uffff\uffff\u0000/1\u0005\u0001\u0000\u000002\u0003\u0006\u0003\u0000"+
		"10\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004=\u0001\u0000\u0000\u000057\u0005\u0002"+
		"\u0000\u000068\u0003\u0006\u0003\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AB\u0006"+
		"\u0002\uffff\uffff\u0000B\u0005\u0001\u0000\u0000\u0000CJ\u0003\b\u0004"+
		"\u0000DE\u0003\u0018\f\u0000EF\u0006\u0003\uffff\uffff\u0000FJ\u0001\u0000"+
		"\u0000\u0000GH\u0005\u000b\u0000\u0000HJ\u0006\u0003\uffff\uffff\u0000"+
		"IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000J\u0007\u0001\u0000\u0000\u0000KL\u0005\n\u0000\u0000LM\u0003\n"+
		"\u0005\u0000M\t\u0001\u0000\u0000\u0000NW\u0005\u0004\u0000\u0000OT\u0003"+
		"\u0014\n\u0000PQ\u0005\u0005\u0000\u0000QS\u0003\u0014\n\u0000RP\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000"+
		"\u0000WO\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0006\u0000\u0000Z\u000b\u0001\u0000\u0000\u0000"+
		"[\\\u0006\u0006\uffff\uffff\u0000\\e\u0005\u0004\u0000\u0000]b\u0003\u000e"+
		"\u0007\u0000^_\u0005\u0005\u0000\u0000_a\u0003\u000e\u0007\u0000`^\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000e]\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0006\u0000\u0000h\r\u0001\u0000\u0000\u0000ij\u0003"+
		"\u0016\u000b\u0000jk\u0003\u0014\n\u0000kl\u0006\u0007\uffff\uffff\u0000"+
		"l\u000f\u0001\u0000\u0000\u0000mn\u0006\b\uffff\uffff\u0000nw\u0005\u0004"+
		"\u0000\u0000ot\u0003\u0012\t\u0000pq\u0005\u0005\u0000\u0000qs\u0003\u0012"+
		"\t\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wo\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0005\u0006\u0000\u0000z\u0011\u0001\u0000"+
		"\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0003\u0014\n\u0000}~\u0006\t"+
		"\uffff\uffff\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080\u0005\f"+
		"\u0000\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0005\f\u0000"+
		"\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0085\u0005\u0007\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000b\u0000"+
		"\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b\u0005\t\u0000\u0000"+
		"\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u008d\u0006\r\uffff\uffff\u0000"+
		"\u008d\u001b\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000"+
		"\u008f\u001d\u0001\u0000\u0000\u0000\r\")39=ITWbetw\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}