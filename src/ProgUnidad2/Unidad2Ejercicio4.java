package ProgUnidad2;

/*
Prueba las siguientes sentencias para ver cómo se capturan diversos tipos de datos. Prueba también a capturar distintos tipos de datos, por ejemplo en nextByte() introduce 128 para ver qué ocurre.
*/
/*1 Scanner input = new Scanner(System.in);
  System.out.print("Enter a byte value: ");
  byte byteValue = input.nextByte();
*/
import java.util.Scanner;
public class value{
	public static void main(String[] args){
	    	
	     Scanner input = new Scanner(System.in);
             System.out.print("Enter a byte value: ");
                byte byteValue = input.nextByte();
		  System.out.println(byteValue);
	}
}

/*
al ingresar 128 imprime
Enter a byte value: 
Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"128" Radix:10
al ingresar el valor 120
Enter a byte value: 120
*/
/*
5 System.out.print("Enter a short value: ");
 6 short shortValue = input.nextShort();
*/

import java.util.Scanner;
public class value{
	public static void main(String[] args){
	    	
	     Scanner input = new Scanner(System.in);
        System.out.print("Enter a short value: ");
          short shortValue = input.nextShort();
		  System.out.println(shortValue);
	
					}
}
/*
al ingresar 1487593 imprime
Enter a short value: 
Exception in thread "main" java.util.InputMismatchException: Value out of range. Value:"1487593" Radix:10
al ingresar el valor 1234
Enter a short value: 1234
*/

/*
 8 System.out.print("Enter an int value: ");
 9 int intValue = input.nextInt();
*/

import java.util.Scanner;
public class value{
	public static void main(String[] args){
	    	
	     Scanner input = new Scanner(System.in);
       System.out.print("Enter an int value: ");
 int intValue = input.nextInt();
		  System.out.println(intValue);
	
					}
}
/*
al ingresar 12345645897 imprime(un digito mas)
Enter an int value: 
Exception in thread "main" java.util.InputMismatchException: For input string: "12345645897"
al ingresar el valor 1234564589
Enter an int value: 1234564589
*/

/*
System.out.print("Enter a long value: ");
12 long longValue = input.nextLong();
*/


import java.util.Scanner;
public class value{
	public static void main(String[] args){
	    	
	     Scanner input = new Scanner(System.in);
 System.out.print("Enter a long value: ");
 long longValue = input.nextLong();
		  System.out.println(longValue);
	
					}
}
/*
al ingresar 12345645897891234567 imprime(un digito mas)
Enter a long value: 
Exception in thread "main" java.util.InputMismatchException: For input string: "12345645897891234567"
al ingresar el valor 1234564589789123456
Enter a long value: 1234564589789123456
*/

/*
System.out.print("Enter a float value: ");
15 float floatValue = input.nextFloat();
*/
import java.util.Scanner;
public class value{
	public static void main(String[] args){
	    	
	     Scanner input = new Scanner(System.in);
System.out.print("Enter a float value: ");
float floatValue = input.nextFloat();
		  System.out.println(floatValue);
	
					}
}
/*
al ingresar 1234567891234567891234567891234567891234 imprime(un digito mas)
Enter a float value: Infinity
al ingresar el valor 123456789123456789123456789123456789123
Enter a float value: 1.2345679E38
*/
// System.currentTimeMillis() `
import java.util.Scanner;
public class mostrarTiempo{
	public static void main(String[] args){
	    	
	  System.out.println(System.currentTimeMillis());
		}
}
/*
imprime el tiempo en milisegundos
1574073784555 (en el momento que lo ejecute)
*/

