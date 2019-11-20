package ProgUnidad2;
/*Ejercico 7 Unidad2*/
/*
Crear un conversor de unidades informáticas. El programa debe pedir la entrada por teclado de la cantidad y luego de la unidad origen: 
0 = byte
1 = Kilobyte
2 = Megabyte
3 = Gigabyte
4 = Terabyte
Y luego debe realizar la conversión para el resto de unidades. Es decir, si se pasan Kb debe pasar a byte, MB, GB y TB etc.
*/
import java.util.Scanner;
public class Unidad2Ejercicio7 {
	
	public static void main(String[] args){
	   double b;
	   double k;
	   double m;
	   double g;
	   double t;
	   int opcion;
	Scanner entrada = new Scanner(System.in);

	System.out.println("Elija una opcion: \n 1- Ingrese un numero en byte \n 2- Ingrese un numero en kilobyte \n 3- Ingrese un numero en Megabyte \n 4- Ingrese un numero en Gigabyte \n 5- Ingrese un numero en Terabyte ");
	  opcion = entrada.nextInt();

	if(opcion == 1){
	 System.out.println("Ingrese un numero en Byte: ");
		b = entrada.nextDouble();
		k = b / (1024);
	    	m = b / (1024*1024);
		g = b / Math.pow(1024,3);
		t = b / Math.pow(1024,4);
	 System.out.println("El numero " + b + " es igual a " + k + " Kilobyte: ");
	 System.out.println("El numero " + b + " es igual a " + m + " Megabyte: ");
	 System.out.println("El numero " + b + " es igual a " + g + " Gigabyte: ");
	 System.out.println("El numero " + b + " es igual a " + t + " Terabyte: ");
	}
	if(opcion == 2){
	System.out.println("Ingrese un numero en Kilobyte: ");
		k = entrada.nextDouble();
		b = k * (1024);
	    	m = k / (1024);
		g = k / Math.pow(1024,2);
		t = k / Math.pow(1024,3);
	 System.out.println("El numero " + k + " es igual a " + b + " byte: ");
	 System.out.println("El numero " + k + " es igual a " + m + " Megabyte: ");
	 System.out.println("El numero " + k + " es igual a " + g + " Gigabyte: ");
	 System.out.println("El numero " + k + " es igual a " + t + " Terabyte: ");
	}
	if(opcion == 3){
	System.out.println("Ingrese un numero en Megabyte: ");
		m = entrada.nextDouble();
		b = m * Math.pow(1024,2);
	    	k = m * (1024);
		g = m / (1024);
		t = m / Math.pow(1024,2);
	 System.out.println("El numero " + m + " es igual a " + b + " byte: ");
	 System.out.println("El numero " + m + " es igual a " + k + " Kilobyte: ");
	 System.out.println("El numero " + m + " es igual a " + g + " Gigabyte: ");
	 System.out.println("El numero " + m + " es igual a " + t + " Terabyte: ");
	}
	if(opcion == 4){
	System.out.println("Ingrese un numero en Gigabyte: ");
		g = entrada.nextDouble();
		b = g * Math.pow(1024,3);
	    	k = g * Math.pow(1024,2);
		m = g * (1024);
		t = g / (1024);
	 System.out.println("El numero " + g + " es igual a " + b + " byte: ");
	 System.out.println("El numero " + g + " es igual a " + k + " Kilobyte: ");
	 System.out.println("El numero " + g + " es igual a " + m + " Megabyte: ");
	 System.out.println("El numero " + g + " es igual a " + t + " Terabyte: ");
	}
	if(opcion == 5){
	System.out.println("Ingrese un numero en Terabyte: ");
		t = entrada.nextDouble();
		b = t * Math.pow(1024,4);
	    	k = t * Math.pow(1024,3);
		m = t * Math.pow(1024,2);
		g = t * (1024);
	 System.out.println("El numero " + t + " es igual a " + b + " byte: ");
	 System.out.println("El numero " + t + " es igual a " + k + " Kilobyte: ");
	 System.out.println("El numero " + t + " es igual a " + m + " Megabyte: ");
	 System.out.println("El numero " + t + " es igual a " + g + " Gigabyte: ");
	}

	}
}
