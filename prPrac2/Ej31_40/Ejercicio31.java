package Ej31_40;

import java.util.Scanner;

public class Ejercicio31 {
/**
 * 31. Realizar un programa para calcular el valor máximo y el mínimo de una lista de n números que se
 * introducen por teclado, es decir, me indicarán cuántos valores se van a introducir, y se pedirán por
 * teclado los que nos hayan indicado.
 * @param args
 */
	public static void main(String[] args) {

		int repite;
		int mayor, menor, auxiliar;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número de veces que vas a escribir un número: ");
		repite = sc.nextInt();

		System.out.print("Escribe el siguente número: ");
		auxiliar = sc.nextInt();
		menor = auxiliar;
		mayor = auxiliar;
		while(repite > 1) {
	        System.out.println("Escribe otro números: ");
	        auxiliar = sc.nextInt();
	        
	        if(auxiliar < menor) {
	        	menor = auxiliar;
	        } else if (auxiliar > mayor) {
	        	mayor = auxiliar;
	        }
	        repite--;
		}
		System.out.print("El número más pequeño es " + menor + " y el más grande es " + mayor);
				
		sc.close();
		

	}

}
