.class public PSL
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; p1->polynomial;)

.field private static p1 [I

; p2->polynomial;)

.field private static p2 [I

; p3->polynomial;)

.field private static p3 [I

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

; @p3=!x^2+!@p2;)

	;getstatic	PSL/p2 [I
	;iadd
	;putstatic	PSL/p3 [I

	getstatic     PSL/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
