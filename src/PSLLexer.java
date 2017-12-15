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
		FINISH=10, ORDER=11, DERIVATIVE=12, PRINT=13, PRINT_BOOLEAN=14, REPEAT=15, 
		FUNCTION=16, RETURN=17, IDENTIFIER=18, INTEGER=19, X=20, POWER=21, ADD_OP=22, 
		MUL_OP=23, COMMAND_END=24, NEWLINE=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", 
		"FINISH", "ORDER", "DERIVATIVE", "PRINT", "PRINT_BOOLEAN", "REPEAT", "FUNCTION", 
		"RETURN", "IDENTIFIER", "INTEGER", "X", "POWER", "ADD_OP", "MUL_OP", "COMMAND_END", 
		"NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0095\n\23\f\23\16\23\u0098\13\23"+
		"\3\24\6\24\u009b\n\24\r\24\16\24\u009c\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\5\32\u00ad\n\32\3\32\3\32\3\32"+
		"\3\32\3\33\6\33\u00b4\n\33\r\33\16\33\u00b5\3\33\3\33\2\2\34\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\6\6\2CY[\\cy{|\5\2"+
		"\62;C\\c|\3\2\62;\4\2\13\13\"\"\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\3\67\3\2\2\2\5:\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC"+
		"\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25O\3\2\2\2\27V\3\2\2\2\31"+
		"\\\3\2\2\2\33g\3\2\2\2\35m\3\2\2\2\37{\3\2\2\2!\u0082\3\2\2\2#\u008b\3"+
		"\2\2\2%\u0092\3\2\2\2\'\u009a\3\2\2\2)\u009e\3\2\2\2+\u00a0\3\2\2\2-\u00a2"+
		"\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63\u00ac\3\2\2\2\65\u00b3\3\2"+
		"\2\2\678\7?\2\289\7#\2\29\4\3\2\2\2:;\7/\2\2;<\7@\2\2<\6\3\2\2\2=>\7*"+
		"\2\2>\b\3\2\2\2?@\7+\2\2@\n\3\2\2\2AB\7<\2\2B\f\3\2\2\2CD\7-\2\2D\16\3"+
		"\2\2\2EF\7.\2\2F\20\3\2\2\2GH\7/\2\2H\22\3\2\2\2IJ\7U\2\2JK\7V\2\2KL\7"+
		"C\2\2LM\7T\2\2MN\7V\2\2N\24\3\2\2\2OP\7H\2\2PQ\7K\2\2QR\7P\2\2RS\7K\2"+
		"\2ST\7U\2\2TU\7J\2\2U\26\3\2\2\2VW\7Q\2\2WX\7T\2\2XY\7F\2\2YZ\7G\2\2Z"+
		"[\7T\2\2[\30\3\2\2\2\\]\7F\2\2]^\7G\2\2^_\7T\2\2_`\7K\2\2`a\7X\2\2ab\7"+
		"C\2\2bc\7V\2\2cd\7K\2\2de\7X\2\2ef\7G\2\2f\32\3\2\2\2gh\7R\2\2hi\7T\2"+
		"\2ij\7K\2\2jk\7P\2\2kl\7V\2\2l\34\3\2\2\2mn\7R\2\2no\7T\2\2op\7K\2\2p"+
		"q\7P\2\2qr\7V\2\2rs\7a\2\2st\7D\2\2tu\7Q\2\2uv\7Q\2\2vw\7N\2\2wx\7G\2"+
		"\2xy\7C\2\2yz\7P\2\2z\36\3\2\2\2{|\7T\2\2|}\7G\2\2}~\7R\2\2~\177\7G\2"+
		"\2\177\u0080\7C\2\2\u0080\u0081\7V\2\2\u0081 \3\2\2\2\u0082\u0083\7H\2"+
		"\2\u0083\u0084\7W\2\2\u0084\u0085\7P\2\2\u0085\u0086\7E\2\2\u0086\u0087"+
		"\7V\2\2\u0087\u0088\7K\2\2\u0088\u0089\7Q\2\2\u0089\u008a\7P\2\2\u008a"+
		"\"\3\2\2\2\u008b\u008c\7T\2\2\u008c\u008d\7G\2\2\u008d\u008e\7V\2\2\u008e"+
		"\u008f\7W\2\2\u008f\u0090\7T\2\2\u0090\u0091\7P\2\2\u0091$\3\2\2\2\u0092"+
		"\u0096\t\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097&\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009b\t\4\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d(\3\2\2\2\u009e\u009f\7z\2\2\u009f"+
		"*\3\2\2\2\u00a0\u00a1\7`\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7-\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7#\2\2\u00a7\60"+
		"\3\2\2\2\u00a8\u00a9\7=\2\2\u00a9\u00aa\7+\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ad\7\17\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\32\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\b\33\2\2\u00b8\66\3\2\2\2\7\2\u0096\u009c\u00ac\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}