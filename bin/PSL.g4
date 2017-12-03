grammar PSL;

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program : block;
block : decl_list compound_stmt ;


decl_list :		decl ( decl )*  ;
decl :			var_id '->' type_id COMMAND_END;
var_id :		IDENTIFIER ;
type_id :		IDENTIFIER ;


stmt :			assignment_stmt
	 |			compound_stmt 
	 |			order_stmt
	 |			derivative_stmt
	 |			print_stmt
	 ;

compound_stmt :		START stmt_list FINISH ;
stmt_list : 		stmt ( stmt)* ; 
assignment_stmt : 	variable '=!' expr COMMAND_END;
order_stmt : 		ORDER constant variable stmt;
derivative_stmt: 	DERIVATIVE variable COMMAND_END;
print_stmt:			PRINT variable COMMAND_END;

variable :		'@' IDENTIFIER ;

expr locals [ TypeSpec type = null ]
	 :			expr MUL_OP expr   # mulExpr
	 |			expr ADD_OP expr   # addExpr
	 |			polynomial		   # polynomialExpr
	 |			variable		   # variableExpr
	 |			'(' expr ')'	   # parenExpr
	 ;

polynomial :	monomial
		   |	monomial '+' polynomial
		   ; 

monomial :		constant 
	 	 | 		coeficient X 
	 	 | 		coeficient X POWER power 
	 	 | 		X 
	 	 | 		X POWER power
	 	 ;

power locals [ TypeSpec type = null ] 
	: 		sign? INTEGER 
	;
	 
constant locals [ TypeSpec type = null ] 
	: 		sign? INTEGER 
	;

coeficient locals [ TypeSpec type = null ] 
	: 		sign? INTEGER 
	;
	
			
sign :			'+' | '-' ;

START:			'START' ;
FINISH:			'FINISH' ;
ORDER:			'ORDER' ;
DERIVATIVE: 	'DERIVATIVE' ;
PRINT:			'PRINT';

IDENTIFIER :	[a-wyzA-WYZ][a-zA-Z0-9]* ;
INTEGER :		[0-9]+ ;
X:				'x' ;
POWER:			'^' ;

ADD_OP :		'+!' ;
MUL_OP :		'*!' ;

COMMAND_END:	';)';


NEWLINE :		'\r'? '\n' -> skip ;
WS:				[ \t]+ -> skip ;
