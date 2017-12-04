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
		ORDER=10, DERIVATIVE=11, PRINT=12, PRINT_BOOLEAN=13, REPEAT=14, IDENTIFIER=15, 
		INTEGER=16, X=17, POWER=18, ADD_OP=19, MUL_OP=20, COMMAND_END=21, NEWLINE=22, 
		WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", "FINISH", 
		"ORDER", "DERIVATIVE", "PRINT", "PRINT_BOOLEAN", "REPEAT", "IDENTIFIER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20}\n\20\f\20\16\20"+
		"\u0080\13\20\3\21\6\21\u0083\n\21\r\21\16\21\u0084\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\5\27\u0095\n\27\3\27"+
		"\3\27\3\27\3\27\3\30\6\30\u009c\n\30\r\30\16\30\u009d\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\6\2CY[\\cy{|\5\2\62;C\\"+
		"c|\3\2\62;\4\2\13\13\"\"\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2"+
		"\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23G\3\2\2\2"+
		"\25N\3\2\2\2\27T\3\2\2\2\31_\3\2\2\2\33e\3\2\2\2\35s\3\2\2\2\37z\3\2\2"+
		"\2!\u0082\3\2\2\2#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008d"+
		"\3\2\2\2+\u0090\3\2\2\2-\u0094\3\2\2\2/\u009b\3\2\2\2\61\62\7B\2\2\62"+
		"\4\3\2\2\2\63\64\7?\2\2\64\65\7#\2\2\65\6\3\2\2\2\66\67\7/\2\2\678\7@"+
		"\2\28\b\3\2\2\29:\7*\2\2:\n\3\2\2\2;<\7+\2\2<\f\3\2\2\2=>\7-\2\2>\16\3"+
		"\2\2\2?@\7/\2\2@\20\3\2\2\2AB\7U\2\2BC\7V\2\2CD\7C\2\2DE\7T\2\2EF\7V\2"+
		"\2F\22\3\2\2\2GH\7H\2\2HI\7K\2\2IJ\7P\2\2JK\7K\2\2KL\7U\2\2LM\7J\2\2M"+
		"\24\3\2\2\2NO\7Q\2\2OP\7T\2\2PQ\7F\2\2QR\7G\2\2RS\7T\2\2S\26\3\2\2\2T"+
		"U\7F\2\2UV\7G\2\2VW\7T\2\2WX\7K\2\2XY\7X\2\2YZ\7C\2\2Z[\7V\2\2[\\\7K\2"+
		"\2\\]\7X\2\2]^\7G\2\2^\30\3\2\2\2_`\7R\2\2`a\7T\2\2ab\7K\2\2bc\7P\2\2"+
		"cd\7V\2\2d\32\3\2\2\2ef\7R\2\2fg\7T\2\2gh\7K\2\2hi\7P\2\2ij\7V\2\2jk\7"+
		"a\2\2kl\7D\2\2lm\7Q\2\2mn\7Q\2\2no\7N\2\2op\7G\2\2pq\7C\2\2qr\7P\2\2r"+
		"\34\3\2\2\2st\7T\2\2tu\7G\2\2uv\7R\2\2vw\7G\2\2wx\7C\2\2xy\7V\2\2y\36"+
		"\3\2\2\2z~\t\2\2\2{}\t\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177 \3\2\2\2\u0080~\3\2\2\2\u0081\u0083\t\4\2\2\u0082\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\"\3\2\2\2\u0086\u0087\7z\2\2\u0087$\3\2\2\2\u0088\u0089\7`\2\2\u0089"+
		"&\3\2\2\2\u008a\u008b\7-\2\2\u008b\u008c\7#\2\2\u008c(\3\2\2\2\u008d\u008e"+
		"\7,\2\2\u008e\u008f\7#\2\2\u008f*\3\2\2\2\u0090\u0091\7=\2\2\u0091\u0092"+
		"\7+\2\2\u0092,\3\2\2\2\u0093\u0095\7\17\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\f\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\b\27\2\2\u0099.\3\2\2\2\u009a\u009c\t\5\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\b\30\2\2\u00a0\60\3\2\2\2\7\2~\u0084\u0094"+
		"\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}