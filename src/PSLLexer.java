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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, START=8, FINISH=9, 
		ORDER=10, DERIVATIVE=11, PRINT=12, IDENTIFIER=13, INTEGER=14, X=15, POWER=16, 
		ADD_OP=17, MUL_OP=18, COMMAND_END=19, NEWLINE=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", "FINISH", 
		"ORDER", "DERIVATIVE", "PRINT", "IDENTIFIER", "INTEGER", "X", "POWER", 
		"ADD_OP", "MUL_OP", "COMMAND_END", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16d\n\16"+
		"\f\16\16\16g\13\16\3\17\6\17j\n\17\r\17\16\17k\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\5\25|\n\25\3\25\3\25\3\25"+
		"\3\25\3\26\6\26\u0083\n\26\r\26\16\26\u0084\3\26\3\26\2\2\27\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27\3\2\6\6\2CY[\\cy{|\5\2\62;C\\c|\3\2\62;\4\2\13\13"+
		"\"\"\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5/\3\2\2\2\7\62\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2"+
		"\2\2\21=\3\2\2\2\23C\3\2\2\2\25J\3\2\2\2\27P\3\2\2\2\31[\3\2\2\2\33a\3"+
		"\2\2\2\35i\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2\'w\3\2\2"+
		"\2){\3\2\2\2+\u0082\3\2\2\2-.\7B\2\2.\4\3\2\2\2/\60\7?\2\2\60\61\7#\2"+
		"\2\61\6\3\2\2\2\62\63\7/\2\2\63\64\7@\2\2\64\b\3\2\2\2\65\66\7*\2\2\66"+
		"\n\3\2\2\2\678\7+\2\28\f\3\2\2\29:\7-\2\2:\16\3\2\2\2;<\7/\2\2<\20\3\2"+
		"\2\2=>\7U\2\2>?\7V\2\2?@\7C\2\2@A\7T\2\2AB\7V\2\2B\22\3\2\2\2CD\7H\2\2"+
		"DE\7K\2\2EF\7P\2\2FG\7K\2\2GH\7U\2\2HI\7J\2\2I\24\3\2\2\2JK\7Q\2\2KL\7"+
		"T\2\2LM\7F\2\2MN\7G\2\2NO\7T\2\2O\26\3\2\2\2PQ\7F\2\2QR\7G\2\2RS\7T\2"+
		"\2ST\7K\2\2TU\7X\2\2UV\7C\2\2VW\7V\2\2WX\7K\2\2XY\7X\2\2YZ\7G\2\2Z\30"+
		"\3\2\2\2[\\\7R\2\2\\]\7T\2\2]^\7K\2\2^_\7P\2\2_`\7V\2\2`\32\3\2\2\2ae"+
		"\t\2\2\2bd\t\3\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\34\3\2\2\2"+
		"ge\3\2\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\36\3\2\2"+
		"\2mn\7z\2\2n \3\2\2\2op\7`\2\2p\"\3\2\2\2qr\7-\2\2rs\7#\2\2s$\3\2\2\2"+
		"tu\7,\2\2uv\7#\2\2v&\3\2\2\2wx\7=\2\2xy\7+\2\2y(\3\2\2\2z|\7\17\2\2{z"+
		"\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\f\2\2~\177\3\2\2\2\177\u0080\b\25\2\2"+
		"\u0080*\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\b\26\2\2\u0087,\3\2\2\2\7\2ek{\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}