package ProgUnidad2;
/*
1. Comprueba los valores máximos y mínimos límites de los tipos básicos: byte, short, int, long, float, double.

TIPO 		Número de bits		  Rango
byte			8 	       -128 a 127
short  			16 	     -32768 a 32767
int  			16 	-2147483648 a 2147483647
long 			32 	-2147483648 a 2147483647
float 			32 	    3.4E-38 a 3.4E+38
double 			64 	   1.7E-308 a 1.7E+308



jshell> byte a = -128;
a ==> -128

jshell> byte a = -129;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte a = -129;
|           ^--^

jshell> byte a = 127;
a ==> 127

jshell> byte a = 128;
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte a = 128;
|           ^-^
------------------------------------------------------------------------------------------------<
jshell> short a = -32768;
a ==> -32768

jshell> short a = -32769;
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short a = -32769;
|            ^----^

jshell> short a = 32767;
a ==> 32767

jshell> short a = 32768;
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short a = 32768;
|            ^---^

------------------------------------------------------------------------------
jshell>  int a = -2147483648;
a ==> -2147483648

jshell>  int a = -2147483649;
|  Error:
|  integer number too large
|   int a = -2147483649;
|            ^

jshell>  int a = 2147483647;
a ==> 2147483647

jshell>  int a = 2147483648;
|  Error:
|  integer number too large
|   int a = 21474836
--------------------------------------------------------------------
jshell> long a = 2147483648;
|  Error:
|  integer number too large
|  long a = 2147483648;
|           ^

jshell> long a = 2147483647;
a ==> 2147483647

jshell> long a = -2147483648;
a ==> -2147483648

jshell> long a = -2147483649;
|  Error:
|  integer number too large
|  long a = -2147483649;
|            ^
-----------------------------------------------------------------------
*/

