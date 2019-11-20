package ProgUnidad2;
//Ejercicio 6 Unidad 2
/*
6. **Lab Práctico**

Puedes utilizar la función `System.currentTimeMillis()` que devuelve el número total de milisegundos desde el 01/01/1970. Este tiempo se llama **Unix epoch**. Comienza en 1970 que es cuando se introdujo Unix. 

Puedes utilizar este método para saber cuál es el minuto, hora y segundo actuales:
* Obtener el total de milisegundos con `System.currentTimeMillis()`. Obtenlo en una variable totalMilisegundos.
* Obtener el total de segundos en una variable totalSegundos (totalMilisegundos/1000).
* Obtener el segundo en el que estamos (actual), simplemente con totalSegundos % 60.
* Obtener el númeto total de minutos: totalSegundos / 60 en una variable totalMinutos.
* Obtener el minuto actual mediante: totalMinutos % 60.
* Obtener el número total de horas mediante: totalMinutos / 60 en una variable totalHoras.
* Obtener la hora actual mediante totalHoras % 24.

El programa debe de calcular todo lo anterior y mostrar el mensaje con los cálculos hechos de la hora actual:
`La hora del sistema es 17:35:07 GMT`
*/
public class Unidad2Ejercicio6 {

	public static void main(String[] args){

	//System.out.println(System.currentTimeMillis());
	long totalMilisegundos = System.currentTimeMillis();
	long totalSegundos = totalMilisegundos / 1000;
	int segundoActual = (int) (totalSegundos % 60);
	long totalMinutos = totalSegundos / 60;
	int minutoActual = (int) (totalSegundos % 60);
	long totalHoras = totalMinutos / 60;
	int horaActual = (int)(totalHoras % 24);



	System.out.printf("La hora del sistema es:  %d : %d : %d" ,  horaActual , minutoActual , segundoActual);


	System.out.println("\n \n El total milisegundos es " + totalMilisegundos);
	System.out.println("\n El total de segundos es " + totalSegundos);
	System.out.println("\n El total de minutos " + totalMinutos);
	System.out.println("\n El total de horas es " + totalHoras);
	}
}
