.class public PSL
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; p1->polynomial;)

.field private static p1 [I
.field private static temp1 [I

.method public static print_array([I)V
  .limit stack 4
  .limit locals 2
  .var 0 is input_array [I from Label0 to Label56
  .var 1 is location I from Label2 to Label56
Label0:
  .line 27
  0: iconst_0
  1: istore_1
Label2:
  2: iload_1
  3: bipush 10
  5: if_icmpge Label56
  .line 28
  8: aload_0
  9: iload_1
  10: iaload
  11: ifeq Label50
  .line 29
  14: getstatic java/lang/System/out Ljava/io/PrintStream;
  17: new java/lang/StringBuilder
  20: dup
  21: invokespecial java/lang/StringBuilder/<init>()V
  24: ldc "Element at index ["
  26: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  29: iload_1
  30: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
  33: ldc "]: "
  35: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  38: aload_0
  39: iload_1
  40: iaload
  41: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
  44: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
  47: invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
Label50:
  .line 27
  50: iinc 1 1
  53: goto Label2
Label56:
  .line 32
  56: return
  ; append_frame (frameNumber = 0)
  ; frame_type = 252, offset_delta = 2
  ; frame bytes: 252 0 2 1 
  .stack 
    offset 2
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 47, offset_delta = 47
  ; frame bytes: 47 
  .stack 
    offset 50
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 2)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 56
    .end stack
.end method

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
	putstatic    PSL/temp1 [I	
	getstatic PSL/temp1 [I	
	bipush 2	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 1	
	bipush 2	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 0	
	bipush 3	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 1	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	putstatic	PSL/p1 [I

; Print
	getstatic PSL/p1 [I
	invokestatic PSL/print_array([I)V

	getstatic     PSL/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
