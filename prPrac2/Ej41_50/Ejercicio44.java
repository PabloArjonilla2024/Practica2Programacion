package Ej41_50;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio44 {
/**
 * 44. Introducir la nota de una asignatura por teclado, que esté
 * comprendida entre 0 y 10 y escribir la nota en letra, atendiendo a:
 * 0 > Nota < 3 Muy deficiente
 * 3 >= Nota < 5 Insuficiente
 * 5 >= Nota < 6 Suficiente
 * 6 >= Nota < 7 Bien
 * 7 >= Nota < 9 Notable
 * 9 >= Nota =< 10 Sobresaliente
 * @param args
 */
	public static void main(String[] args) {
		byte nota;
		try {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Escribe la nota: ");
		nota = sc.nextByte();
		
		if(nota < 0 || nota > 10) {
			System.out.println("La nota debe estar entre 0 y 10");
		}else if(nota < 3) {
			System.out.println("Muy deficiente");
		} else if(nota < 5) {
			System.out.println("Insuficiente");
		} else if(nota < 6) {
			System.out.println("Suficiente");
		} else if(nota < 7) {
			System.out.println("Bien");
		} else if(nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}

		switch(nota) {
		case 1,2,3 -> {
			System.out.println("Muy deficiente");
		}
		case 4,5 -> {
			System.out.println("Insuficiente");
		}
		case 6 -> {
			System.out.println("Suficiente");
		}
		case 7 -> {
			System.out.println("Bien");
		}
		case 8 -> {
			System.out.println("Notable");
		}
		case 9,10 -> {
			System.out.println("Sobresaliente");
		}
		}
		sc.close();
		} catch(InputMismatchException e) {
			System.out.println("El número es inválido.");
		}
		
		
	}

}
