package ProgUnidad2;

/*

jshell> System.out.printf("%5d %d", 1, 2, 3);
    1 2$27 ==> java.io.PrintStream@1a968a59

jshell> System.out.printf("%5d %f", 1);
    1 |  Exception java.util.MissingFormatArgumentException: Format specifier 'Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%f'
	at java.base/java.util.Formatter.format(Formatter.java:2672)
	at java.base/java.io.PrintStream.format(PrintStream.java:1053)
	at java.base/java.io.PrintStream.printf(PrintStream.java:949)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.error(JShellTool.java:728)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.errormsg(JShellTool.java:867)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayEvalException(JShellTool.java:3451)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayException(JShellTool.java:3425)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayException(JShellTool.java:3418)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.handleEvent(JShellTool.java:3582)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processSource(JShellTool.java:3550)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processSourceCatchingReset(JShellTool.java:1301)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processInput(JShellTool.java:1203)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.run(JShellTool.java:1176)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.start(JShellTool.java:975)
	at jdk.jshell/jdk.internal.jshell.tool.JShellToolBuilder.start(JShellToolBuilder.java:254)
	at jdk.jshell/jdk.internal.jshell.tool.JShellToolProvider.main(JShellToolProvider.java:120)
alumnot@alumnot:~$ jshell
|  Welcome to JShell -- Version 11.0.4
|  For an introduction type: /help intro

jshell> System.out.printf("%5d %f", 1, 2);
    1 |  Exception java.util.IllegalFormatConversionException: f != java.lang.Integer
|        at Formatter$FormatSpecifier.failConversion (Formatter.java:4426)
|        at Formatter$FormatSpecifier.printFloat (Formatter.java:2951)
|        at Formatter$FormatSpecifier.print (Formatter.java:2898)
|        at Formatter.format (Formatter.java:2673)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#1:1)


jshell> System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);
Exception in thread "main" java.util.MissingFormatWidthException: %0.3f
	at java.base/java.util.Formatter$FormatSpecifier.checkNumeric(Formatter.java:3176)
	at java.base/java.util.Formatter$FormatSpecifier.checkFloat(Formatter.java:3155)
	at java.base/java.util.Formatter$FormatSpecifier.<init>(Formatter.java:2876)
	at java.base/java.util.Formatter.parse(Formatter.java:2713)
	at java.base/java.util.Formatter.format(Formatter.java:2655)
	at java.base/java.io.PrintStream.format(PrintStream.java:1053)
	at java.base/java.io.PrintStream.printf(PrintStream.java:949)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.error(JShellTool.java:728)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.errormsg(JShellTool.java:867)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayEvalException(JShellTool.java:3451)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayException(JShellTool.java:3425)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.displayException(JShellTool.java:3418)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.handleEvent(JShellTool.java:3582)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processSource(JShellTool.java:3550)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processSourceCatchingReset(JShellTool.java:1301)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.processInput(JShellTool.java:1203)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.run(JShellTool.java:1176)
	at jdk.jshell/jdk.internal.jshell.tool.JShellTool.start(JShellTool.java:975)
	at jdk.jshell/jdk.internal.jshell.tool.JShellToolBuilder.start(JShellToolBuilder.java:254)
	at jdk.jshell/jdk.internal.jshell.tool.JShellToolProvider.main(JShellToolProvider.java:120)
alumnot@alumnot:~$ jshell
|  Welcome to JShell -- Version 11.0.4
|  For an introduction type: /help intro

jshell> System.out.printf("%08s\n", "Java");
|  Exception java.util.FormatFlagsConversionMismatchException: Conversion = s, Flags = 0
|        at Formatter$FormatSpecifier.failMismatch (Formatter.java:4422)
|        at Formatter$FormatSpecifier.checkBadFlags (Formatter.java:3151)
|        at Formatter$FormatSpecifier.checkGeneral (Formatter.java:3109)
|        at Formatter$FormatSpecifier.<init> (Formatter.java:2870)
|        at Formatter.parse (Formatter.java:2713)
|        at Formatter.format (Formatter.java:2655)
|        at PrintStream.format (PrintStream.java:1053)
|        at PrintStream.printf (PrintStream.java:949)
|        at (#1:1)

*/