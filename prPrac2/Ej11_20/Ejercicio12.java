package Ej11_20;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//12. Diseñar un algoritmo para simular una calculadora simple.
		//Para ello deberá tener las siguientes características:
			//✓ Sólo efectuará operaciones con dos operandos.
			//✓ Operaciones permitidas: (+, -, *, /).
			//✓ Se trabajará con operandos enteros.
			//✓ Pedirá en primer lugar el operador,
			//y a continuación los dos operandos. Si el operador no se
			//corresponde con alguno de los indicados se emitirá un mensaje de error:

		int num1, num2, res = 0;
		char op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el operando: ");
		op = sc.next().charAt(0);
		
		System.out.print("Escribe el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		num2 = sc.nextInt();
		
		switch(op) {
		case '+': {
			res = num1 + num2;
		}break;
		case '-': {
			res = num1 - num2;
		}break;
		case '*': {
			res = num1 * num2;
		}break;
		case '/': {
			res = num1 / num2;
		}break;
		default: {
			System.out.println("Debes escribir un operando de este estilo: +, -, *, /.");
			sc.close();
			return;
		}
		}
		
		System.out.println("Operación: " + op + "\n" + 
							"Operando 1: " + num1 + "\n"+
							"Operando 2: " + num2 + "\n"+
							"Resultado: " + res);
		
		sc.close();

	}

}
