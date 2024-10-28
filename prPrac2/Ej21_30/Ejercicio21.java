package Ej21_30;

import java.util.Scanner;


public class Ejercicio21 {

	public static void main(String[] args) {
		//21. Programa que imprima la tabla de multiplicar
		//de un número entero (entre 1 y 10).
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número para mostrarte la tabla (1 al 10): ");
		n = sc.nextInt();
		
		if(n <= 0 || n >= 11) {
			System.out.println("Debes escribir un número entre 1 y 10.");
			sc.close();
		} else {
			System.out.println("La tabla de multiplicación del " + n + " es:");
			for(int vueltas = 10; vueltas >= 0; vueltas--) {
				System.out.println(n + " x " + vueltas + " = " + (n*vueltas));
			}
			sc.close();
		}

	}

}
