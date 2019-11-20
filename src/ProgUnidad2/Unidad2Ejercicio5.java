package ProgUnidad2;
//Ejercicio 5 Unidad 2
/*
5. (Volumen de un triángulo) Escribe un programa que lee la longitud de los lados de un triángulo equilátero y calcula el area y y volumen utilizando las siguientes fórmulas:
```
Area = ( Sqrt(3) / 4 ) * lado^2

Volumen = area * longitud (todos los lados)
*/
import java.util.Scanner;
public class Unidad2Ejercicio5 {

	    public static void main(String[] args){
	        double lado;
	        double area;
	        double longitud;
	        double volumen;
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.println("Escriba la longitud de los lados de un triangulo equilatero: ");
	        lado = entrada.nextFloat();
	        
	        area = (Math.sqrt(3) / 4) * (lado * lado);
	        System.out.println("El area es: " + area);
	        
	        longitud = lado * 3;
	        volumen = area * longitud;
	        System.out.println("El volumen es: " + volumen);
	    }
	}
	/*
	lo que imprime al poner 4
	Escriba la longitud de los lados de un triangulo equilatero: 
	El area es: 6.928203230275509
	El volumen es: 83.13843876330611

	*/

