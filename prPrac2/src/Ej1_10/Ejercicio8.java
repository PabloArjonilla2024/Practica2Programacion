package Ej1_10;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//8. Realizar un algoritmo que lea dos valores desde teclado
		//y diga si cualquiera de ellos divide de forma entera al otro.

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el prmier número: ");
		num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("Ninguna de la división es entera.");
		} else {
			System.out.print("Hay uno de ellos que si divide de forma entera.");
		}
		
		sc.close();
	}

}
