package Ej1_10;

public class Ejercicio5 {

	public static void main(String[] args) {
		// 5. En una partida de un determinado juego, según los puestos conseguidos se
		// obtiene un grado u otro,
		// siguiendo la siguiente tabla:
		double puntos = 60;
		if (puntos < 60) {
			System.out.print("Grado E");
		} else if (puntos <= 60 && puntos <= 69) {
			System.out.print("Grado D");
		} else if (puntos >= 70 && puntos <= 79) {
			System.out.print("Grado C");
		} else if (puntos >= 80 && puntos <= 89) {
			System.out.print("Grado B");
		} else {
			System.out.print("Grado A");
		}
	}

}
