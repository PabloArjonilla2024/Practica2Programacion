package Ej41_50;

import java.util.Scanner;

public class Ejercicio42 {
/**
 * 42. Hacer un algoritmo para calcular si un número es primo o no.
 * En matemáticas, un número primo es un número natural mayor que 1 que tiene
 * únicamente dos divisores positivos distintos: él mismo y el 1.
 * @param args
 */
	public static void main(String[] args) {
		int a, divisor = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número para ver si es primo o no");
		a = sc.nextInt();
		
		for(int i = 1; a % i == 0; i++) {
			if(a % i == 0) {
				divisor++;
			}
		}
		if(divisor > 2) {
			System.out.print("El número no es primo.");
		} else {
			System.out.print("El número es primo.");
		}
		sc.close();

	}

}
