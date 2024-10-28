package Ej31_40;

import java.util.Scanner;

public class Ejrcicio35v9 {
/**
 * 35. Hacer un algoritmo que calcule el valor de un número
 * combinatorio a partir de dos valores, a y b, que
 * se introducen por teclado, aplicando la siguiente fórmula:
 * @param args
 */
	//Factorial de 3 es 3*3 + 3*2 + 3*1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		double resultado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		a = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		b = sc.nextInt();
		
		if(a<b || a<0 || b<0) {
			System.out.print("Datos no válidos para el cálculo.");
		}

		resultado = (double)factorial(a)/(factorial(b)*factorial(a-b));
		System.out.print("El número combinatorio de " + a + " sobre " + b + " es: " + resultado);
		sc.close();
	}
	
	
	
	/**
	 * Método que calcula el factorial de un número
	 * El factorial de un numero se calcula multiplicando el numero
	 * por todos los inferiores hasta el numero 1
	 * 
	 * Ejemplo: 5! = 5x4x3x2x1
	 * 			0! = 1 (Caso especial)
	 * 
	 * No existe el factorial de números negativos
	 * @param args
	 */
	public static long factorial(int num) {
		long fact = 1;
		for(int i = 2; i <= num; i++){
			fact *= i;
		}
		return fact;

	}
	
	

}



