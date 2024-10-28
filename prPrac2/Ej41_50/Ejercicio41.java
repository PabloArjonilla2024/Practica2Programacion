package Ej41_50;

import java.util.Scanner;

public class Ejercicio41 {
/**
 * 41. Introducir dos números inferiores a 50 y superiores a 0 por teclado. Al más pequeño de ellos lo
aumentamos de 5 en 5 y al más grande lo disminuimos de 2 en 2. Imprimir ambas series alternativamente
hasta que el menor supere al mayor.
 * @param args
 */
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el primer número (0-50): ");
		a = sc.nextInt();
		
		System.out.print("Escribe el segundo número (0-50): ");
		b = sc.nextInt();
		
		if(a < 0 || b < 0 || a > b || a > 50 || b > 50) {
			System.out.println("Los números no pueden ser menores a 0 ni mayores a 50 y el primer número debe ser menor al segundo.");
			
		} else {
		System.out.println(a + " | " + b);
		while(a < b) {
			a += 5;
			b -= 2;
			System.out.println(a + " | " + b);
		}
		}
		
		sc.close();
	}

}
