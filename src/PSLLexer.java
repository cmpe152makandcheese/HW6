// Generated from PSL.g4 by ANTLR 4.4

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, START=9, 
		FINISH=10, ORDER=11, DERIVATIVE=12, IDENTIFIER=13, INTEGER=14, X=15, POWER=16, 
		ADD_OP=17, MUL_OP=18, NEWLINE=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", 
		"FINISH", "ORDER", "DERIVATIVE", "IDENTIFIER", "INTEGER", "X", "POWER", 
		"ADD_OP", "MUL_OP", "NEWLINE", "WS"
	};


	public PSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16_\n\16\f\16\16\16b\13\16\3"+
		"\17\6\17e\n\17\r\17\16\17f\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\5\24t\n\24\3\24\3\24\3\24\3\24\3\25\6\25{\n\25\r\25\16\25|"+
		"\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\6\2CY[\\cy{|\5\2\62;"+
		"C\\c|\3\2\62;\4\2\13\13\"\"\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\3+\3\2\2\2\5-\3\2\2\2\7\60\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23>\3\2\2\2\25D\3\2\2\2\27K\3\2\2\2\31"+
		"Q\3\2\2\2\33\\\3\2\2\2\35d\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#l\3\2\2\2%o\3"+
		"\2\2\2\'s\3\2\2\2)z\3\2\2\2+,\7B\2\2,\4\3\2\2\2-.\7?\2\2./\7#\2\2/\6\3"+
		"\2\2\2\60\61\7/\2\2\61\62\7@\2\2\62\b\3\2\2\2\63\64\7*\2\2\64\n\3\2\2"+
		"\2\65\66\7+\2\2\66\f\3\2\2\2\678\7-\2\28\16\3\2\2\29:\7/\2\2:\20\3\2\2"+
		"\2;<\7=\2\2<=\7+\2\2=\22\3\2\2\2>?\7U\2\2?@\7V\2\2@A\7C\2\2AB\7T\2\2B"+
		"C\7V\2\2C\24\3\2\2\2DE\7H\2\2EF\7K\2\2FG\7P\2\2GH\7K\2\2HI\7U\2\2IJ\7"+
		"J\2\2J\26\3\2\2\2KL\7Q\2\2LM\7T\2\2MN\7F\2\2NO\7G\2\2OP\7T\2\2P\30\3\2"+
		"\2\2QR\7F\2\2RS\7G\2\2ST\7T\2\2TU\7K\2\2UV\7X\2\2VW\7C\2\2WX\7V\2\2XY"+
		"\7K\2\2YZ\7X\2\2Z[\7G\2\2[\32\3\2\2\2\\`\t\2\2\2]_\t\3\2\2^]\3\2\2\2_"+
		"b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\34\3\2\2\2b`\3\2\2\2ce\t\4\2\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\36\3\2\2\2hi\7z\2\2i \3\2\2\2jk\7`\2"+
		"\2k\"\3\2\2\2lm\7-\2\2mn\7#\2\2n$\3\2\2\2op\7,\2\2pq\7#\2\2q&\3\2\2\2"+
		"rt\7\17\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2\2vw\3\2\2\2wx\b\24\2"+
		"\2x(\3\2\2\2y{\t\5\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\177\b\25\2\2\177*\3\2\2\2\7\2`fs|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}