package Ej11_20;

public class Ejercicio19 {

	public static void main(String[] args) {
		//19. ¿Qué rango de valores pueden tomar X e Y
		//para garantizar que el siguiente algoritmo termina?
		int x = 0, y = 0;
		int a = x;
		int b = y;
		while(a != b) {
			while(a > b) {
				a = a-b;
			}
			while(b > a) {
				b = b - a;
			}
		}
		
	}

}
