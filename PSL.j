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
  .var 0 is input_array [I from Label0 to Label88
  .var 1 is location I from Label3 to Label80
Label0:
  .line 27
  0: bipush 9
  2: istore_1
Label3:
  3: iload_1
  4: iflt Label80
  .line 28
  7: aload_0
  8: iload_1
  9: iaload
  10: ifeq Label74
  .line 29
  13: iload_1
  14: bipush 9
  16: if_icmpge Label27
  19: getstatic java/lang/System/out Ljava/io/PrintStream;
  22: ldc " + "
  24: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label27:
  .line 30
  27: iload_1
  28: ifle Label65
  31: getstatic java/lang/System/out Ljava/io/PrintStream;
  34: new java/lang/StringBuilder
  37: dup
  38: invokespecial java/lang/StringBuilder/<init>()V
  41: aload_0
  42: iload_1
  43: iaload
  44: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
  47: ldc "x^"
  49: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  52: iload_1
  53: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
  56: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
  59: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  62: goto Label74
Label65:
  .line 31
  65: getstatic java/lang/System/out Ljava/io/PrintStream;
  68: aload_0
  69: iload_1
  70: iaload
  71: invokevirtual java/io/PrintStream/print(I)V
Label74:
  .line 27
  74: iinc 1 -1
  77: goto Label3
Label80:
  .line 34
  80: getstatic java/lang/System/out Ljava/io/PrintStream;
  83: ldc "
"
  85: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label88:
  .line 35
  88: return
  ; append_frame (frameNumber = 0)
  ; frame_type = 252, offset_delta = 3
  ; frame bytes: 252 0 3 1 
  .stack 
    offset 3
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 23, offset_delta = 23
  ; frame bytes: 23 
  .stack 
    offset 27
    locals Integer
    .end stack
  ; same_frame (frameNumber = 2)
  ; frame_type = 37, offset_delta = 37
  ; frame bytes: 37 
  .stack 
    offset 65
    locals Integer
    .end stack
  ; same_frame (frameNumber = 3)
  ; frame_type = 8, offset_delta = 8
  ; frame bytes: 8 
  .stack 
    offset 74
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 4)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 80
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

; @p1=!x^5+2x^3+x^2+4;)

	bipush 10	
	newarray int	
	putstatic    PSL/temp1 [I	
	getstatic PSL/temp1 [I	
	bipush 5	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 3	
	bipush 2	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 2	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 0	
	bipush 4	
	iastore	
	getstatic PSL/temp1 [I	
	putstatic	PSL/p1 [I

; @p1PRINT;)

	getstatic	PSL/p1 [I
	invokestatic PSL/print_array([I)V	

	getstatic     PSL/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
