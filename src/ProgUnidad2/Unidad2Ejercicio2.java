package ProgUnidad2;
//Ejercicio 2 Unidad2
/* 2. (Convertir de millas a km): Escribe un programa que lea millas como valor double de la consola y lo convierta en km mostrando el resultado. La fórmula para la conversión es: `1 milla = 1.6 km`
Ejemplo:
```
Enter miles: 96 
96 miles is 153.6 kilometers
```
*/
import java.util.Scanner;
public class Unidad2Ejercicio2 {


		public static void main(String[] args){
			
			double millas;
			double kilometros;		
			
			Scanner entrada = new Scanner(System.in);			
				System.out.println("Escriba las millas: ");                       
				millas = entrada.nextDouble();
			
				kilometros = millas * 1.6 ;
				System.out.println("Son: " + kilometros);
	          
	               		}
}
