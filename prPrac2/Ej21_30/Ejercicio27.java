package Ej21_30;

import java.util.Scanner;

public class Ejercicio27 {
/**
 * 27. Hacer un algoritmo para calcular el factorial
 * de un número natural positivo, se debe tener en cuenta si
 * el número no es positivo, ya que no existe el
 * factorial de los números negativos
 */
	public static void main(String[] args) {
		int num1, resultado = 1;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número natural positivo: ");
		num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.print("El número debe ser positivo natural.");
		} else {
			
		for (int i = 1; i <= num1; i++) {
			resultado *= i;
        }
		
		System.out.println("El resultado de multiplicar el factorial de " + num1 + " es " + resultado);
		}
		sc.close();
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error, prueba en escribir un número natural positivo.");
		}

	}

}
