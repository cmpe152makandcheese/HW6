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
		FINISH=10, ORDER=11, IDENTIFIER=12, INTEGER=13, X=14, POWER=15, ADD_OP=16, 
		MUL_OP=17, NEWLINE=18, WS=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'@'", "'=!'", "'->'", "'('", "')'", "'+'", "'-'", "';)'", 
		"'START'", "'FINISH'", "'ORDER'", "IDENTIFIER", "INTEGER", "'x'", "'^'", 
		"'+!'", "'*!'", "NEWLINE", "WS"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_decl_list = 2, RULE_decl = 3, RULE_var_id = 4, 
		RULE_type_id = 5, RULE_stmt = 6, RULE_compound_stmt = 7, RULE_stmt_list = 8, 
		RULE_assignment_stmt = 9, RULE_order_stmt = 10, RULE_variable = 11, RULE_expr = 12, 
		RULE_polynomial = 13, RULE_monomial = 14, RULE_constant = 15, RULE_sign = 16;
	public static final String[] ruleNames = {
		"program", "block", "decl_list", "decl", "var_id", "type_id", "stmt", 
		"compound_stmt", "stmt_list", "assignment_stmt", "order_stmt", "variable", 
		"expr", "polynomial", "monomial", "constant", "sign"
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
			setState(34); block();
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
			setState(36); decl_list();
			setState(37); compound_stmt();
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
			setState(39); decl();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(40); decl();
				}
				}
				setState(45);
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
			setState(46); var_id();
			setState(47); match(T__5);
			setState(48); type_id();
			setState(49); match(T__0);
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
			setState(51); match(IDENTIFIER);
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
			setState(53); match(IDENTIFIER);
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
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Order_stmtContext order_stmt() {
			return getRuleContext(Order_stmtContext.class,0);
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
			setState(58);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); assignment_stmt();
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); compound_stmt();
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); order_stmt();
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
			setState(60); match(START);
			setState(61); stmt_list();
			setState(62); match(FINISH);
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
			setState(64); stmt();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << START) | (1L << ORDER))) != 0)) {
				{
				{
				setState(65); stmt();
				}
				}
				setState(70);
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
			setState(71); variable();
			setState(72); match(T__6);
			setState(73); expr(0);
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
			setState(75); match(ORDER);
			setState(76); constant();
			setState(77); stmt();
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
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(T__7);
			setState(80); match(IDENTIFIER);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch (_input.LA(1)) {
			case T__2:
			case T__1:
			case INTEGER:
			case X:
				{
				_localctx = new PolynomialExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83); polynomial();
				setState(84); match(T__0);
				}
				break;
			case T__7:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86); variable();
				setState(87); match(T__0);
				}
				break;
			case T__4:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89); match(T__4);
				setState(90); expr(0);
				setState(91); match(T__3);
				setState(92); match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97); match(MUL_OP);
						setState(98); expr(0);
						setState(99); match(T__0);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102); match(ADD_OP);
						setState(103); expr(0);
						setState(104); match(T__0);
						}
						break;
					}
					} 
				}
				setState(110);
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
		enterRule(_localctx, 26, RULE_polynomial);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); monomial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); monomial();
				setState(113); match(T__2);
				setState(114); polynomial();
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
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode POWER() { return getToken(PSLParser.POWER, 0); }
		public TerminalNode X() { return getToken(PSLParser.X, 0); }
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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
		enterRule(_localctx, 28, RULE_monomial);
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); constant();
				setState(120); match(X);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122); constant();
				setState(123); match(X);
				setState(124); match(POWER);
				setState(125); constant();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127); match(X);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); match(X);
				setState(129); match(POWER);
				setState(130); constant();
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
		enterRule(_localctx, 30, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__1) {
				{
				setState(133); sign();
				}
			}

			setState(136); match(INTEGER);
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
		enterRule(_localctx, 32, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__1) ) {
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
		case 12: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b=\n\b\3\t\3\t\3\t\3\t\3\n\3\n\7\nE\n"+
		"\n\f\n\16\nH\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16a\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17w\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0086\n\20\3\21\5\21\u0089\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\2\3\32\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\3\3\2\b\t\u008b\2$\3\2\2\2\4&\3\2\2\2\6)\3\2\2\2\b\60\3\2"+
		"\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16<\3\2\2\2\20>\3\2\2\2\22B\3\2\2\2\24"+
		"I\3\2\2\2\26M\3\2\2\2\30Q\3\2\2\2\32`\3\2\2\2\34v\3\2\2\2\36\u0085\3\2"+
		"\2\2 \u0088\3\2\2\2\"\u008c\3\2\2\2$%\5\4\3\2%\3\3\2\2\2&\'\5\6\4\2\'"+
		"(\5\20\t\2(\5\3\2\2\2)-\5\b\5\2*,\5\b\5\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2\2\60\61\5\n\6\2\61\62\7\5\2\2\62\63\5"+
		"\f\7\2\63\64\7\n\2\2\64\t\3\2\2\2\65\66\7\16\2\2\66\13\3\2\2\2\678\7\16"+
		"\2\28\r\3\2\2\29=\5\24\13\2:=\5\20\t\2;=\5\26\f\2<9\3\2\2\2<:\3\2\2\2"+
		"<;\3\2\2\2=\17\3\2\2\2>?\7\13\2\2?@\5\22\n\2@A\7\f\2\2A\21\3\2\2\2BF\5"+
		"\16\b\2CE\5\16\b\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\23\3\2\2\2"+
		"HF\3\2\2\2IJ\5\30\r\2JK\7\4\2\2KL\5\32\16\2L\25\3\2\2\2MN\7\r\2\2NO\5"+
		" \21\2OP\5\16\b\2P\27\3\2\2\2QR\7\3\2\2RS\7\16\2\2S\31\3\2\2\2TU\b\16"+
		"\1\2UV\5\34\17\2VW\7\n\2\2Wa\3\2\2\2XY\5\30\r\2YZ\7\n\2\2Za\3\2\2\2[\\"+
		"\7\6\2\2\\]\5\32\16\2]^\7\7\2\2^_\7\n\2\2_a\3\2\2\2`T\3\2\2\2`X\3\2\2"+
		"\2`[\3\2\2\2an\3\2\2\2bc\f\7\2\2cd\7\23\2\2de\5\32\16\2ef\7\n\2\2fm\3"+
		"\2\2\2gh\f\6\2\2hi\7\22\2\2ij\5\32\16\2jk\7\n\2\2km\3\2\2\2lb\3\2\2\2"+
		"lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\33\3\2\2\2pn\3\2\2\2qw\5\36"+
		"\20\2rs\5\36\20\2st\7\b\2\2tu\5\34\17\2uw\3\2\2\2vq\3\2\2\2vr\3\2\2\2"+
		"w\35\3\2\2\2x\u0086\5 \21\2yz\5 \21\2z{\7\20\2\2{\u0086\3\2\2\2|}\5 \21"+
		"\2}~\7\20\2\2~\177\7\21\2\2\177\u0080\5 \21\2\u0080\u0086\3\2\2\2\u0081"+
		"\u0086\7\20\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\21\2\2\u0084\u0086"+
		"\5 \21\2\u0085x\3\2\2\2\u0085y\3\2\2\2\u0085|\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0086\37\3\2\2\2\u0087\u0089\5\"\22\2\u0088\u0087"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\17\2\2"+
		"\u008b!\3\2\2\2\u008c\u008d\t\2\2\2\u008d#\3\2\2\2\13-<F`lnv\u0085\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}