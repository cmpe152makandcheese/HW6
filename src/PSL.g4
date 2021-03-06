grammar PSL;

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program : block;
block : decl_list function_decl_list? compound_stmt ;


function_decl_list :	function_decl ( function_decl )* ;
function_decl :			FUNCTION func_type func_id '(' param_decl_list? ')' START stmt_list? return_stmt? FINISH ;
return_stmt :			RETURN expr COMMAND_END ;
param_decl_list :		param_decl ( ',' param_decl )* ;
param_decl :			var_id ':' type_id ;
func_id :				IDENTIFIER ;
func_type :				IDENTIFIER ;

decl_list :		decl ( decl )*  ;
decl :			var_id '->' type_id COMMAND_END
	 |			var_id '->' {notifyErrorListeners("Missing type from variable declaration");}
	 |			var_id '->' type_id {notifyErrorListeners("Missing ';)' from variable declaration");}
	 ;
var_id :		IDENTIFIER ;
type_id :		IDENTIFIER ;


stmt :			assignment_stmt
	 |			compound_stmt 
	 |			order_stmt
	 |			derivative_stmt
	 |			print_stmt
	 |			print_boolean_stmt
	 |			repeat_stmt
	 |			function_call_stmt
	 ;


function_call_stmt :	functionCall COMMAND_END ;
compound_stmt :			START stmt_list FINISH ;
stmt_list : 			stmt ( stmt)* ; 
assignment_stmt : 		variable '=!' expr COMMAND_END
	 			|		variable '=!' {notifyErrorListeners("Missing expression to assign in assignment statement");}
	 			|		variable '=!' expr {notifyErrorListeners("Missing ';)' from assignment statement");}
	 			;

order_stmt : 			ORDER expr expr stmt;

derivative_stmt: 		DERIVATIVE variable COMMAND_END
			   |		DERIVATIVE {notifyErrorListeners("Variable in DERIVATIVE operation");}
			   |		DERIVATIVE variable {notifyErrorListeners("Missing ';)' from DERIVATIVE operation");}
			   ;
print_stmt :			PRINT expr COMMAND_END
		   |			PRINT {notifyErrorListeners("Variable in PRINT operation");}
		   |			PRINT expr {notifyErrorListeners("Missing ';)' from PRINT operation");}
		   ;
print_boolean_stmt :	PRINT_BOOLEAN COMMAND_END;
repeat_stmt :			REPEAT constant stmt;
variable_list:	expr ( ',' expr )* ;
variable locals [ TypeSpec type = null ]
		:    IDENTIFIER 
		;

expr locals [ TypeSpec type = null ]
	 :			expr MUL_OP expr   # mulExpr
	 |			expr ADD_OP expr   # addExpr
	 |			polynomial		   # polynomialExpr
	 |			variable		   # variableExpr
	 |			'(' expr ')'	   # parenExpr
	 |			functionCall  	   # funcExpr
	 ;

functionCall : variable '(' variable_list? ')' ;

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
	: 		 INTEGER 
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
PRINT_BOOLEAN:	'PRINT_BOOLEAN' ;
REPEAT:			'REPEAT' ;
FUNCTION:		'FUNCTION' ;
RETURN:			'RETURN' ;

IDENTIFIER :	[a-wyzA-WYZ][a-zA-Z0-9]* ;
INTEGER :		[0-9]+ ;
X:				'x' ;
POWER:			'^' ;

ADD_OP :		'+!' ;
MUL_OP :		'*!' ;

COMMAND_END:	';)' ;


NEWLINE :		'\r'? '\n' -> skip ;
WS:				[ \t]+ -> skip ;
