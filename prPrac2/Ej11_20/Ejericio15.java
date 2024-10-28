package Ej11_20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejericio15 {

	public static void main(String[] args) {
		//15. Programa que lea 3 números de teclado y los muestre en
		//pantalla de forma ordenada.
		
		int a,b,c;		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		a = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		b = sc.nextInt();
		
		System.out.print("Escribe el tercer número: ");
		c = sc.nextInt();
		
		int []x = {a, b, c};
		Arrays.sort(x);
		
		System.out.print("El orden es: ");
		
		 for (int num : x) {
	            System.out.print(num + " ");
	        }
		
		sc.close();

	}

}
