package ProgUnidad2;
/*
 jshell> System.out.printf("amount is %f %e\n", 32.32, 32.32);
amount is 32,320000 3,232000e+01
$2 ==> java.io.PrintStream@370736d


jshell> System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
amount is 32,33% 3,2320e+01
$3 ==> java.io.PrintStream@370736d9


jshell> System.out.printf("%6b\n", (1 > 2));
 false
$4 ==> java.io.PrintStream@370736d9


jshell> System.out.printf("%6s\n", "Java");
  Java
$5 ==> java.io.PrintStream@370736d9


jshell> System.out.printf("%−6b%s\n", (1 > 2), "Java");
|  Exception java.util.UnknownFormatConversionException: Conversion = '−'
|        at Formatter.checkText (Formatter.java:2732)
|        at Formatter.parse (Formatter.java:2708)
|        at Formatter.format (Formatter.java:2655)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#6:1)


jshell> System.out.printf("%6b%−8s\n", (1 > 2), "Java");
|  Exception java.util.UnknownFormatConversionException: Conversion = '−'
|        at Formatter.checkText (Formatter.java:2732)
|        at Formatter.parse (Formatter.java:2718)
|        at Formatter.format (Formatter.java:2655)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#7:1)


jshell> System.out.printf("%,5d %,6.1f\n", 312342, 315562.932);
312.342 315.562,9
$8 ==> java.io.PrintStream@370736d9




jshell> System.out.printf("%05d %06.1f\n", 32, 32.32);
00032 0032,3
$9 ==> java.io.PrintStream@370736d9 
 */
