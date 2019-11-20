package ProgUnidad2;
/*
7. Según la sentencia `char c = '\u2277'` pasar a byte, short, int, long, float y double y revisa el resultado.


jshell> char c = '\u2277';
c ==> '≷'

jshell> (short) c;
$33 ==> 8823

jshell> byte  c = (byte) '\u2277';
c ==> 119



jshell> char c = '\u2277';
c ==> '≷'

jshell> (short) c;
$23 ==> 8823

jshell> char c = '\u2277';
c ==> '≷'

jshell> (int) c;
$25 ==> 8823


jshell> char c = '\u2277';
c ==> '≷'

jshell> (long) c;
$27 ==> 8823

jshell> char c = '\u2277';
c ==> '≷'

jshell> (float) c;
$29 ==> 8823.0

jshell> char c = '\u2277';
c ==> '≷'

jshell> (double) c;
$31 ==> 8823.0

*/



public class Unidad2Ejercicio21 {
	public static void main(String[] args) {
        // Display the header of the table
 		System.out.printf("%10s%10s%10s%10s%10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
 
  		// Display values for 30 degrees
  		int degrees = 30;
  		double radians = Math.toRadians(degrees);
 		System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

 		// Display values for 60 degrees
 		int degrees1 = 60;
 		double radians1 = Math.toRadians(degrees1);
 		System.out.printf("%10d%10.4f%10.4f%10.4f%10.4f\n", degrees1,radians1, Math.sin(radians1), Math.cos(radians1), Math.tan(radians1));
	}
}
/*
DEL ORIGINAL SE MODIFICO SACANDO '-'
esto es lo que imprime:
   Degrees   Radians      Sine    Cosine   Tangent
        30    0.5236    0.5000    0.8660    0.5774
        60    1.0472    0.8660    0.5000    1.7321
*/



