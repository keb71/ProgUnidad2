package ProgUnidad2;
/*Ejercico 8 Unidad2*/
/*
Escribe un programa que muestre la siguiente tabla calculando el punto medio de dos puntos. El punto medio se calcula sumando las dos coordenadas por separado y dividirla entre 2.
```
  a      b       Punto medio
(0, 0) (2, 1)  (1.0, 0.5)
(1, 4) (4, 2)  (2.5, 3.0)
(2, 7) (6, 3)  (4.0, 5.0)
(3, 9) (10, 5) (6.5, 7.0)
(4, 11) (12, 7) (8.0, 9.0)
```
*/

public class Unidad2Ejercicio8 {

	public static void main(String[] args){
	
	System.out.println("El punto medio es      a         b      punto medio");
	System.out.println("                     (0,0)     (2,1) "  + "   ("+   (0.0D+2.0D)/2.0D +"," + (0.0D+1.0D)/2.0D +")") ;
	System.out.println("                     (1,4)     (4,2) "  + "   ("+   (1.0D+4.0D)/2.0D +"," + (4.0D+2.0D)/2.0D +")") ;
	System.out.println("                     (2,7)     (6,3) "  + "   ("+   (2.0D+6.0D)/2.0D +"," + (7.0D+3.0D)/2.0D +")") ;
	System.out.println("                     (3,9)     (10,5) "  + "  ("+   (3.0D+10.0D)/2.0D +"," + (9.0D+5.0D)/2.0D +")") ;
	System.out.println("                     (4,11)    (12,7) "  + "  ("+   (4.0D+12.0D)/2.0D +"," + (11.0D+7.0D)/2.0D +")") ;
	}
}
