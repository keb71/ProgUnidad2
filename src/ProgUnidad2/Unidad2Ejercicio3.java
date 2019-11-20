package ProgUnidad2;
/*
Crea un programa llamado **MostrarTiempo.java** que tomando una 
cantidad por teclado de segundos (entero positivo) muestre la cantidad 
de minutos y segundos contenidos. Ejemplo salida:
```
Introduzca un entero para segundos: 500
500 seconds son 8 minutos y 20 segundos
```
Nota: para calcular los segundos se puede hacer uso de módulo pues el 
resto son los segundos que faltan.
*/
import java.util.Scanner;
public class Unidad2Ejercicio3 {
	//Ejercicio 3 Unidad 2

	
		public static void main(String[] args){
			int segundosResto;
			int segundos;
			int minutos;
				Scanner entrada = new Scanner(System.in);
				System.out.println("Introduzca un entero para segundos: ");
				segundos = entrada.nextInt();
					minutos = (segundos * 1) / 60 ;
					segundosResto = (segundos * 1) % 60 ;
				System.out.println(segundos + " seconds son " + minutos + " minutos y " + segundosResto + " segundos");
	}
}
