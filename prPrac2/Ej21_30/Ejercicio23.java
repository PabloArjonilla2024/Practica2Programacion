package Ej21_30;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		//23. Hacer un algoritmo que nos sume los números naturales,
		//comprendidos entre dos números introducidos por teclado,
		//debéis tener en cuenta si el primero de los números no es más pequeño que el segundo.
		
		int num1, num2, total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.print("El primer número debe ser más pequeño que el segundo");
			sc.close();
		}
		
		while(num1 <= num2) {
			total = total + num1++;
		}
		
		System.out.println("El número final es " + total);
		
		sc.close();

	}

}
