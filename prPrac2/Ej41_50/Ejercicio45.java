package Ej41_50;

import java.util.Scanner;

public class Ejercicio45 {
/**
 * 45. Hacer un algoritmo para que nos calcule la estadística de una serie de nums
 * introducidas por teclado. La serie finalizará con la introducción del 0, sabiendo que:
 * 1 > num < 5 Deficiente
 * 5 >= num < 6 Suficiente
 * 6 >= num < 7 Bien
 * 7 >= num < 9 numble
 * 9 >= num =< 10 Sobresaliente
 * @param args
 */
	public static void main(String[] args) {
		float num, md = 0, i = 0, suf = 0, b = 0, n = 0, sob = 0, contNotas = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe la primera nota:");
		num = sc.nextFloat();
		while(num != 0) {
			if(num == 0) {
				System.out.println("Se ha salido del programa.");
			}else if(num < 0 || num > 10) {
				System.out.println("La nota debe estar entre 0 y 10");
			}else if(num < 3) {
				md++;
			} else if(num < 5) {
				i++;
			} else if(num < 6) {
				suf++;
			} else if(num < 7) {
				b++;
			} else if(num < 9) {
				n++;
			} else {
				sob++;
			}
			
			System.out.print("Escribe otra nota (0 para salir): ");
			num = sc.nextFloat();
					
		}
		contNotas = sob+n+b+suf+i+md;
		
		if(sob != 0) System.out.println((sob * 100 / contNotas)+ "% de sobresalientes");
		if(n != 0) System.out.println((n * 100 / contNotas)+ "% de notables");
		if(b != 0) System.out.println((b * 100 / contNotas)+ "% de bien");
		if(suf != 0) System.out.println((suf * 100 / contNotas)+ "% de suficientes");
		if(i != 0) System.out.println((i * 100 / contNotas)+ "% de insuficientes");
		if(md != 0) System.out.println((md * 100 / contNotas)+ "% de muy deficiente");
		
		
		sc.close();
	}

}
