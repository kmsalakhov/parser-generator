// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org.example/parserGenerator.g4 by ANTLR 4.13.1

package org.example;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, QUOT=6, PARSE_NAME=7, LEXER_NAME=8, 
		COMMENT=9, STRING=10, PLUS=11, MUL=12, ID=13, INT=14, WS=15;
	public static final int
		RULE_grm = 0, RULE_rule = 1, RULE_parse_rule = 2, RULE_parse_expression = 3, 
		RULE_parse_factor = 4, RULE_parse_primitive = 5, RULE_lexer_rule = 6, 
		RULE_lexer_expression = 7, RULE_lexer_factor = 8, RULE_lexer_primitive = 9, 
		RULE_operation = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"grm", "rule", "parse_rule", "parse_expression", "parse_factor", "parse_primitive", 
			"lexer_rule", "lexer_expression", "lexer_factor", "lexer_primitive", 
			"operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'|'", "'('", "')'", "'''", null, null, null, null, 
			"'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "QUOT", "PARSE_NAME", "LEXER_NAME", 
			"COMMENT", "STRING", "PLUS", "MUL", "ID", "INT", "WS"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				rule_();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARSE_NAME || _la==LEXER_NAME );
			setState(27);
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
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				parse_rule();
				}
				break;
			case LEXER_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(PARSE_NAME);
			setState(34);
			match(T__0);
			setState(35);
			parse_expression();
			setState(36);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				parse_factor(0);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1424L) != 0) );
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(43);
				match(T__2);
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(44);
					parse_factor(0);
					}
					}
					setState(47); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1424L) != 0) );
				}
				}
				setState(53);
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
		public Parse_primitiveContext parse_primitive() {
			return getRuleContext(Parse_primitiveContext.class,0);
		}
		public Parse_expressionContext parse_expression() {
			return getRuleContext(Parse_expressionContext.class,0);
		}
		public Parse_factorContext parse_factor() {
			return getRuleContext(Parse_factorContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		return parse_factor(0);
	}

	private Parse_factorContext parse_factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parse_factorContext _localctx = new Parse_factorContext(_ctx, _parentState);
		Parse_factorContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_parse_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARSE_NAME:
			case LEXER_NAME:
			case STRING:
				{
				setState(55);
				parse_primitive();
				}
				break;
			case T__3:
				{
				setState(56);
				match(T__3);
				setState(57);
				parse_expression();
				setState(58);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parse_factorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parse_factor);
					setState(62);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(63);
					operation();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 10, RULE_parse_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1408L) != 0)) ) {
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
	public static class Lexer_ruleContext extends ParserRuleContext {
		public TerminalNode LEXER_NAME() { return getToken(parserGeneratorParser.LEXER_NAME, 0); }
		public Lexer_expressionContext lexer_expression() {
			return getRuleContext(Lexer_expressionContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_lexer_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LEXER_NAME);
			setState(72);
			match(T__0);
			setState(73);
			lexer_expression();
			setState(74);
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
	public static class Lexer_expressionContext extends ParserRuleContext {
		public List<Lexer_factorContext> lexer_factor() {
			return getRuleContexts(Lexer_factorContext.class);
		}
		public Lexer_factorContext lexer_factor(int i) {
			return getRuleContext(Lexer_factorContext.class,i);
		}
		public Lexer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterLexer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitLexer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitLexer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_expressionContext lexer_expression() throws RecognitionException {
		Lexer_expressionContext _localctx = new Lexer_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexer_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				lexer_factor(0);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1296L) != 0) );
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(81);
				match(T__2);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					lexer_factor(0);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1296L) != 0) );
				}
				}
				setState(91);
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
	public static class Lexer_factorContext extends ParserRuleContext {
		public Lexer_primitiveContext lexer_primitive() {
			return getRuleContext(Lexer_primitiveContext.class,0);
		}
		public Lexer_expressionContext lexer_expression() {
			return getRuleContext(Lexer_expressionContext.class,0);
		}
		public Lexer_factorContext lexer_factor() {
			return getRuleContext(Lexer_factorContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Lexer_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterLexer_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitLexer_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitLexer_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_factorContext lexer_factor() throws RecognitionException {
		return lexer_factor(0);
	}

	private Lexer_factorContext lexer_factor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lexer_factorContext _localctx = new Lexer_factorContext(_ctx, _parentState);
		Lexer_factorContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_lexer_factor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEXER_NAME:
			case STRING:
				{
				setState(93);
				lexer_primitive();
				}
				break;
			case T__3:
				{
				setState(94);
				match(T__3);
				setState(95);
				lexer_expression();
				setState(96);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lexer_factorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lexer_factor);
					setState(100);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(101);
					operation();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class Lexer_primitiveContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(parserGeneratorParser.STRING, 0); }
		public TerminalNode LEXER_NAME() { return getToken(parserGeneratorParser.LEXER_NAME, 0); }
		public Lexer_primitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexer_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).enterLexer_primitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserGeneratorListener ) ((parserGeneratorListener)listener).exitLexer_primitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserGeneratorVisitor ) return ((parserGeneratorVisitor<? extends T>)visitor).visitLexer_primitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lexer_primitiveContext lexer_primitive() throws RecognitionException {
		Lexer_primitiveContext _localctx = new Lexer_primitiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lexer_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==LEXER_NAME || _la==STRING) ) {
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
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return parse_factor_sempred((Parse_factorContext)_localctx, predIndex);
		case 8:
			return lexer_factor_sempred((Lexer_factorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean parse_factor_sempred(Parse_factorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lexer_factor_sempred(Lexer_factorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fp\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003(\b\u0003\u000b\u0003"+
		"\f\u0003)\u0001\u0003\u0001\u0003\u0004\u0003.\b\u0003\u000b\u0003\f\u0003"+
		"/\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004A\b\u0004\n\u0004\f\u0004D\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007N\b\u0007\u000b\u0007\f\u0007O\u0001"+
		"\u0007\u0001\u0007\u0004\u0007T\b\u0007\u000b\u0007\f\u0007U\u0005\u0007"+
		"X\b\u0007\n\u0007\f\u0007[\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0005\bg\b\b\n\b\f\bj\t\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0002\b\u0010\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003\u0002\u0000\u0007"+
		"\b\n\n\u0002\u0000\b\b\n\n\u0001\u0000\u000b\fp\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nE\u0001"+
		"\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000eM\u0001\u0000\u0000"+
		"\u0000\u0010b\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014"+
		"m\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001"+
		"\u0001\u0000\u0000\u0000\u001d \u0003\u0004\u0002\u0000\u001e \u0003\f"+
		"\u0006\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005\u0007\u0000\u0000"+
		"\"#\u0005\u0001\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u0002\u0000"+
		"\u0000%\u0005\u0001\u0000\u0000\u0000&(\u0003\b\u0004\u0000\'&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*3\u0001\u0000\u0000\u0000+-\u0005\u0003\u0000\u0000"+
		",.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000"+
		"\u00001+\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000067\u0006\u0004\uffff\uffff\u00007=\u0003\n\u0005"+
		"\u000089\u0005\u0004\u0000\u00009:\u0003\u0006\u0003\u0000:;\u0005\u0005"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<8\u0001"+
		"\u0000\u0000\u0000=B\u0001\u0000\u0000\u0000>?\n\u0001\u0000\u0000?A\u0003"+
		"\u0014\n\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\u000b\u0001\u0000"+
		"\u0000\u0000GH\u0005\b\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0003\u000e"+
		"\u0007\u0000JK\u0005\u0002\u0000\u0000K\r\u0001\u0000\u0000\u0000LN\u0003"+
		"\u0010\b\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000"+
		"QS\u0005\u0003\u0000\u0000RT\u0003\u0010\b\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u000f"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0006\b\uffff\uffff"+
		"\u0000]c\u0003\u0012\t\u0000^_\u0005\u0004\u0000\u0000_`\u0003\u000e\u0007"+
		"\u0000`a\u0005\u0005\u0000\u0000ac\u0001\u0000\u0000\u0000b\\\u0001\u0000"+
		"\u0000\u0000b^\u0001\u0000\u0000\u0000ch\u0001\u0000\u0000\u0000de\n\u0001"+
		"\u0000\u0000eg\u0003\u0014\n\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0011"+
		"\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0007\u0001\u0000"+
		"\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0007\u0002\u0000\u0000n\u0015"+
		"\u0001\u0000\u0000\u0000\f\u0019\u001f)/3<BOUYbh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}