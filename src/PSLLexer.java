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
		ORDER=10, DERIVATIVE=11, PRINT=12, PRINT_BOOLEAN=13, IDENTIFIER=14, INTEGER=15, 
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
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "START", "FINISH", 
		"ORDER", "DERIVATIVE", "PRINT", "PRINT_BOOLEAN", "IDENTIFIER", "INTEGER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\7\17t\n\17\f\17\16\17w\13\17\3\20\6\20z\n\20\r\20\16\20{\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\5\26\u008c"+
		"\n\26\3\26\3\26\3\26\3\26\3\27\6\27\u0093\n\27\r\27\16\27\u0094\3\27\3"+
		"\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\6\2CY[\\cy{|\5\2\62"+
		";C\\c|\3\2\62;\4\2\13\13\"\"\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\64\3\2\2\2\t\67\3\2"+
		"\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23E\3\2\2\2\25L\3"+
		"\2\2\2\27R\3\2\2\2\31]\3\2\2\2\33c\3\2\2\2\35q\3\2\2\2\37y\3\2\2\2!}\3"+
		"\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0084\3\2\2\2)\u0087\3\2\2\2+\u008b"+
		"\3\2\2\2-\u0092\3\2\2\2/\60\7B\2\2\60\4\3\2\2\2\61\62\7?\2\2\62\63\7#"+
		"\2\2\63\6\3\2\2\2\64\65\7/\2\2\65\66\7@\2\2\66\b\3\2\2\2\678\7*\2\28\n"+
		"\3\2\2\29:\7+\2\2:\f\3\2\2\2;<\7-\2\2<\16\3\2\2\2=>\7/\2\2>\20\3\2\2\2"+
		"?@\7U\2\2@A\7V\2\2AB\7C\2\2BC\7T\2\2CD\7V\2\2D\22\3\2\2\2EF\7H\2\2FG\7"+
		"K\2\2GH\7P\2\2HI\7K\2\2IJ\7U\2\2JK\7J\2\2K\24\3\2\2\2LM\7Q\2\2MN\7T\2"+
		"\2NO\7F\2\2OP\7G\2\2PQ\7T\2\2Q\26\3\2\2\2RS\7F\2\2ST\7G\2\2TU\7T\2\2U"+
		"V\7K\2\2VW\7X\2\2WX\7C\2\2XY\7V\2\2YZ\7K\2\2Z[\7X\2\2[\\\7G\2\2\\\30\3"+
		"\2\2\2]^\7R\2\2^_\7T\2\2_`\7K\2\2`a\7P\2\2ab\7V\2\2b\32\3\2\2\2cd\7R\2"+
		"\2de\7T\2\2ef\7K\2\2fg\7P\2\2gh\7V\2\2hi\7a\2\2ij\7D\2\2jk\7Q\2\2kl\7"+
		"Q\2\2lm\7N\2\2mn\7G\2\2no\7C\2\2op\7P\2\2p\34\3\2\2\2qu\t\2\2\2rt\t\3"+
		"\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\36\3\2\2\2wu\3\2\2\2xz\t"+
		"\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2| \3\2\2\2}~\7z\2\2~\"\3"+
		"\2\2\2\177\u0080\7`\2\2\u0080$\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083"+
		"\7#\2\2\u0083&\3\2\2\2\u0084\u0085\7,\2\2\u0085\u0086\7#\2\2\u0086(\3"+
		"\2\2\2\u0087\u0088\7=\2\2\u0088\u0089\7+\2\2\u0089*\3\2\2\2\u008a\u008c"+
		"\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008e\7\f\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\26\2\2\u0090,\3"+
		"\2\2\2\u0091\u0093\t\5\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\27"+
		"\2\2\u0097.\3\2\2\2\7\2u{\u008b\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}