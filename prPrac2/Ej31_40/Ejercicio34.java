package Ej31_40;

import java.util.Scanner;

public class Ejercicio34 {
/**
 * 34. Hacer un algoritmo que calcule la suma de la serie de Fibonacci
 * para un término n que se introduce por teclado. La serie de Fibonacci
 * tiene la siguiente expresión:
 * 
 * F(0) = 1
 * F(1) = 1
 * F(n) = F(n-1) + F(n-2)
 * La serie de Fibonacci es: 1 1 2 3 5 8 13 21 34 55 ...
 * aux1(1) aux2(1), despues aux1 + aux2(aux1 + aux2)
 * @author Pablo Arjonilla Cuadrado
 */
	public static void main(String[] args) {
		int tot1 = 1, tot2 = 1, fibo = 0, total;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número al que quieres llegar utilizando Fibonacci: ");
		total = sc.nextInt();
		
		System.out.print(tot1 + " " + tot2 + " ");
		
		while(fibo < total) {
			fibo = tot1 + tot2;
			System.out.print(fibo + " ");
			tot1 = tot2;
			tot2 = fibo;
			
		}
		
		sc.close();
	}

}
