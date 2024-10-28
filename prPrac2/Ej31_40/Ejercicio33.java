package Ej31_40;

import java.util.Scanner;

public class Ejercicio33 {
/**
 * 33. Hacer un algoritmo para calcular de forma automática las n primeras potencias de un número A. Se
introducen por teclado los números n (exponente) y A (base).
 * @author Pablo Arjonilla Cuadrado
 */
	public static void main(String[] args) {
		int exp, bas;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe la base: ");
		bas = sc.nextInt();
		
		System.out.println("Escribe el exponente: ");
		exp = sc.nextInt();
		sc.close();
		for(; exp >= 0; exp--) {
			System.out.println(bas + "^" + exp + " = " + Math.round(Math.pow(bas, exp)));
			
		}
		
	}

}
