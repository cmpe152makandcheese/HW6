.class public PSL
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; p1->polynomial;)

.field private static p1 [I
.field private static temp1 [I

.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        PSL/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        PSL/_standardIn LPascalTextIn;

; @p1=!x^2+2x+3+x;)

	bipush 10	
	newarray int	
	putstatic	PSL/temp1 [I
	getstatic PSL/temp1 [I
	iconst_1	
	iconst_2	
	iastore
	getstatic PSL/temp1 [I	
	iconst_2	
	iconst_1	
	iastore
	getstatic PSL/temp1 [I	
	iconst_3	
	iconst_0	
	iastore
	getstatic PSL/temp1 [I	
	iconst_1	
	iconst_1	
	iastore
	getstatic PSL/temp1 [I
	putstatic	PSL/p1 [I

	getstatic     PSL/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
