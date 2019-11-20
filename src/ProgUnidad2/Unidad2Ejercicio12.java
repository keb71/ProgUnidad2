package ProgUnidad2;
//Ejercicio 12 Unidad 2
/*
12. (Separación de los dígitos en un entero) Escribe una aplicación que reciba del usuario un número compuesto por cinco dígitos, que separe ese número en sus dígitos individuales y los imprima, cada uno separado de los demás 
por tres espacios. Por ejemplo, si el usuario escribe el número 42339, el programa debe imprimir
```
4   2   3   3   9
```
Nota: 
- si hacemos 42339 % 10 = 9
- si hacemos 42339 /10 = 4233
- Y así podemos saber cuál es la descomposición y además ir reduciendo el número hasta llegar al último
*/
import java.util.Scanner;
public class Unidad2Ejercicio12 {
		
			public static void main(String[] args){
	   		 
	 Scanner entrada = new Scanner(System.in);
	int numero;
	 
	System.out.println("\nIntroduzca un numero de cinco cifras: ");
	numero = entrada.nextInt();
	  
	System.out.printf("%d ",   numero/10000);
	System.out.printf("%d ", (numero%10000)/1000);
	System.out.printf("%d ", ((numero%10000)%1000)/100);
	System.out.printf("%d ", (((numero%10000)%1000)%100)/10);
	System.out.printf("%d\n ", ((((numero%10000)%1000)%100)%10));
	}
	}
	/*
	ingrese el numero 54386, y el resultado es;
	Introduzca un numero de cinco cifras:
	5 4 3 8 6
	*/

