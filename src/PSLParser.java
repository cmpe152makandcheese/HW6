// Generated from PSL.g4 by ANTLR 4.4

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, START=9, 
		FINISH=10, ORDER=11, DERIVATIVE=12, PRINT=13, PRINT_BOOLEAN=14, REPEAT=15, 
		FUNCTION=16, RETURN=17, IDENTIFIER=18, INTEGER=19, X=20, POWER=21, ADD_OP=22, 
		MUL_OP=23, COMMAND_END=24, NEWLINE=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'=!'", "'->'", "'('", "')'", "':'", "'+'", "','", "'-'", 
		"'START'", "'FINISH'", "'ORDER'", "'DERIVATIVE'", "'PRINT'", "'PRINT_BOOLEAN'", 
		"'REPEAT'", "'FUNCTION'", "'RETURN'", "IDENTIFIER", "INTEGER", "'x'", 
		"'^'", "'+!'", "'*!'", "';)'", "NEWLINE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_function_decl_list = 2, RULE_function_decl = 3, 
		RULE_return_stmt = 4, RULE_param_decl_list = 5, RULE_param_decl = 6, RULE_func_id = 7, 
		RULE_func_type = 8, RULE_decl_list = 9, RULE_decl = 10, RULE_var_id = 11, 
		RULE_type_id = 12, RULE_stmt = 13, RULE_function_call_stmt = 14, RULE_compound_stmt = 15, 
		RULE_stmt_list = 16, RULE_assignment_stmt = 17, RULE_order_stmt = 18, 
		RULE_derivative_stmt = 19, RULE_print_stmt = 20, RULE_print_boolean_stmt = 21, 
		RULE_repeat_stmt = 22, RULE_variable_list = 23, RULE_variable = 24, RULE_expr = 25, 
		RULE_functionCall = 26, RULE_polynomial = 27, RULE_monomial = 28, RULE_power = 29, 
		RULE_constant = 30, RULE_coeficient = 31, RULE_sign = 32;
	public static final String[] ruleNames = {
		"program", "block", "function_decl_list", "function_decl", "return_stmt", 
		"param_decl_list", "param_decl", "func_id", "func_type", "decl_list", 
		"decl", "var_id", "type_id", "stmt", "function_call_stmt", "compound_stmt", 
		"stmt_list", "assignment_stmt", "order_stmt", "derivative_stmt", "print_stmt", 
		"print_boolean_stmt", "repeat_stmt", "variable_list", "variable", "expr", 
		"functionCall", "polynomial", "monomial", "power", "constant", "coeficient", 
		"sign"
	};

	@Override
	public String getGrammarFileName() { return "PSL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); block();
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

	public static class BlockContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_decl_listContext function_decl_list() {
			return getRuleContext(Function_decl_listContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); decl_list();
			setState(70);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(69); function_decl_list();
				}
			}

			setState(72); compound_stmt();
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

	public static class Function_decl_listContext extends ParserRuleContext {
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
		}
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunction_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_listContext function_decl_list() throws RecognitionException {
		Function_decl_listContext _localctx = new Function_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); function_decl();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(75); function_decl();
				}
				}
				setState(80);
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

	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PSLParser.FUNCTION, 0); }
		public Func_idContext func_id() {
			return getRuleContext(Func_idContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public TerminalNode FINISH() { return getToken(PSLParser.FINISH, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode START() { return getToken(PSLParser.START, 0); }
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(FUNCTION);
			setState(82); func_type();
			setState(83); func_id();
			setState(84); match(T__5);
			setState(86);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(85); param_decl_list();
				}
			}

			setState(88); match(T__4);
			setState(89); match(START);
			setState(91);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << ORDER) | (1L << DERIVATIVE) | (1L << PRINT) | (1L << PRINT_BOOLEAN) | (1L << REPEAT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(90); stmt_list();
				}
			}

			setState(94);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(93); return_stmt();
				}
			}

			setState(96); match(FINISH);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public TerminalNode RETURN() { return getToken(PSLParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(RETURN);
			setState(99); expr(0);
			setState(100); match(COMMAND_END);
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitParam_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); param_decl();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(103); match(T__1);
				setState(104); param_decl();
				}
				}
				setState(109);
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

	public static class Param_declContext extends ParserRuleContext {
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); var_id();
			setState(111); match(T__3);
			setState(112); type_id();
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

	public static class Func_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSLParser.IDENTIFIER, 0); }
		public Func_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunc_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_idContext func_id() throws RecognitionException {
		Func_idContext _localctx = new Func_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(IDENTIFIER);
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

	public static class Func_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSLParser.IDENTIFIER, 0); }
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunc_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(IDENTIFIER);
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

	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitDecl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); decl();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(119); decl();
				}
				}
				setState(124);
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

	public static class DeclContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public Var_idContext var_id() {
			return getRuleContext(Var_idContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); var_id();
			setState(126); match(T__6);
			setState(127); type_id();
			setState(128); match(COMMAND_END);
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

	public static class Var_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSLParser.IDENTIFIER, 0); }
		public Var_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitVar_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_idContext var_id() throws RecognitionException {
		Var_idContext _localctx = new Var_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(IDENTIFIER);
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

	public static class Type_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PSLParser.IDENTIFIER, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitType_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(IDENTIFIER);
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

	public static class StmtContext extends ParserRuleContext {
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public Function_call_stmtContext function_call_stmt() {
			return getRuleContext(Function_call_stmtContext.class,0);
		}
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Print_boolean_stmtContext print_boolean_stmt() {
			return getRuleContext(Print_boolean_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Order_stmtContext order_stmt() {
			return getRuleContext(Order_stmtContext.class,0);
		}
		public Derivative_stmtContext derivative_stmt() {
			return getRuleContext(Derivative_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); compound_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); order_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); derivative_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); print_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139); print_boolean_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140); repeat_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141); function_call_stmt();
				}
				break;
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

	public static class Function_call_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Function_call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunction_call_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_stmtContext function_call_stmt() throws RecognitionException {
		Function_call_stmtContext _localctx = new Function_call_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); functionCall();
			setState(145); match(COMMAND_END);
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode FINISH() { return getToken(PSLParser.FINISH, 0); }
		public TerminalNode START() { return getToken(PSLParser.START, 0); }
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(START);
			setState(148); stmt_list();
			setState(149); match(FINISH);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); stmt();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << ORDER) | (1L << DERIVATIVE) | (1L << PRINT) | (1L << PRINT_BOOLEAN) | (1L << REPEAT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(152); stmt();
				}
				}
				setState(157);
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); variable();
			setState(159); match(T__7);
			setState(160); expr(0);
			setState(161); match(COMMAND_END);
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

	public static class Order_stmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(PSLParser.ORDER, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Order_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitOrder_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_stmtContext order_stmt() throws RecognitionException {
		Order_stmtContext _localctx = new Order_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_order_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(ORDER);
			setState(164); expr(0);
			setState(165); expr(0);
			setState(166); stmt();
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

	public static class Derivative_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public TerminalNode DERIVATIVE() { return getToken(PSLParser.DERIVATIVE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Derivative_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivative_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitDerivative_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Derivative_stmtContext derivative_stmt() throws RecognitionException {
		Derivative_stmtContext _localctx = new Derivative_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_derivative_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(DERIVATIVE);
			setState(169); variable();
			setState(170); match(COMMAND_END);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public TerminalNode PRINT() { return getToken(PSLParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(PRINT);
			setState(173); expr(0);
			setState(174); match(COMMAND_END);
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

	public static class Print_boolean_stmtContext extends ParserRuleContext {
		public TerminalNode COMMAND_END() { return getToken(PSLParser.COMMAND_END, 0); }
		public TerminalNode PRINT_BOOLEAN() { return getToken(PSLParser.PRINT_BOOLEAN, 0); }
		public Print_boolean_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_boolean_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitPrint_boolean_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_boolean_stmtContext print_boolean_stmt() throws RecognitionException {
		Print_boolean_stmtContext _localctx = new Print_boolean_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_boolean_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(PRINT_BOOLEAN);
			setState(177); match(COMMAND_END);
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

	public static class Repeat_stmtContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode REPEAT() { return getToken(PSLParser.REPEAT, 0); }
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitRepeat_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(REPEAT);
			setState(180); constant();
			setState(181); stmt();
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

	public static class Variable_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitVariable_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); expr(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(184); match(T__1);
				setState(185); expr(0);
				}
				}
				setState(190);
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

	public static class VariableContext extends ParserRuleContext {
		public TypeSpec type;
		public TerminalNode IDENTIFIER() { return getToken(PSLParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(IDENTIFIER);
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

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec type;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD_OP() { return getToken(PSLParser.ADD_OP, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExprContext {
		public TerminalNode MUL_OP() { return getToken(PSLParser.MUL_OP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PolynomialExprContext extends ExprContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public PolynomialExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitPolynomialExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new PolynomialExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194); polynomial();
				}
				break;
			case 2:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); variable();
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(T__5);
				setState(197); expr(0);
				setState(198); match(T__4);
				}
				break;
			case 4:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(204); match(MUL_OP);
						setState(205); expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207); match(ADD_OP);
						setState(208); expr(6);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); variable();
			setState(215); match(T__5);
			setState(217);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__2) | (1L << T__0) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << X))) != 0)) {
				{
				setState(216); variable_list();
				}
			}

			setState(219); match(T__4);
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

	public static class PolynomialContext extends ParserRuleContext {
		public PolynomialContext polynomial() {
			return getRuleContext(PolynomialContext.class,0);
		}
		public MonomialContext monomial() {
			return getRuleContext(MonomialContext.class,0);
		}
		public PolynomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polynomial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitPolynomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolynomialContext polynomial() throws RecognitionException {
		PolynomialContext _localctx = new PolynomialContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_polynomial);
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); monomial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); monomial();
				setState(223); match(T__2);
				setState(224); polynomial();
				}
				break;
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

	public static class MonomialContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode POWER() { return getToken(PSLParser.POWER, 0); }
		public TerminalNode X() { return getToken(PSLParser.X, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public CoeficientContext coeficient() {
			return getRuleContext(CoeficientContext.class,0);
		}
		public MonomialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomial; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitMonomial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonomialContext monomial() throws RecognitionException {
		MonomialContext _localctx = new MonomialContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_monomial);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); coeficient();
				setState(230); match(X);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); coeficient();
				setState(233); match(X);
				setState(234); match(POWER);
				setState(235); power();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237); match(X);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238); match(X);
				setState(239); match(POWER);
				setState(240); power();
				}
				break;
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

	public static class PowerContext extends ParserRuleContext {
		public TypeSpec type;
		public TerminalNode INTEGER() { return getToken(PSLParser.INTEGER, 0); }
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(INTEGER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TypeSpec type;
		public TerminalNode INTEGER() { return getToken(PSLParser.INTEGER, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__0) {
				{
				setState(245); sign();
				}
			}

			setState(248); match(INTEGER);
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

	public static class CoeficientContext extends ParserRuleContext {
		public TypeSpec type;
		public TerminalNode INTEGER() { return getToken(PSLParser.INTEGER, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public CoeficientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coeficient; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitCoeficient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoeficientContext coeficient() throws RecognitionException {
		CoeficientContext _localctx = new CoeficientContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_coeficient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__0) {
				{
				setState(250); sign();
				}
			}

			setState(253); match(INTEGER);
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSLVisitor ) return ((PSLVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__0) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 25: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\5\3I\n\3\3\3\3\3\3\4\3\4\7\4O\n\4\f\4\16\4"+
		"R\13\4\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\5\5^\n\5\3\5\5\5a\n\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0091\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u009c"+
		"\n\22\f\22\16\22\u009f\13\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\7\31\u00bd\n\31\f\31\16\31\u00c0\13\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00cc\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u00d4\n\33\f\33\16\33\u00d7\13\33\3\34"+
		"\3\34\3\34\5\34\u00dc\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00e5"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u00f4\n\36\3\37\3\37\3 \5 \u00f9\n \3 \3 \3!\5!\u00fe\n!\3!\3!\3"+
		"\"\3\"\3\"\2\3\64#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@B\2\3\4\2\b\b\n\n\u00ff\2D\3\2\2\2\4F\3\2\2\2\6L\3\2\2\2"+
		"\bS\3\2\2\2\nd\3\2\2\2\fh\3\2\2\2\16p\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2"+
		"\24x\3\2\2\2\26\177\3\2\2\2\30\u0084\3\2\2\2\32\u0086\3\2\2\2\34\u0090"+
		"\3\2\2\2\36\u0092\3\2\2\2 \u0095\3\2\2\2\"\u0099\3\2\2\2$\u00a0\3\2\2"+
		"\2&\u00a5\3\2\2\2(\u00aa\3\2\2\2*\u00ae\3\2\2\2,\u00b2\3\2\2\2.\u00b5"+
		"\3\2\2\2\60\u00b9\3\2\2\2\62\u00c1\3\2\2\2\64\u00cb\3\2\2\2\66\u00d8\3"+
		"\2\2\28\u00e4\3\2\2\2:\u00f3\3\2\2\2<\u00f5\3\2\2\2>\u00f8\3\2\2\2@\u00fd"+
		"\3\2\2\2B\u0101\3\2\2\2DE\5\4\3\2E\3\3\2\2\2FH\5\24\13\2GI\5\6\4\2HG\3"+
		"\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\5 \21\2K\5\3\2\2\2LP\5\b\5\2MO\5\b\5\2NM"+
		"\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST\7\22\2\2"+
		"TU\5\22\n\2UV\5\20\t\2VX\7\5\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2"+
		"\2Z[\7\6\2\2[]\7\13\2\2\\^\5\"\22\2]\\\3\2\2\2]^\3\2\2\2^`\3\2\2\2_a\5"+
		"\n\6\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\f\2\2c\t\3\2\2\2de\7\23\2\2e"+
		"f\5\64\33\2fg\7\32\2\2g\13\3\2\2\2hm\5\16\b\2ij\7\t\2\2jl\5\16\b\2ki\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2pq\5\30\r\2q"+
		"r\7\7\2\2rs\5\32\16\2s\17\3\2\2\2tu\7\24\2\2u\21\3\2\2\2vw\7\24\2\2w\23"+
		"\3\2\2\2x|\5\26\f\2y{\5\26\f\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\25\3\2\2\2~|\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\7\4\2\2\u0081\u0082"+
		"\5\32\16\2\u0082\u0083\7\32\2\2\u0083\27\3\2\2\2\u0084\u0085\7\24\2\2"+
		"\u0085\31\3\2\2\2\u0086\u0087\7\24\2\2\u0087\33\3\2\2\2\u0088\u0091\5"+
		"$\23\2\u0089\u0091\5 \21\2\u008a\u0091\5&\24\2\u008b\u0091\5(\25\2\u008c"+
		"\u0091\5*\26\2\u008d\u0091\5,\27\2\u008e\u0091\5.\30\2\u008f\u0091\5\36"+
		"\20\2\u0090\u0088\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093\5\66\34\2\u0093"+
		"\u0094\7\32\2\2\u0094\37\3\2\2\2\u0095\u0096\7\13\2\2\u0096\u0097\5\""+
		"\22\2\u0097\u0098\7\f\2\2\u0098!\3\2\2\2\u0099\u009d\5\34\17\2\u009a\u009c"+
		"\5\34\17\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e#\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5"+
		"\62\32\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\5\64\33\2\u00a3\u00a4\7\32\2"+
		"\2\u00a4%\3\2\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5\64\33\2\u00a7\u00a8"+
		"\5\64\33\2\u00a8\u00a9\5\34\17\2\u00a9\'\3\2\2\2\u00aa\u00ab\7\16\2\2"+
		"\u00ab\u00ac\5\62\32\2\u00ac\u00ad\7\32\2\2\u00ad)\3\2\2\2\u00ae\u00af"+
		"\7\17\2\2\u00af\u00b0\5\64\33\2\u00b0\u00b1\7\32\2\2\u00b1+\3\2\2\2\u00b2"+
		"\u00b3\7\20\2\2\u00b3\u00b4\7\32\2\2\u00b4-\3\2\2\2\u00b5\u00b6\7\21\2"+
		"\2\u00b6\u00b7\5> \2\u00b7\u00b8\5\34\17\2\u00b8/\3\2\2\2\u00b9\u00be"+
		"\5\64\33\2\u00ba\u00bb\7\t\2\2\u00bb\u00bd\5\64\33\2\u00bc\u00ba\3\2\2"+
		"\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\61"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\24\2\2\u00c2\63\3\2\2\2\u00c3"+
		"\u00c4\b\33\1\2\u00c4\u00cc\58\35\2\u00c5\u00cc\5\62\32\2\u00c6\u00c7"+
		"\7\5\2\2\u00c7\u00c8\5\64\33\2\u00c8\u00c9\7\6\2\2\u00c9\u00cc\3\2\2\2"+
		"\u00ca\u00cc\5\66\34\2\u00cb\u00c3\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c6"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f\b\2\2\u00ce"+
		"\u00cf\7\31\2\2\u00cf\u00d4\5\64\33\t\u00d0\u00d1\f\7\2\2\u00d1\u00d2"+
		"\7\30\2\2\u00d2\u00d4\5\64\33\b\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2"+
		"\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\65"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\62\32\2\u00d9\u00db\7\5\2\2"+
		"\u00da\u00dc\5\60\31\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\7\6\2\2\u00de\67\3\2\2\2\u00df\u00e5\5:\36\2\u00e0"+
		"\u00e1\5:\36\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\58\35\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e59\3\2\2\2\u00e6\u00f4"+
		"\5> \2\u00e7\u00e8\5@!\2\u00e8\u00e9\7\26\2\2\u00e9\u00f4\3\2\2\2\u00ea"+
		"\u00eb\5@!\2\u00eb\u00ec\7\26\2\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee\5<"+
		"\37\2\u00ee\u00f4\3\2\2\2\u00ef\u00f4\7\26\2\2\u00f0\u00f1\7\26\2\2\u00f1"+
		"\u00f2\7\27\2\2\u00f2\u00f4\5<\37\2\u00f3\u00e6\3\2\2\2\u00f3\u00e7\3"+
		"\2\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4"+
		";\3\2\2\2\u00f5\u00f6\7\25\2\2\u00f6=\3\2\2\2\u00f7\u00f9\5B\"\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\25"+
		"\2\2\u00fb?\3\2\2\2\u00fc\u00fe\5B\"\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\25\2\2\u0100A\3\2\2\2\u0101"+
		"\u0102\t\2\2\2\u0102C\3\2\2\2\24HPX]`m|\u0090\u009d\u00be\u00cb\u00d3"+
		"\u00d5\u00db\u00e4\u00f3\u00f8\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}