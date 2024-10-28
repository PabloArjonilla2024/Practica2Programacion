package Ej11_20;

public class Ejercicio18 {

	public static void main(String[] args) {
		//18. Un programa posee tres bucles anidados,
		//cuyas variables de control toman M, N y K valores
		//respectivamente. Determinar cuántas veces se ejecutan las
		//instrucciones del cuerpo del bucle más interno
		int M = 2,
			N = 2,
			K = 1;
		
		int contador = 0;
		
		for(int i = 0; i<=M; i++) {
			for(int x = 0; x<=N; x++) {
				for(int f = 0; f<=K; f++) {
					contador++;
				}
			}
		}
		System.out.println("El número de veces que se ejecutan las instrucciones es " + contador);
	}

}
