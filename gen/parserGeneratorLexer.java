// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org.example/parserGenerator.g4 by ANTLR 4.13.1

package org.example;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, QUOT=6, PARSE_NAME=7, LEXER_NAME=8, 
		COMMENT=9, STRING=10, PLUS=11, MUL=12, ID=13, INT=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "QUOT", "PARSE_NAME", "LEXER_NAME", 
			"COMMENT", "STRING", "PLUS", "MUL", "ID", "INT", "WS"
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
		"\u0004\u0000\u000f_\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0005\u0006.\b\u0006\n\u0006\f\u00061\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0005\u00075\b\u0007\n\u0007\f\u00078\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b>\b\b\n\b\f\bA\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fP\b\f\u000b\f\f\fQ\u0001\r\u0004\rU\b\r\u000b"+
		"\r\f\rV\u0001\u000e\u0004\u000eZ\b\u000e\u000b\u000e\f\u000e[\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\b\u0001\u0000az\u0004"+
		"\u000009AZ__az\u0001\u0000AZ\u0001\u0000\n\n\u0001\u0000\'\'\u0002\u0000"+
		"AZaz\u0001\u000009\u0003\u0000\t\n\r\r  d\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001"+
		"\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000"+
		"\u0000\u000b)\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f"+
		"2\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013F\u0001"+
		"\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000"+
		"\u0000\u0019O\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001d"+
		"Y\u0001\u0000\u0000\u0000\u001f \u0005:\u0000\u0000 \u0002\u0001\u0000"+
		"\u0000\u0000!\"\u0005;\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005"+
		"|\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\b\u0001"+
		"\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\n\u0001\u0000\u0000\u0000)*"+
		"\u0005\'\u0000\u0000*\f\u0001\u0000\u0000\u0000+/\u0007\u0000\u0000\u0000"+
		",.\u0007\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u000e\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000026\u0007\u0002\u0000\u0000"+
		"35\u0007\u0001\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0010\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005/\u0000\u0000:;\u0005"+
		"/\u0000\u0000;?\u0001\u0000\u0000\u0000<>\b\u0003\u0000\u0000=<\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0005\n\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0006\b\u0000"+
		"\u0000E\u0012\u0001\u0000\u0000\u0000FG\u0003\u000b\u0005\u0000GH\b\u0004"+
		"\u0000\u0000HI\u0003\u000b\u0005\u0000I\u0014\u0001\u0000\u0000\u0000"+
		"JK\u0005+\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LM\u0005*\u0000\u0000"+
		"M\u0018\u0001\u0000\u0000\u0000NP\u0007\u0005\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u001a\u0001\u0000\u0000\u0000SU\u0007\u0006\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\u001c\u0001\u0000\u0000\u0000"+
		"XZ\u0007\u0007\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0006\u000e\u0000\u0000^\u001e\u0001\u0000\u0000\u0000"+
		"\u0007\u0000/6?QV[\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}