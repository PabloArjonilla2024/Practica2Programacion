package Ej21_30;

import java.util.Scanner;

public class Ejercicio28 {
/**
 * 28. Hacer un algoritmo que imprima, sume y cuente los números pares que hay entre dos números
 * determinados, debéis tener en cuenta si el primero de los números no es más pequeño que el segundo
 */
	public static void main(String[] args) {
		
		int num1, num2, resultado = 0;
		int min = 0, max = 0, con = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		num2 = sc.nextInt();
		try {
		if(num1 > num2) {
			System.out.println("El primer número debe ser más pequeño que el segundo.");
			min = num2;
			max = num1;
		} else if (num1 == num2) {
			System.out.println("Los números deben ser distintos.");
			
		} else {		
			min = num1;
			max = num2;
		}
		
		for(con = min; con <= max; num2--) {
			if(con % 2 == 0) {
				System.out.print(con + " ");
				resultado += con;
				
			}
			con++;
		}
		System.out.println();
		
		System.out.println("Se han sumado " + con + " números y suman en total " + resultado);
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error.");
		}
		sc.close();

	}

}
