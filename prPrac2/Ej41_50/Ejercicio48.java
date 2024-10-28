package Ej41_50;

public class Ejercicio48 {
/**
 * 48. Simular 100 tiradas de 2 dados y contar las veces que entre los dos suman 10
 * @param args
 */
	public static void main(String[] args) {
		int cont10 = 0;
		for(int con = 0; con<=100; con++) {
			double dado1 = Math.floor(Math.random() * 7);
			double dado2 = Math.floor(Math.random() * 7);
			if(dado1 + dado2 == 10) {
				cont10++;
			}
		}
		
		System.out.println("Simulando 100 tiradas de 2 dados, las veces que los dos numeros han sumado 10 son " + cont10);

	}

}
