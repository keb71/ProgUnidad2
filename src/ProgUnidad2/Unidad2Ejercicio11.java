package ProgUnidad2;
//Ejercicio 11 Unidad 2
/*
11. Crea un un programa que pida dos puntos por teclado (x1, x2) e (y1, y2) y muestre la distancia de ambos puntos. La fórmula utilizada es sqrt((x2 - x1)^2 + (y2-y1)^2)) . El símbolo sqrt es raíz cuadrada y ^ es el exponente. Se pueden utilizar la funciones Math.pow y Math.sqrt.
*/
import java.util.Scanner;
public class Unidad2Ejercicio11 {
	
			public static void main(String[] args){
	   double x1; 
	   double x2;
	   double y1;
	   double y2;
	   double  distancia;
	  Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese dos puntos  (x1, x2) e (y1, y2):  ");
	x1 = entrada.nextInt();
	x2 = entrada.nextInt();
	y1 = entrada.nextInt();
	y2 = entrada.nextInt();

	distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));

	System.out.println("La distancia es:  " + distancia);
	
	}
}
