// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOT=10, REGEXP=11, PARSE_NAME=12, LEXER_NAME=13, COMMAND=14, COMMENT=15, 
		STRING=16, PLUS=17, MUL=18, WS=19;
	public static final int
		RULE_grm = 0, RULE_rule = 1, RULE_parse_rule = 2, RULE_parse_expression = 3, 
		RULE_parse_factor = 4, RULE_parse_atom = 5, RULE_parse_primitive = 6, 
		RULE_init_variables = 7, RULE_init_variable = 8, RULE_variable = 9, RULE_type = 10, 
		RULE_code = 11, RULE_text = 12, RULE_lexer_rule = 13, RULE_operation = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"grm", "rule", "parse_rule", "parse_expression", "parse_factor", "parse_atom", 
			"parse_primitive", "init_variables", "init_variable", "variable", "type", 
			"code", "text", "lexer_rule", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'|'", "'('", "')'", "'{'", "','", "'}'", "'$'", 
			"'''", null, null, null, null, null, null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "QUOT", "REGEXP", 
			"PARSE_NAME", "LEXER_NAME", "COMMAND", "COMMENT", "STRING", "PLUS", "MUL", 
			"WS"
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


	    public void printToLexems(String str) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Lexemes.txt", true))) {
	            writer.write(str);
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				rule_();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARSE_NAME || _la==LEXER_NAME );
			setState(35);
			match(EOF);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				parse_rule();
				}
				break;
			case LEXER_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
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
		public TerminalNode PARSE_NAME() { return getToken(parserGeneratorParser.PARSE_NAME, 0); }
		public Parse_expressionContext parse_expression() {
			return getRuleContext(Parse_expressionContext.class,0);
		}
		public List<Init_variablesContext> init_variables() {
			return getRuleContexts(Init_variablesContext.class);
		}
		public Init_variablesContext init_variables(int i) {
			return getRuleContext(Init_variablesContext.class,i);
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
			setState(41);
			match(PARSE_NAME);
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				init_variables();
				}
				break;
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(45);
				init_variables();
				}
			}

			setState(48);
			match(T__0);
			setState(49);
			parse_expression();
			setState(50);
			match(T__1);
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
	public static class Parse_expressionContext extends ParserRuleContext {
		public List<Parse_factorContext> parse_factor() {
			return getRuleContexts(Parse_factorContext.class);
		}
		public Parse_factorContext parse_factor(int i) {
			return getRuleContext(Parse_factorContext.class,i);
		}
		public Parse_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_expressionContext parse_expression() throws RecognitionException {
		Parse_expressionContext _localctx = new Parse_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parse_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				parse_factor();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 77904L) != 0) );
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(57);
				match(T__2);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					parse_factor();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 77904L) != 0) );
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_factorContext extends ParserRuleContext {
		public Parse_atomContext parse_atom() {
			return getRuleContext(Parse_atomContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public Parse_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_factorContext parse_factor() throws RecognitionException {
		Parse_factorContext _localctx = new Parse_factorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parse_factor);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case PARSE_NAME:
			case LEXER_NAME:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				parse_atom(0);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				code();
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
	public static class Parse_atomContext extends ParserRuleContext {
		public Parse_primitiveContext parse_primitive() {
			return getRuleContext(Parse_primitiveContext.class,0);
		}
		public Parse_expressionContext parse_expression() {
			return getRuleContext(Parse_expressionContext.class,0);
		}
		public Parse_atomContext parse_atom() {
			return getRuleContext(Parse_atomContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Parse_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_atomContext parse_atom() throws RecognitionException {
		return parse_atom(0);
	}

	private Parse_atomContext parse_atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parse_atomContext _localctx = new Parse_atomContext(_ctx, _parentState);
		Parse_atomContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_parse_atom, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
			case LEXER_NAME:
			case STRING:
				{
				setState(73);
				parse_primitive();
				}
				break;
			case T__3:
				{
				setState(74);
				match(T__3);
				setState(75);
				parse_expression();
				setState(76);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parse_atomContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parse_atom);
					setState(80);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(81);
					operation();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parse_primitiveContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserGeneratorParser.STRING, 0); }
		public TerminalNode LEXER_NAME() { return getToken(parserGeneratorParser.LEXER_NAME, 0); }
		public TerminalNode PARSE_NAME() { return getToken(parserGeneratorParser.PARSE_NAME, 0); }
		public Parse_primitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterParse_primitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitParse_primitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitParse_primitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parse_primitiveContext parse_primitive() throws RecognitionException {
		Parse_primitiveContext _localctx = new Parse_primitiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parse_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 77824L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Init_variablesContext extends ParserRuleContext {
		public List<Init_variableContext> init_variable() {
			return getRuleContexts(Init_variableContext.class);
		}
		public Init_variableContext init_variable(int i) {
			return getRuleContext(Init_variableContext.class,i);
		}
		public Init_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variablesContext init_variables() throws RecognitionException {
		Init_variablesContext _localctx = new Init_variablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_init_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__5);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAND) {
				{
				setState(90);
				init_variable();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(91);
					match(T__6);
					{
					setState(92);
					init_variable();
					}
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(T__7);
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
	public static class Init_variableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Init_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterInit_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitInit_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitInit_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_variableContext init_variable() throws RecognitionException {
		Init_variableContext _localctx = new Init_variableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_init_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			variable();
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
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
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
		enterRule(_localctx, 22, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__5);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1047806L) != 0)) {
				{
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(110);
					variable();
					}
					break;
				case 2:
					{
					setState(111);
					text();
					}
					break;
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__7);
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
	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__7 || _la==T__8) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(124);
			((Lexer_ruleContext)_localctx).LEXER_NAME = match(LEXER_NAME);
			setState(125);
			match(T__0);
			setState(126);
			((Lexer_ruleContext)_localctx).REGEXP = match(REGEXP);
			setState(127);
			match(T__1);
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
			setState(130);
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


	private boolean parse_atom_sempred(Parse_atomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004"+
		"\u0000 \b\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		",\b\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003\f\u0003"+
		"7\u0001\u0003\u0001\u0003\u0004\u0003<\b\u0003\u000b\u0003\f\u0003=\u0005"+
		"\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007^\b\u0007\n\u0007"+
		"\f\u0007a\t\u0007\u0003\u0007c\b\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000bq\b\u000b\n\u000b\f\u000bt\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fy\b\f\u000b\f\f\fz\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0001"+
		"\n\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0003\u0002\u0000\f\r\u0010\u0010\u0001\u0000\b\t\u0001"+
		"\u0000\u0011\u0012\u0084\u0000\u001f\u0001\u0000\u0000\u0000\u0002\'\u0001"+
		"\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\bF\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fW\u0001"+
		"\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012i\u0001\u0000\u0000\u0000\u0014k\u0001\u0000\u0000\u0000\u0016"+
		"m\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a|\u0001"+
		"\u0000\u0000\u0000\u001c\u0082\u0001\u0000\u0000\u0000\u001e \u0003\u0002"+
		"\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000"+
		"%(\u0003\u0004\u0002\u0000&(\u0003\u001a\r\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)+\u0005"+
		"\f\u0000\u0000*,\u0003\u000e\u0007\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-/\u0003\u000e\u0007\u0000"+
		".-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u000001\u0005\u0001\u0000\u000012\u0003\u0006\u0003\u000023\u0005\u0002"+
		"\u0000\u00003\u0005\u0001\u0000\u0000\u000046\u0003\b\u0004\u000054\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008A\u0001\u0000\u0000\u00009;\u0005\u0003\u0000"+
		"\u0000:<\u0003\b\u0004\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?9\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000DG\u0003\n\u0005\u0000EG\u0003\u0016\u000b"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\t\u0001\u0000"+
		"\u0000\u0000HI\u0006\u0005\uffff\uffff\u0000IO\u0003\f\u0006\u0000JK\u0005"+
		"\u0004\u0000\u0000KL\u0003\u0006\u0003\u0000LM\u0005\u0005\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000"+
		"\u0000OT\u0001\u0000\u0000\u0000PQ\n\u0001\u0000\u0000QS\u0003\u001c\u000e"+
		"\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u000b\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0007\u0000\u0000\u0000X\r\u0001\u0000\u0000"+
		"\u0000Yb\u0005\u0006\u0000\u0000Z_\u0003\u0010\b\u0000[\\\u0005\u0007"+
		"\u0000\u0000\\^\u0003\u0010\b\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bZ\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0005\b\u0000"+
		"\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0003\u0014\n\u0000gh\u0003\u0012"+
		"\t\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\u000e\u0000\u0000j\u0013"+
		"\u0001\u0000\u0000\u0000kl\u0005\u000e\u0000\u0000l\u0015\u0001\u0000"+
		"\u0000\u0000mr\u0005\u0006\u0000\u0000nq\u0003\u0012\t\u0000oq\u0003\u0018"+
		"\f\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\b\u0000\u0000v\u0017"+
		"\u0001\u0000\u0000\u0000wy\b\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0019\u0001\u0000\u0000\u0000|}\u0005\r\u0000\u0000}~\u0005\u0001"+
		"\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0006\r\uffff\uffff\u0000\u0081\u001b\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0007\u0002\u0000\u0000\u0083\u001d\u0001\u0000\u0000"+
		"\u0000\u000f!\'+.7=AFNT_bprz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}