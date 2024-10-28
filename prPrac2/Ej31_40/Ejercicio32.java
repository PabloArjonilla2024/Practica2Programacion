package Ej31_40;

import java.util.Scanner;

public class Ejercicio32 {
/**
 * 32. Hacer un algoritmo para calcular el valor máximo y el valor mínimo de una lista de números que se
introducen por teclado, se terminará la operación cuando se introduzca el número 0, en este caso no
sabremos cuántos valores se van a introducir.
 * @author Pablo Arjonilla Cuadrado
 */
	public static void main(String[] args) {
		
		int mayor = 0, menor = 0, auxiliar;
		boolean cero = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número o escribe 0 para salir: ");
        auxiliar = sc.nextInt();
		menor = auxiliar;
		mayor = auxiliar;
		if(auxiliar == 0) {
			System.out.print("El primer número no puede ser 0.");
        } else {
		
		while(cero) {
	       
	        if(auxiliar < menor) {
	        	menor = auxiliar;
	        } else if (auxiliar > mayor) {
	        	mayor = auxiliar;
	        }
	        System.out.println("Escribe un número o escribe 0 para salir: ");
	        auxiliar = sc.nextInt();
	        
	        if(auxiliar == 0) {
	        	cero = false;
	        }
	        
		}
		System.out.print("El número más pequeño es " + menor + " y el más grande es " + mayor);
				
		sc.close();
        }
	}

}
