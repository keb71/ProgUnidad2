package ProgUnidad2;
//Ejercicio 10 Unidad 2
/*
10. Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.

Ejemplo 1:
```
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
```
Ejemplo 2:
```
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen
*/
//no puedo hacer la parte de 40 y 60 porciento
import java.util.Scanner;
public class Unidad2Ejercicio10 {

			public static void main(String[] args){
	   double examen1;
	   double examen2;
	   double media;
	 
	  Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese la nota del primer examen:  ");
	  	examen1 = entrada.nextDouble();
		
	System.out.println("Que nota quiere sacar en el trimestre ");
		 media = entrada.nextDouble();

	 examen2 = ((media) - (examen1*0.4))/0.6 ;

			    System.out.println("Para tener un "+ media + " en el trimestre necesitas sacar un "+ examen2 + " en el segundo examen  ");
			}
	}
	/*
	7
	8.5
	Ingrese la nota del primer examen:  
	Que nota quiere sacar en el trimestre 
	Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen  
	---------------------------------------------------------------------------------------------
	8
	7
	Ingrese la nota del primer examen:  
	Que nota quiere sacar en el trimestre 
	Para tener un 7.0 en el trimestre necesitas sacar un 6.333333333333333 en el segundo examen  
	*/

