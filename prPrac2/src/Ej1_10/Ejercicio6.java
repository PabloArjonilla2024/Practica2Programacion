package Ej1_10;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//6. Diseñar un algoritmo que nos permita saber el mayor de dos números introducidos.
		//Controlar el caso de que sean iguales.
		int numeroA, numeroB;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer número: ");
		numeroA = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		numeroB = sc.nextInt();
		
		if(numeroA == numeroB) {
			System.out.print("Los dos números son el mismo.");
		} else if(numeroA - numeroB < 0) {
			System.out.print("El primer número es más pequeño.");
		} else {
			System.out.println("El segundo número es más pequeño.");
		};
		
		sc.close();
	}

}
