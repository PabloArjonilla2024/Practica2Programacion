package Ej31_40;

import java.util.Scanner;

public class Ejercicio35 {
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
		long aFinal = 1, bFinal = 1, abFinal = 1;
		double resultado;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		a = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		b = sc.nextInt();
		
		if(a<b || a<0 || b<0) {
			System.out.print("Datos no válidos para el cálculo.");
		}
		
		for(int i = 2; i <= a; i++){
			aFinal *= i;
		}
		
		for(int x = 2; x <= b; x++){
			bFinal *= x;
		}
		for(int n = 2; n <= (a - b); n++){
			abFinal *= n;
		}
		resultado = (double)aFinal/(bFinal*abFinal);
		System.out.print("El número combinatorio de " + a + " sobre " + b + " es: " + resultado);
		sc.close();
	}	

}



