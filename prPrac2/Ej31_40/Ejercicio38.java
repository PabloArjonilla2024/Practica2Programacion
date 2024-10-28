package Ej31_40;

import java.util.Scanner;

public class Ejercicio38 {
/**
 * 38. Realizar un algoritmo con un menú de 4 opciones.
 * La selección de cada opción se realizará usando una variable de tipo carácter.
 * Cada una de las opciones realizará las siguientes tareas:
 * 	F: Calculará el factorial.
 * 	R: Calculará la raíz cuadrada de un número si es positivo y si es negativo, dará un mensaje de error.
 * 	C: Calculará el cuadrado de un número.
 * 	T: Finalizará el algoritmo.
 * @param args
 */
	public static void main(String[] args) {
						
		String eleccion;
		Scanner sc = new Scanner(System.in);
		
		boolean estado = true;
		while(estado) {
		System.out.println("F: Calculará el factorial.\nR: Calculará la raíz cuadrada de un número.\nC: Calculará el cuadrado de un número.\nT: Finalizará el algoritmo.");
		System.out.print("¿Qué deseas hacer?: ");
		eleccion = sc.next();
		switch(eleccion.toUpperCase()) {
		case "F": {
			int num1, resultado = 1;
			try {
			System.out.print("Escribe el número natural positivo: ");
			num1 = sc.nextInt();
			
			if(num1 < 0) {
				System.out.print("El número debe ser positivo natural.");
			} else {
				
			for (int i = 1; i <= num1; i++) {
				resultado *= i;
	        }
			
			System.out.println("El factorial de " + num1 + " es " + resultado);
			}
			} catch(Exception e) {
				System.out.println("Ha ocurrido un error, prueba en escribir un número natural positivo.");
			}
		}break;
		case "R": {
			int num;
			
			System.out.print("Escribe el número con el que deseas trabajar: ");
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("El número debe ser positivo.");
			} else {
				System.out.println("La raíz cuadrada del número " + num + " es " + Math.pow(num, (float)0.5));
			}
		}break;
		case "C": {
			int num;
			
			System.out.print("Escribe el número con el que deseas trabajar: ");
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("El número debe ser positivo.");
			} else {
				System.out.println("El valor del cuadrado de " + num + " es " + (int)Math.pow(num, 2) + ".");
			}
		}break;
		case "T": {
			estado = false;
			System.out.println("Algoritmo finalizado.");
		}break;
		default: {
			System.out.println("Elección inválida.");
		}break;
		}
		}
		
		sc.close();
		
	}

}
