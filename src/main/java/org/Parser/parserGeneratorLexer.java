// Generated from /Users/kamilsalakhov/Desktop/5sem/MT/parser-generator/src/main/antlr4/org/parserGenerator.g4 by ANTLR 4.13.1

package org.Parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		QUOT=10, REGEXP=11, PARSE_NAME=12, LEXER_NAME=13, COMMAND=14, COMMENT=15, 
		STRING=16, PLUS=17, MUL=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"QUOT", "REGEXP", "PARSE_NAME", "LEXER_NAME", "COMMAND", "COMMENT", "STRING", 
			"PLUS", "MUL", "WS"
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


	    public void printToLexems(String str) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Lexemes.txt", true))) {
	            writer.write(str);
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
		"\u0004\u0000\u0013t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n>\b\n\n\n\f\nA\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bG\b\u000b\n\u000b\f\u000b"+
		"J\t\u000b\u0001\f\u0001\f\u0005\fN\b\f\n\f\f\fQ\t\f\u0001\r\u0001\r\u0004"+
		"\rU\b\r\u000b\r\f\rV\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e]\b\u000e\n\u000e\f\u000e`\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012o\b"+
		"\u0012\u000b\u0012\f\u0012p\u0001\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0007\u0001"+
		"\u0000]]\u0001\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u0000\n"+
		"\n\u0001\u0000\'\'\u0003\u0000\t\n\r\r  y\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000"+
		"\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001"+
		"\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000"+
		"\u0000\u00117\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000\u0000\u0015"+
		";\u0001\u0000\u0000\u0000\u0017D\u0001\u0000\u0000\u0000\u0019K\u0001"+
		"\u0000\u0000\u0000\u001bR\u0001\u0000\u0000\u0000\u001dX\u0001\u0000\u0000"+
		"\u0000\u001fe\u0001\u0000\u0000\u0000!i\u0001\u0000\u0000\u0000#k\u0001"+
		"\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000\'(\u0005:\u0000\u0000(\u0002"+
		"\u0001\u0000\u0000\u0000)*\u0005;\u0000\u0000*\u0004\u0001\u0000\u0000"+
		"\u0000+,\u0005|\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005(\u0000"+
		"\u0000.\b\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\n\u0001\u0000"+
		"\u0000\u000012\u0005{\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005,"+
		"\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005}\u0000\u00006\u0010"+
		"\u0001\u0000\u0000\u000078\u0005$\u0000\u00008\u0012\u0001\u0000\u0000"+
		"\u00009:\u0005\'\u0000\u0000:\u0014\u0001\u0000\u0000\u0000;?\u0005[\u0000"+
		"\u0000<>\b\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005]\u0000\u0000C\u0016\u0001"+
		"\u0000\u0000\u0000DH\u0007\u0001\u0000\u0000EG\u0007\u0002\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\u0018\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KO\u0007\u0003\u0000\u0000LN\u0007\u0002\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RT\u0005$\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u001c\u0001\u0000\u0000\u0000XY\u0005/\u0000"+
		"\u0000YZ\u0005/\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\b\u0004\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000ab\u0005\n\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0006"+
		"\u000e\u0000\u0000d\u001e\u0001\u0000\u0000\u0000ef\u0003\u0013\t\u0000"+
		"fg\b\u0005\u0000\u0000gh\u0003\u0013\t\u0000h \u0001\u0000\u0000\u0000"+
		"ij\u0005+\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000"+
		"l$\u0001\u0000\u0000\u0000mo\u0007\u0006\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u0012\u0000\u0000s&\u0001"+
		"\u0000\u0000\u0000\u0007\u0000?HOV^p\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}