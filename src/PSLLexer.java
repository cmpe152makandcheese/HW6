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
		IDENTIFIER=16, INTEGER=17, X=18, POWER=19, ADD_OP=20, MUL_OP=21, COMMAND_END=22, 
		NEWLINE=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", 
		"FINISH", "ORDER", "DERIVATIVE", "PRINT", "PRINT_BOOLEAN", "REPEAT", "IDENTIFIER", 
		"INTEGER", "X", "POWER", "ADD_OP", "MUL_OP", "COMMAND_END", "NEWLINE", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\7\21\u0081\n\21\f\21\16\21\u0084\13\21\3\22\6\22\u0087\n\22\r\22\16\22"+
		"\u0088\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\5\30\u0099\n\30\3\30\3\30\3\30\3\30\3\31\6\31\u00a0\n\31\r\31\16"+
		"\31\u00a1\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\3\2\6\6\2CY[\\cy{|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\u00a8\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\5\66\3\2\2\2\79\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\r?\3"+
		"\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25K\3\2\2\2\27R\3\2\2\2\31"+
		"X\3\2\2\2\33c\3\2\2\2\35i\3\2\2\2\37w\3\2\2\2!~\3\2\2\2#\u0086\3\2\2\2"+
		"%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094\3"+
		"\2\2\2/\u0098\3\2\2\2\61\u009f\3\2\2\2\63\64\7?\2\2\64\65\7#\2\2\65\4"+
		"\3\2\2\2\66\67\7/\2\2\678\7@\2\28\6\3\2\2\29:\7*\2\2:\b\3\2\2\2;<\7+\2"+
		"\2<\n\3\2\2\2=>\7<\2\2>\f\3\2\2\2?@\7-\2\2@\16\3\2\2\2AB\7.\2\2B\20\3"+
		"\2\2\2CD\7/\2\2D\22\3\2\2\2EF\7U\2\2FG\7V\2\2GH\7C\2\2HI\7T\2\2IJ\7V\2"+
		"\2J\24\3\2\2\2KL\7H\2\2LM\7K\2\2MN\7P\2\2NO\7K\2\2OP\7U\2\2PQ\7J\2\2Q"+
		"\26\3\2\2\2RS\7Q\2\2ST\7T\2\2TU\7F\2\2UV\7G\2\2VW\7T\2\2W\30\3\2\2\2X"+
		"Y\7F\2\2YZ\7G\2\2Z[\7T\2\2[\\\7K\2\2\\]\7X\2\2]^\7C\2\2^_\7V\2\2_`\7K"+
		"\2\2`a\7X\2\2ab\7G\2\2b\32\3\2\2\2cd\7R\2\2de\7T\2\2ef\7K\2\2fg\7P\2\2"+
		"gh\7V\2\2h\34\3\2\2\2ij\7R\2\2jk\7T\2\2kl\7K\2\2lm\7P\2\2mn\7V\2\2no\7"+
		"a\2\2op\7D\2\2pq\7Q\2\2qr\7Q\2\2rs\7N\2\2st\7G\2\2tu\7C\2\2uv\7P\2\2v"+
		"\36\3\2\2\2wx\7T\2\2xy\7G\2\2yz\7R\2\2z{\7G\2\2{|\7C\2\2|}\7V\2\2} \3"+
		"\2\2\2~\u0082\t\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089$\3\2\2\2\u008a\u008b"+
		"\7z\2\2\u008b&\3\2\2\2\u008c\u008d\7`\2\2\u008d(\3\2\2\2\u008e\u008f\7"+
		"-\2\2\u008f\u0090\7#\2\2\u0090*\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093"+
		"\7#\2\2\u0093,\3\2\2\2\u0094\u0095\7=\2\2\u0095\u0096\7+\2\2\u0096.\3"+
		"\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7\f\2\2\u009b\u009c\3\2\2\2\u009c\u009d\b\30"+
		"\2\2\u009d\60\3\2\2\2\u009e\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\31\2\2\u00a4\62\3\2\2\2\7\2\u0082\u0088\u0098\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}