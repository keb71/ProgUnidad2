package ProgUnidad2;
/*
Introduce el número de años como entero, por ejemplo 5: 15
Introduce la cantidad del pŕestamo, por ejemplo: 120000.95: 250000 
La mensualidad a pagar es: $2076.02
El pago total es: $373684.53
```
*/
import java.util.Scanner;
public class Unidad2Ejercicio14 {
		
			public static void main(String[] args){
	   		 
	 		Scanner entrada = new Scanner(System.in);
				double tasaDeInteresMensual;
	 			double totalPrestamo;
				double numAnyos;
				double pagoMensual;
				double totalPago;

			System.out.println("Introduzca la tasa de interes: ");
			tasaDeInteresMensual = entrada.nextDouble();

			System.out.println("Introduzca la cantidad total del préstamo: ");
			totalPrestamo = entrada.nextDouble();

			System.out.println("Introduzca la cantidad de años de pagos: ");
			numAnyos = entrada.nextDouble();
	//no puedo hacer la formula!!!

	pagoMensual = ( totalPrestamo * tasaDeInteresMensual ) / (1 - 1 / ((1  + tasaDeInteresMensual ) ^ ( numAnyos * 12 )));

		totalPago = pagoMensual * numAnyos * 12;
			
			System.out.println("La mensualidad a pagar es: " + pagoMensual);
			System.out.println("El pago total es: " + totalPago);
	
	}
}
