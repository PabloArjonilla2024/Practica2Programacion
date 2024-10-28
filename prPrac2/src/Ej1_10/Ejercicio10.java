package Ej1_10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//10. Realizar un algoritmo para deducir el mayor de tres valores
		//introducidos por teclado.
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el primer valor: ");
		num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo valor: ");
		num2 = sc.nextInt();
		
		System.out.print("Escribe el tercer valor: ");
		num3 = sc.nextInt();
		
		if(num1 < num2 && num2 < num3) {
			System.out.print("El valor más grande es el " + num3);
		} else if(num1 > num2 && num1 > num3) {
			System.out.println("El valor más grande es el " + num1);
		} else {
			System.out.println("El valor más grande es el " + num2);
		}
		
		sc.close();
	}

}
