package Ej21_30;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		//26. Hacer un algoritmo que nos sume,
		//los números naturales que sean pares,
		//y menores que un número introducido por teclado.
		try {
		int num, var = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número natural: ");
		num = sc.nextInt();
		
		final int num2 = num;
		
		sc.close();
		for(;num >= 2; num--) {
			if(num % 2 == 0) {
				System.out.print(num + " ");
				var += num;
			}
		}
		
		System.out.print("La suma total de los números naturales pares y menores que " + num2 + " es " + var);
		
		} catch(Exception err) {
			System.out.print("Debes introducir un número válido.");
		}
		
		
	}

}
