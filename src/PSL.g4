grammar PSL;

program : block;
block : decl_list compound_stmt ;


decl_list :		decl ( decl )*  ;
decl :			var_id '->' type_id ';)';
var_id :		IDENTIFIER ;
type_id :		IDENTIFIER ;


stmt :			assignment_stmt
	 |			compound_stmt 
	 |			order_stmt
	 ;

compound_stmt :	START stmt_list FINISH ;
stmt_list : 	stmt ( stmt)* ; 
assignment_stmt : variable '=!' expr;
order_stmt : 	ORDER constant stmt;

variable :		'@' IDENTIFIER ;

expr :			expr MUL_OP expr ';)'
	 |			expr ADD_OP expr ';)'
	 |			polynomial ';)'
	 |			IDENTIFIER ';)'
	 |			'(' expr ')' ';)'
	 ;

polynomial :	monomial
		   |	monomial '+' polynomial
		   ; 

monomial :		constant 
	 	 | 		constant X 
	 	 | 		constant X POWER constant 
	 	 | 		X 
	 	 | 		X POWER constant
	 	 ;
	 
constant : 		sign? INTEGER ;
sign :			'+' | '-' ;

START:			'START' ;
FINISH:			'FINISH' ;
ORDER:			'ORDER' ;

IDENTIFIER :	[a-wyzA-WYZ][a-zA-Z0-9]* ;
INTEGER :		[0-9]+ ;
X:				'x' ;
POWER:			'^' ;

ADD_OP :		'+!' ;
MUL_OP :		'*!' ;

NEWLINE :		'\r'? '\n' -> skip ;
WS:				[ \t]+ -> skip ;
