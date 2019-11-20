package ProgUnidad2;
//Ejercicio 9 Unidad 2
/*
9. (Ejercicio Financiero): Supón que tienes 100€ de beneficio mensual en una cuenta bancaria con un interés anual de 3.75%. El interés mensual sería: 0.0375/12 = 0.003125. 

* Después del primer mes la ganancia sería: 100 + (0.003125 *100) = 100.3125
* Después del segundo mes sería de: (100.3125 + 100) * ( 1 + .003125) = 200.9384765625

Realiza un programa que calcule y muestre por pantalla el beneficio de los 6 primeros meses. De entrada pide el beneficio mensual, ej 100€.
*/
import java.util.Scanner;
public class Unidad2Ejercicio9 {

	  public static void main(String[] args){
	   double interesMensual = 0.003125;
	   double interesAnual= 0.0375;
	   double beneficio;
	   double beneficioMensual;
	   Scanner entrada = new Scanner(System.in);

	System.out.println("Ingrese el beneficio:  ");
	  beneficio = entrada.nextInt();
		beneficioMensual = beneficio + (interesMensual * beneficio); 
	System.out.println("Monto beneficio despues del primer mes " + beneficioMensual);
		double beneficioMensual2 = (beneficioMensual + beneficio) * ( 1 + interesMensual); 
	System.out.println("Monto beneficio despues del segundo mes " + beneficioMensual2);
		double beneficioMensual3 = (beneficioMensual2 + beneficio) * ( 1 + interesMensual); 
	System.out.println("Monto beneficio despues del tercer mes " + beneficioMensual3);
		double beneficioMensual4 = (beneficioMensual3 + beneficio) * ( 1 + interesMensual); 
	System.out.println("Monto beneficio despues del tercer mes " + beneficioMensual4);
		double beneficioMensual5 = (beneficioMensual4 + beneficio) * ( 1 + interesMensual); 
	System.out.println("Monto beneficio despues del tercer mes " + beneficioMensual5);
		double beneficioMensual6 = (beneficioMensual5 + beneficio) * ( 1 + interesMensual); 
	System.out.println("Monto beneficio despues del tercer mes " + beneficioMensual6);
	}
	}
	/*
	al ingresar beneficio 100 imprime:
	Ingrese el beneficio:  
	Monto beneficio despues del primer mes 100.3125
	Monto beneficio despues del segundo mes 200.9384765625
	Monto beneficio despues del tercer mes 301.8789093017578
	Monto beneficio despues del tercer mes 403.1347808933258
	Monto beneficio despues del tercer mes 504.70707708361743
	Monto beneficio despues del tercer mes 606.5967866995037
	*/

