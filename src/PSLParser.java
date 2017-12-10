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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, START=7, FINISH=8, ORDER=9, 
		DERIVATIVE=10, PRINT=11, PRINT_BOOLEAN=12, REPEAT=13, IDENTIFIER=14, INTEGER=15, 
		X=16, POWER=17, ADD_OP=18, MUL_OP=19, COMMAND_END=20, NEWLINE=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'=!'", "'->'", "'('", "')'", "'+'", "'-'", "'START'", "'FINISH'", 
		"'ORDER'", "'DERIVATIVE'", "'PRINT'", "'PRINT_BOOLEAN'", "'REPEAT'", "IDENTIFIER", 
		"INTEGER", "'x'", "'^'", "'+!'", "'*!'", "';)'", "NEWLINE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_decl_list = 2, RULE_decl = 3, RULE_var_id = 4, 
		RULE_type_id = 5, RULE_stmt = 6, RULE_compound_stmt = 7, RULE_stmt_list = 8, 
		RULE_assignment_stmt = 9, RULE_order_stmt = 10, RULE_derivative_stmt = 11, 
		RULE_print_stmt = 12, RULE_print_boolean_stmt = 13, RULE_repeat_stmt = 14, 
		RULE_variable = 15, RULE_expr = 16, RULE_polynomial = 17, RULE_monomial = 18, 
		RULE_power = 19, RULE_constant = 20, RULE_coeficient = 21, RULE_sign = 22;
	public static final String[] ruleNames = {
		"program", "block", "decl_list", "decl", "var_id", "type_id", "stmt", 
		"compound_stmt", "stmt_list", "assignment_stmt", "order_stmt", "derivative_stmt", 
		"print_stmt", "print_boolean_stmt", "repeat_stmt", "variable", "expr", 
		"polynomial", "monomial", "power", "constant", "coeficient", "sign"
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
			setState(46); block();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); decl_list();
			setState(49); compound_stmt();
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
		enterRule(_localctx, 4, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); decl();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(52); decl();
				}
				}
				setState(57);
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
		enterRule(_localctx, 6, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); var_id();
			setState(59); match(T__4);
			setState(60); type_id();
			setState(61); match(COMMAND_END);
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
		enterRule(_localctx, 8, RULE_var_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(IDENTIFIER);
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
		enterRule(_localctx, 10, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(IDENTIFIER);
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
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); assignment_stmt();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); compound_stmt();
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); order_stmt();
				}
				break;
			case DERIVATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); derivative_stmt();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); print_stmt();
				}
				break;
			case PRINT_BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(72); print_boolean_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(73); repeat_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 14, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(START);
			setState(77); stmt_list();
			setState(78); match(FINISH);
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
		enterRule(_localctx, 16, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); stmt();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << START) | (1L << ORDER) | (1L << DERIVATIVE) | (1L << PRINT) | (1L << PRINT_BOOLEAN) | (1L << REPEAT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(81); stmt();
				}
				}
				setState(86);
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
		enterRule(_localctx, 18, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); variable();
			setState(88); match(T__5);
			setState(89); expr(0);
			setState(90); match(COMMAND_END);
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
		enterRule(_localctx, 20, RULE_order_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(ORDER);
			setState(93); expr(0);
			setState(94); expr(0);
			setState(95); stmt();
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
		enterRule(_localctx, 22, RULE_derivative_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(DERIVATIVE);
			setState(98); variable();
			setState(99); match(COMMAND_END);
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
		enterRule(_localctx, 24, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(PRINT);
			setState(102); expr(0);
			setState(103); match(COMMAND_END);
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
		enterRule(_localctx, 26, RULE_print_boolean_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(PRINT_BOOLEAN);
			setState(106); match(COMMAND_END);
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
		enterRule(_localctx, 28, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(REPEAT);
			setState(109); constant();
			setState(110); stmt();
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(IDENTIFIER);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			switch (_input.LA(1)) {
			case T__1:
			case T__0:
			case INTEGER:
			case X:
				{
				_localctx = new PolynomialExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115); polynomial();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116); variable();
				}
				break;
			case T__3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117); match(T__3);
				setState(118); expr(0);
				setState(119); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124); match(MUL_OP);
						setState(125); expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(127); match(ADD_OP);
						setState(128); expr(5);
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 34, RULE_polynomial);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); monomial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); monomial();
				setState(136); match(T__1);
				setState(137); polynomial();
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
		enterRule(_localctx, 36, RULE_monomial);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); coeficient();
				setState(143); match(X);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); coeficient();
				setState(146); match(X);
				setState(147); match(POWER);
				setState(148); power();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(X);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); match(X);
				setState(152); match(POWER);
				setState(153); power();
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
		enterRule(_localctx, 38, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(INTEGER);
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
		enterRule(_localctx, 40, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__0) {
				{
				setState(158); sign();
				}
			}

			setState(161); match(INTEGER);
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
		enterRule(_localctx, 42, RULE_coeficient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__0) {
				{
				setState(163); sign();
				}
			}

			setState(166); match(INTEGER);
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
		enterRule(_localctx, 44, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__0) ) {
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
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\7\nU\n\n\f\n\16\nX\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22|\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0084\n\22\f\22\16\22\u0087\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u008e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u009d\n\24\3\25\3\25\3\26\5\26\u00a2\n\26\3"+
		"\26\3\26\3\27\5\27\u00a7\n\27\3\27\3\27\3\30\3\30\3\30\2\3\"\31\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\7\b\u00a8\2\60\3\2"+
		"\2\2\4\62\3\2\2\2\6\65\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16L\3"+
		"\2\2\2\20N\3\2\2\2\22R\3\2\2\2\24Y\3\2\2\2\26^\3\2\2\2\30c\3\2\2\2\32"+
		"g\3\2\2\2\34k\3\2\2\2\36n\3\2\2\2 r\3\2\2\2\"{\3\2\2\2$\u008d\3\2\2\2"+
		"&\u009c\3\2\2\2(\u009e\3\2\2\2*\u00a1\3\2\2\2,\u00a6\3\2\2\2.\u00aa\3"+
		"\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\5\20\t\2\64\5\3"+
		"\2\2\2\659\5\b\5\2\668\5\b\5\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\7\3\2\2\2;9\3\2\2\2<=\5\n\6\2=>\7\4\2\2>?\5\f\7\2?@\7\26\2\2@"+
		"\t\3\2\2\2AB\7\20\2\2B\13\3\2\2\2CD\7\20\2\2D\r\3\2\2\2EM\5\24\13\2FM"+
		"\5\20\t\2GM\5\26\f\2HM\5\30\r\2IM\5\32\16\2JM\5\34\17\2KM\5\36\20\2LE"+
		"\3\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M"+
		"\17\3\2\2\2NO\7\t\2\2OP\5\22\n\2PQ\7\n\2\2Q\21\3\2\2\2RV\5\16\b\2SU\5"+
		"\16\b\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\23\3\2\2\2XV\3\2\2\2"+
		"YZ\5 \21\2Z[\7\3\2\2[\\\5\"\22\2\\]\7\26\2\2]\25\3\2\2\2^_\7\13\2\2_`"+
		"\5\"\22\2`a\5\"\22\2ab\5\16\b\2b\27\3\2\2\2cd\7\f\2\2de\5 \21\2ef\7\26"+
		"\2\2f\31\3\2\2\2gh\7\r\2\2hi\5\"\22\2ij\7\26\2\2j\33\3\2\2\2kl\7\16\2"+
		"\2lm\7\26\2\2m\35\3\2\2\2no\7\17\2\2op\5*\26\2pq\5\16\b\2q\37\3\2\2\2"+
		"rs\7\20\2\2s!\3\2\2\2tu\b\22\1\2u|\5$\23\2v|\5 \21\2wx\7\5\2\2xy\5\"\22"+
		"\2yz\7\6\2\2z|\3\2\2\2{t\3\2\2\2{v\3\2\2\2{w\3\2\2\2|\u0085\3\2\2\2}~"+
		"\f\7\2\2~\177\7\25\2\2\177\u0084\5\"\22\b\u0080\u0081\f\6\2\2\u0081\u0082"+
		"\7\24\2\2\u0082\u0084\5\"\22\7\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086#\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0088\u008e\5&\24\2\u0089\u008a\5&\24\2\u008a\u008b"+
		"\7\7\2\2\u008b\u008c\5$\23\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e%\3\2\2\2\u008f\u009d\5*\26\2\u0090\u0091\5,\27\2"+
		"\u0091\u0092\7\22\2\2\u0092\u009d\3\2\2\2\u0093\u0094\5,\27\2\u0094\u0095"+
		"\7\22\2\2\u0095\u0096\7\23\2\2\u0096\u0097\5(\25\2\u0097\u009d\3\2\2\2"+
		"\u0098\u009d\7\22\2\2\u0099\u009a\7\22\2\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009d\5(\25\2\u009c\u008f\3\2\2\2\u009c\u0090\3\2\2\2\u009c\u0093\3\2"+
		"\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d\'\3\2\2\2\u009e\u009f"+
		"\7\21\2\2\u009f)\3\2\2\2\u00a0\u00a2\5.\30\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4+\3\2\2\2"+
		"\u00a5\u00a7\5.\30\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\7\21\2\2\u00a9-\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab"+
		"/\3\2\2\2\f9LV{\u0083\u0085\u008d\u009c\u00a1\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}