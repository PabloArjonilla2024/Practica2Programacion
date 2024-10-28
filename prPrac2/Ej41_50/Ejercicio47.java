package Ej41_50;

public class Ejercicio47 {
/**
 * 47. Simular 100 tiradas de un dado y contar las veces que aparece el nº 6.
 * @param args
 */
	public static void main(String[] args) {
		int numeroSeis = 0;
		for(int numTiradas = 100; numTiradas >= 0; numTiradas--) {
			double tirada = Math.floor(Math.random() * 7);
			
			if(tirada == 6) {
				numeroSeis++;
			}
			
		}
		System.out.println("Simulando 100 tiradas de un dado se ha obtenido " + numeroSeis + " veces el número 6.");
	}

}
