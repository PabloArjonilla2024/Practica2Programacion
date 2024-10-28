package Ej41_50;

import java.util.Scanner;

public class Ejercicio43 {
/**
 * 43. Hacer un algoritmo para que introducido el número de mes lo
 * visualice en letra. Por ejemplo, si nos dan el número 6, escribiremos “Junio”.
 * @param args
 */
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número del mes: ");
		num = sc.nextInt();
			switch(num) {
			case 1: {
				System.out.println("El número de mes " + num + " es Enero");
				}break;
			case 2: {
				System.out.println("El número de mes " + num + " es Febrero");
				}break;
			case 3: {
				System.out.println("El número de mes " + num + " es Marzo");
				}break;
			case 4: {
				System.out.println("El número de mes " + num + " es Abril");
				}break;
			case 5: {
				System.out.println("El número de mes " + num + " es Mayo");
				}break;
			case 6: {
				System.out.println("El número de mes " + num + " es Junio");
				}break;
			case 7: {
				System.out.println("El número de mes " + num + " es Julio");
				}break;
			case 8: {
				System.out.println("El número de mes " + num + " es Agosto");
				}break;
			case 9: {
				System.out.println("El número de mes " + num + " es Septiembre");
				}break;
			case 10: {
				System.out.println("El número de mes " + num + " es Octubre");
				}break;
			case 11: {
				System.out.println("El número de mes " + num + " es Noviembre");
				}break;
			case 12: {
				System.out.println("El número de mes " + num + " es Diciembre");
				}break;
			default: {
				System.out.println("El número de mes " + num + " es inválido.");
			}
			}
		sc.close();
	}

}
