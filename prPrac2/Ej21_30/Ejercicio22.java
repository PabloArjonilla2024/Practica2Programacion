package Ej21_30;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		//22. Programa que calcula la media aritmética
		//de una serie de números introducidos por teclado, que finaliza
		//con la introducción del valor 0.
		int num, suma= 0, cont = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introducir número: ");
		num = sc.nextInt();
		
		while(num>0) {
			suma = suma + num;
			cont++;
			
			System.out.println();
			num = sc.nextInt();
		}
		media = (double)suma/ cont;
		System.out.print("La media aritmética es: " + media);
		sc.close();
	}

}
