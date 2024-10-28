package Ej1_10;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) throws InterruptedException {
		//7. Hacer un algoritmo para ver si un número introducido por teclado es par o impar.
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el número para ver si es par o impar: ");
		numero = sc.nextInt();
		
		if(numero%2 == 0) {
			System.out.print("El número es par.");
		} else {
			System.out.print("El número es impar.");
		};
		
		
		System.out.println(numero%2 == 0 ? "Número par": "Número impar");
		
			Thread.sleep(5000);
	
		
		sc.close();
	}

}
