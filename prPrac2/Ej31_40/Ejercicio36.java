package Ej31_40;

import java.util.Scanner;

public class Ejercicio36 {
/**
 * 36. Realizar un programa que cuente los números positivos y negativos que aparezcan en una lista de
números que se introducen por teclado. El proceso finalizará introduciendo el número 0.
 * @param args
 */
	public static void main(String[] args) {
		int num, pos = 0, neg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número: ");
		num = sc.nextInt();
		while(num != 0) {
			if(num < 0) {
				neg += 1;
			} else if(num > 0) {
				pos += 1;
			} else if(num == 0) {
				num = 0;
			}
			System.out.print("Escribe otro número: ");
			num = sc.nextInt();
		}
		System.out.println("En total se han mandado " + neg + " números negativos y " + pos + " números positivos.");
		
		sc.close();

	}

}
