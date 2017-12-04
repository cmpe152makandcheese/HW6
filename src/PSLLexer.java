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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, START=7, FINISH=8, ORDER=9, 
		DERIVATIVE=10, PRINT=11, PRINT_BOOLEAN=12, REPEAT=13, IDENTIFIER=14, INTEGER=15, 
		X=16, POWER=17, ADD_OP=18, MUL_OP=19, COMMAND_END=20, NEWLINE=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", "FINISH", "ORDER", 
		"DERIVATIVE", "PRINT", "PRINT_BOOLEAN", "REPEAT", "IDENTIFIER", "INTEGER", 
		"X", "POWER", "ADD_OP", "MUL_OP", "COMMAND_END", "NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\7\17y\n\17\f\17\16\17|\13\17\3\20\6\20\177\n\20\r"+
		"\20\16\20\u0080\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\5\26\u0091\n\26\3\26\3\26\3\26\3\26\3\27\6\27\u0098\n"+
		"\27\r\27\16\27\u0099\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\6\6\2CY[\\cy{|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\u00a0\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2"+
		"\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21C"+
		"\3\2\2\2\23J\3\2\2\2\25P\3\2\2\2\27[\3\2\2\2\31a\3\2\2\2\33o\3\2\2\2\35"+
		"v\3\2\2\2\37~\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2\2\2\'\u0089"+
		"\3\2\2\2)\u008c\3\2\2\2+\u0090\3\2\2\2-\u0097\3\2\2\2/\60\7?\2\2\60\61"+
		"\7#\2\2\61\4\3\2\2\2\62\63\7/\2\2\63\64\7@\2\2\64\6\3\2\2\2\65\66\7*\2"+
		"\2\66\b\3\2\2\2\678\7+\2\28\n\3\2\2\29:\7-\2\2:\f\3\2\2\2;<\7/\2\2<\16"+
		"\3\2\2\2=>\7U\2\2>?\7V\2\2?@\7C\2\2@A\7T\2\2AB\7V\2\2B\20\3\2\2\2CD\7"+
		"H\2\2DE\7K\2\2EF\7P\2\2FG\7K\2\2GH\7U\2\2HI\7J\2\2I\22\3\2\2\2JK\7Q\2"+
		"\2KL\7T\2\2LM\7F\2\2MN\7G\2\2NO\7T\2\2O\24\3\2\2\2PQ\7F\2\2QR\7G\2\2R"+
		"S\7T\2\2ST\7K\2\2TU\7X\2\2UV\7C\2\2VW\7V\2\2WX\7K\2\2XY\7X\2\2YZ\7G\2"+
		"\2Z\26\3\2\2\2[\\\7R\2\2\\]\7T\2\2]^\7K\2\2^_\7P\2\2_`\7V\2\2`\30\3\2"+
		"\2\2ab\7R\2\2bc\7T\2\2cd\7K\2\2de\7P\2\2ef\7V\2\2fg\7a\2\2gh\7D\2\2hi"+
		"\7Q\2\2ij\7Q\2\2jk\7N\2\2kl\7G\2\2lm\7C\2\2mn\7P\2\2n\32\3\2\2\2op\7T"+
		"\2\2pq\7G\2\2qr\7R\2\2rs\7G\2\2st\7C\2\2tu\7V\2\2u\34\3\2\2\2vz\t\2\2"+
		"\2wy\t\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\36\3\2\2\2|z\3\2"+
		"\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081 \3\2\2\2\u0082\u0083\7z\2\2\u0083\"\3\2\2\2\u0084\u0085"+
		"\7`\2\2\u0085$\3\2\2\2\u0086\u0087\7-\2\2\u0087\u0088\7#\2\2\u0088&\3"+
		"\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7#\2\2\u008b(\3\2\2\2\u008c\u008d"+
		"\7=\2\2\u008d\u008e\7+\2\2\u008e*\3\2\2\2\u008f\u0091\7\17\2\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\f\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\b\26\2\2\u0095,\3\2\2\2\u0096\u0098\t\5\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\27\2\2\u009c.\3\2\2\2\7\2z"+
		"\u0080\u0090\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}