package Ej11_20;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		//13. Diseñar un algoritmo que lee un número y un valor entre 1 y 3,
		//y en función de este último calcula:
		//1.- El cuadrado del número
		//2.- El cubo del número
		//3.- La raíz cuadrada del número
		byte val;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el número con el que deseas trabajar: ");
		num = sc.nextInt();
		
		System.out.println("Escribe el número que deseas para seleccionar una opción.");
		
		System.out.println("1.- El cuadrado del número\n2.- El cubo del número\n3.- La raíz cuadrada del número");
		
		val = sc.nextByte();
		
		switch(val) {
		case 1: {
			System.out.println("El valor del cuadrado de " + num + " es " + Math.pow(num, 2) + ".");
		}break;
		case 2: {
			System.out.println("El cubo del número " + num + " es " + Math.pow(num, 3) + ".");
		}break;
		case 3: {
			System.out.println("La raíz cuadrada del número " + num + " es " + Math.pow(num, (float)0.5));
		}break;
		default: {
			System.out.println("Valor inválido, elige un número del 1 al 3.");
		}break;
		}
		sc.close();

	}

}
