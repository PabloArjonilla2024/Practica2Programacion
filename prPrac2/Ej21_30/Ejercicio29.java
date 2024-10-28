package Ej21_30;

public class Ejercicio29 {
/**
 * Hacer un algoritmo para mostrar por pantalla 100 veces de una forma alternativa: Hola, Adiós.
 * @param args
 */
	public static void main(String[] args) {
		boolean last = true;
		
		for(int con = 6; con > 0; con--) {
			if(last) {
				last = false;
				System.out.println("Hola");
			} else {
				last = true;
				System.out.println("Adiós");
			}
		}
	}

}
