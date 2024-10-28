package Ej1_10;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//9. Una empresa maneja códigos numéricos con las siguientes características:
		//▪ Cada código consta de 4 dígitos.
		//▪ El primero representa una provincia.
		//▪ El segundo el tipo de operación.
		//▪ Los dos últimos el número de operación.
		//Diseñar un programa que lea del teclado un número de 4 dígitos y 
		//posteriormente imprima en pantalla la siguiente información:
		//PROVINCIA: &
		//TIPO DE OPERACIÓN: &
		//NUMERO DE OPERACIÓN: &&
		//Por ejemplo, para el código 2548 debería de dar como salida:
		//PROVINCIA: 2
		//TIPO DE OPERACIÓN: 5
		//NUMERO DE OPERACIÓN: 48
		//En caso de que el número no tenga exactamente 4 dígitos, en lugar
		//del mensaje anterior, habrá que imprimir en pantalla el siguiente mensaje de error:
		//ERROR: CÓDIGO INVÁLIDO.

		String codigo;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el código de 4 dígitos: ");
		codigo = sc.next();
		
		if (codigo.matches("[a-zA-Z]*")) {
			System.out.println("El código no puede contener letras, sólo números.");
		}else if(codigo.length() < 4) {
			System.out.print("ERROR: CÓDIGO INVÁLIDO.");
		} else {
			System.out.println("PROVINCIA: " + codigo.charAt(0));
			System.out.println("TIPO DE OPERACIÓN: " + codigo.charAt(1));
			System.out.println("NÚMERO DE OPERACION: " + codigo.charAt(2) + codigo.charAt(3));
		}
		
		sc.close();
		
	}

}
