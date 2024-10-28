package Ej41_50;

import java.util.Scanner;

public class Ejercicio46 {
/*
 * 46. Con la ayuda de la clase Random, o bien el método random de la clase Math,
 * simular el lanzamiento de una moneda al aire y visualizar por pantalla si ha
 * salido cara o cruz. Repetir el proceso tantas veces como se quiera
 */
	public static void main(String[] args) {

		double randomNumber1 = Math.floor(Math.random() * 2);
		String e;
		Scanner sc = new Scanner(System.in);
		if(randomNumber1 == 1) {
			System.out.println("Ha salido --> Cara");
		} else {
			System.out.println("Ha salido --> Cruz");
		}
		
		System.out.print("¿Desea volver a lanzar la moneda? (S/N): ");
		e = sc.next();
				
		while(e.toUpperCase().equals("S")) {
			double randomNumber2 = Math.floor(Math.random() * 2);
			if(randomNumber2 == 1) {
				System.out.println("Ha salido --> Cara");
			} else {
				System.out.println("Ha salido --> Cruz");
			}
			System.out.print("¿Desea volver a lanzar la moneda? (S/N): ");
			e = sc.next();
		}
		
		sc.close();		

	}

}
