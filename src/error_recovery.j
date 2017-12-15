.class public PSL
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; p1->polynomial

.field private static p1 [I

; p2->polynomial

.field private static p2 [I

.field private static temp1 [I

.method public static order_helper([I)I
  .limit stack 2
  .limit locals 2
  .var 0 is high_input_array [I from Label0 to Label22
  .var 1 is power I from Label3 to Label21
Label0:
  .line 52
  0: bipush 9
  2: istore_1
Label3:
  3: iload_1
  4: iflt Label21
  .line 53
  7: aload_0
  8: iload_1
  9: iaload
  10: ifeq Label15
  13: iload_1
  14: ireturn
Label15:
  .line 52
  15: iinc 1 -1
  18: goto Label3
Label21:
  .line 55
  21: iconst_0
Label22:
  22: ireturn
  ; append_frame (frameNumber = 0)
  ; frame_type = 252, offset_delta = 3
  ; frame bytes: 252 0 3 1 
  .stack 
    offset 3
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 11, offset_delta = 11
  ; frame bytes: 11 
  .stack 
    offset 15
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 2)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 21
    .end stack
.end method

.method public static lowest_power([I)I
  .limit stack 2
  .limit locals 2
  .var 0 is low_input_array [I from Label0 to Label23
  .var 1 is power I from Label2 to Label22
Label0:
  .line 59
  0: iconst_0
  1: istore_1
Label2:
  2: iload_1
  3: bipush 10
  5: if_icmpge Label22
  .line 60
  8: aload_0
  9: iload_1
  10: iaload
  11: ifeq Label16
  14: iload_1
  15: ireturn
Label16:
  .line 59
  16: iinc 1 1
  19: goto Label2
Label22:
  .line 62
  22: iconst_0
Label23:
  23: ireturn
  ; append_frame (frameNumber = 0)
  ; frame_type = 252, offset_delta = 2
  ; frame bytes: 252 0 2 1 
  .stack 
    offset 2
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 13, offset_delta = 13
  ; frame bytes: 13 
  .stack 
    offset 16
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 2)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 22
    .end stack
.end method
.method public static order([I[I)I
  .limit stack 2
  .limit locals 2
  .var 0 is input_order [I from Label0 to Label24
  .var 1 is input_array [I from Label0 to Label24
Label0:
  .line 50
  0: aload_0
  1: invokestatic PSL/order_helper([I)I
  4: ifne Label23
  .line 51
  7: aload_0
  8: iconst_0
  9: iaload
  10: iconst_1
  11: iadd
  12: aload_1
  13: invokestatic PSL/order_helper([I)I
  16: if_icmpgt Label21
  19: iconst_1
  20: ireturn
Label21:
  .line 52
  21: iconst_0
  22: ireturn
Label23:
  .line 54
  23: iconst_0
Label24:
  24: ireturn
  ; same_frame (frameNumber = 0)
  ; frame_type = 21, offset_delta = 21
  ; frame bytes: 21 
  .stack 
    offset 21
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 1, offset_delta = 1
  ; frame bytes: 1 
  .stack 
    offset 23
    .end stack
.end method

.method public static print_array([I)V
  .limit stack 3
  .limit locals 5
  .var 0 is input_array [I from Label0 to Label227
  .var 1 is low_power I from Label5 to Label227
  .var 2 is high_power I from Label10 to Label227
  .var 3 is power I from Label12 to Label196
  .var 4 is coefficient I from Label22 to Label190
Label0:
  .line 67
  0: aload_0
  1: invokestatic PSL/lowest_power([I)I
  4: istore_1
Label5:
  .line 68
  5: aload_0
  6: invokestatic PSL/order_helper([I)I
  9: istore_2
Label10:
  .line 69
  10: iload_2
  11: istore_3
Label12:
  12: iload_3
  13: iload_1
  14: if_icmplt Label196
  .line 70
  17: aload_0
  18: iload_3
  19: iaload
  20: istore 4
Label22:
  .line 71
  22: iload 4
  24: ifeq Label97
  27: iload_3
  28: iconst_1
  29: if_icmple Label97
  .line 72
  32: iload 4
  34: iconst_1
  35: if_icmpgt Label44
  38: iload 4
  40: iconst_m1
  41: if_icmpge Label55
Label44:
  44: getstatic java/lang/System/out Ljava/io/PrintStream;
  47: iload 4
  49: invokevirtual java/io/PrintStream/print(I)V
  52: goto Label69
Label55:
  .line 73
  55: iload 4
  57: iconst_m1
  58: if_icmpne Label69
  61: getstatic java/lang/System/out Ljava/io/PrintStream;
  64: ldc "-"
  66: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label69:
  .line 74
  69: getstatic java/lang/System/out Ljava/io/PrintStream;
  72: new java/lang/StringBuilder
  75: dup
  76: invokespecial java/lang/StringBuilder/<init>()V
  79: ldc "x^"
  81: invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
  84: iload_3
  85: invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
  88: invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
  91: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  94: goto Label172
Label97:
  .line 76
  97: iload 4
  99: ifeq Label155
  102: iload_3
  103: iconst_1
  104: if_icmpne Label155
  .line 77
  107: iload 4
  109: iconst_1
  110: if_icmpgt Label119
  113: iload 4
  115: iconst_m1
  116: if_icmpge Label130
Label119:
  119: getstatic java/lang/System/out Ljava/io/PrintStream;
  122: iload 4
  124: invokevirtual java/io/PrintStream/print(I)V
  127: goto Label144
Label130:
  .line 78
  130: iload 4
  132: iconst_m1
  133: if_icmpne Label144
  136: getstatic java/lang/System/out Ljava/io/PrintStream;
  139: ldc "-"
  141: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label144:
  .line 79
  144: getstatic java/lang/System/out Ljava/io/PrintStream;
  147: ldc "x"
  149: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
  152: goto Label172
Label155:
  .line 81
  155: iload_3
  156: ifne Label172
  159: iload 4
  161: ifeq Label172
  .line 82
  164: getstatic java/lang/System/out Ljava/io/PrintStream;
  167: iload 4
  169: invokevirtual java/io/PrintStream/print(I)V
Label172:
  .line 84
  172: iload_3
  173: iload_1
  174: if_icmpeq Label190
  177: iload 4
  179: ifeq Label190
  182: getstatic java/lang/System/out Ljava/io/PrintStream;
  185: ldc " + "
  187: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label190:
  .line 69
  190: iinc 3 -1
  193: goto Label12
Label196:
  .line 86
  196: iload_1
  197: iload_2
  198: if_icmpne Label219
  201: iload_1
  202: ifne Label219
  205: aload_0
  206: iconst_0
  207: iaload
  208: ifne Label219
  211: getstatic java/lang/System/out Ljava/io/PrintStream;
  214: ldc "0"
  216: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label219:
  .line 87
  219: getstatic java/lang/System/out Ljava/io/PrintStream;
  222: ldc "
"
  224: invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
Label227:
  .line 88
  227: return
  ; append_frame (frameNumber = 0)
  ; frame_type = 254, offset_delta = 12
  ; frame bytes: 254 0 12 1 1 1 
  .stack 
    offset 12
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; append_frame (frameNumber = 1)
  ; frame_type = 252, offset_delta = 31
  ; frame bytes: 252 0 31 1 
  .stack 
    offset 44
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 2)
  ; frame_type = 10, offset_delta = 10
  ; frame bytes: 10 
  .stack 
    offset 55
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 3)
  ; frame_type = 13, offset_delta = 13
  ; frame bytes: 13 
  .stack 
    offset 69
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 4)
  ; frame_type = 27, offset_delta = 27
  ; frame bytes: 27 
  .stack 
    offset 97
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 5)
  ; frame_type = 21, offset_delta = 21
  ; frame bytes: 21 
  .stack 
    offset 119
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 6)
  ; frame_type = 10, offset_delta = 10
  ; frame bytes: 10 
  .stack 
    offset 130
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 7)
  ; frame_type = 13, offset_delta = 13
  ; frame bytes: 13 
  .stack 
    offset 144
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 8)
  ; frame_type = 10, offset_delta = 10
  ; frame bytes: 10 
  .stack 
    offset 155
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 9)
  ; frame_type = 16, offset_delta = 16
  ; frame bytes: 16 
  .stack 
    offset 172
    locals Integer
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 10)
  ; frame_type = 250, offset_delta = 17
  ; frame bytes: 250 0 17 
  .stack 
    offset 190
    locals Integer
    locals Integer
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 11)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 196
    locals Integer
    locals Integer
    .end stack
  ; same_frame (frameNumber = 12)
  ; frame_type = 22, offset_delta = 22
  ; frame bytes: 22 
  .stack 
    offset 219
    locals Integer
    locals Integer
    .end stack
.end method
.method public static print_boolean(I)V
  .limit stack 2
  .limit locals 1
  .var 0 is input_bool I from Label0 to Label24
Label0:
  .line 143
  0: iload_0
  1: iconst_1
  2: if_icmpne Label16
  5: getstatic java/lang/System/out Ljava/io/PrintStream;
  8: ldc "TRUE"
  10: invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
  13: goto Label24
Label16:
  .line 144
  16: getstatic java/lang/System/out Ljava/io/PrintStream;
  19: ldc "FALSE"
  21: invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
Label24:
  .line 145
  24: return
  ; same_frame (frameNumber = 0)
  ; frame_type = 16, offset_delta = 16
  ; frame bytes: 16 
  .stack 
    offset 16
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 7, offset_delta = 7
  ; frame bytes: 7 
  .stack 
    offset 24
    .end stack
.end method

.method public static add_polynomial([I[I)[I
  .limit stack 5
  .limit locals 4
  .line 25
  0: bipush 10
  2: newarray int
  4: astore_2
  .line 26
  5: iconst_0
  6: istore_3
Label7:
  7: iload_3
  8: bipush 10
  10: if_icmpge Label23
  .line 27
  13: aload_2
  14: iload_3
  15: iconst_0
  16: iastore
  .line 26
  17: iinc 3 1
  20: goto Label7
Label23:
  .line 30
  23: iconst_0
  24: istore_3
Label25:
  25: iload_3
  26: bipush 10
  28: if_icmpge Label47
  .line 31
  31: aload_2
  32: iload_3
  33: aload_0
  34: iload_3
  35: iaload
  36: aload_1
  37: iload_3
  38: iaload
  39: iadd
  40: iastore
  .line 30
  41: iinc 3 1
  44: goto Label25
Label47:
  .line 33
  47: aload_2
  48: areturn
  ; append_frame (frameNumber = 0)
  ; frame_type = 253, offset_delta = 7
  ; frame bytes: 253 0 7 7 0 13 1 
  .stack 
    offset 7
    locals Object [I
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 1)
  ; frame_type = 250, offset_delta = 15
  ; frame bytes: 250 0 15 
  .stack 
    offset 23
    locals Object [I
    .end stack
  ; append_frame (frameNumber = 2)
  ; frame_type = 252, offset_delta = 1
  ; frame bytes: 252 0 1 1 
  .stack 
    offset 25
    locals Object [I
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 3)
  ; frame_type = 250, offset_delta = 21
  ; frame bytes: 250 0 21 
  .stack 
    offset 47
    locals Object [I
    .end stack
.end method

.method public static derive([I)[I
  .limit stack 3
  .limit locals 4
  .var 0 is input_array [I from Label0 to Label37
  .var 1 is returnArray [I from Label5 to Label37
  .var 2 is power I from Label8 to Label36
  .var 3 is new_coefficient I from Label24 to Label30
Label0:
  .line 91
  0: bipush 10
  2: newarray int
  4: astore_1
Label5:
  .line 92
  5: bipush 9
  7: istore_2
Label8:
  8: iload_2
  9: ifle Label36
  .line 94
  12: aload_0
  13: iload_2
  14: iaload
  15: ifeq Label30
  .line 95
  18: iload_2
  19: aload_0
  20: iload_2
  21: iaload
  22: imul
  23: istore_3
Label24:
  .line 96
  24: aload_1
  25: iload_2
  26: iconst_1
  27: isub
  28: iload_3
  29: iastore
Label30:
  .line 92
  30: iinc 2 -1
  33: goto Label8
Label36:
  .line 99
  36: aload_1
Label37:
  37: areturn
  ; append_frame (frameNumber = 0)
  ; frame_type = 253, offset_delta = 8
  ; frame bytes: 253 0 8 7 0 41 1 
  .stack 
    offset 8
    locals Object [I
    locals Integer
    .end stack
  ; same_frame (frameNumber = 1)
  ; frame_type = 21, offset_delta = 21
  ; frame bytes: 21 
  .stack 
    offset 30
    locals Object [I
    locals Integer
    .end stack
  ; chop_frame (frameNumber = 2)
  ; frame_type = 250, offset_delta = 5
  ; frame bytes: 250 0 5 
  .stack 
    offset 36
    locals Object [I
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

; p1=!2x^6+x^5+3;)

	bipush 10	
	newarray int	
	putstatic    PSL/temp1 [I	
	getstatic PSL/temp1 [I	
	bipush 6	
	bipush 2	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 5	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	bipush 0	
	bipush 3	
	iastore	
	getstatic PSL/temp1 [I	
	putstatic	PSL/p1 [I

; p2=!x^3;)

	bipush 10	
	newarray int	
	putstatic    PSL/temp1 [I	
	getstatic PSL/temp1 [I	
	bipush 3	
	bipush 1	
	iastore	
	getstatic PSL/temp1 [I	
	putstatic	PSL/p2 [I

; PRINTp1;)

	getstatic	PSL/p1 [I
	invokestatic PSL/print_array([I)V	

; PRINTp2;)

	getstatic	PSL/p2 [I
	invokestatic PSL/print_array([I)V	

	getstatic     PSL/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method
