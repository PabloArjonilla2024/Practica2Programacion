package Ej21_30;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		
		//25. Programa que obtenga el cociente y el resto
		//de dos números enteros positivos mediante restas y sumas,
		//no podéis utilizar las operaciones de división (/) y de resto (%).
		int num1, num2, con = 0, resto = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		num1 = sc.nextInt();
				
		System.out.print("Escribe el segundo número: ");
		num2 = sc.nextInt();
		
		for(; num1>=num2; con++) {
			resto = num1 - num2;
			num1 = resto;
			
		}
		System.out.println("El resultado es " + con + " y el cociente es " + resto);
		
		
		sc.close();
	}

}
