package Ej11_20;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		//14. Diseñar un algoritmo para leer las longitudes de los
		//lados de un triángulo y determine que tipo de triángulo es, de acuerdo
		//a los siguientes casos: suponiendo que A es el mayor de los lados y que B y C
		//corresponden a los otros 2 lados:
		//Si A >= B + C No es un triángulo
		//
		//Si A² = B² + C² Triángulo rectángulo
		//Si A² > B² + C² Triángulo obtusángulo
		//Si A² < B² + C² Triángulo acutángulo

		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica el valor del lado A: ");
		a = sc.nextInt();
		
		System.out.print("Indica el valor del lado B: ");
		b = sc.nextInt();
		
		System.out.print("Indica el valor del lado C: ");
		c = sc.nextInt();

		sc.close();
		
		if(a >= b + c) {
			System.out.println("No es un triángulo.");
		} else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Triángulo rectángulo.");
		} else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Triángulo obtusángulo.");
		} else System.out.println("Triángulo acutángulo.");
		
	}

}
