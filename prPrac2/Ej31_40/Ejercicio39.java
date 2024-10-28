package Ej31_40;

public class Ejercicio39 {
/*
 * 39. Realizar un algoritmo para imprimir las tablas de
 * multiplicar del uno al diez, es decir, tenéis que mostrar
 * la tabla del 1, la del 2, la del 3, … hasta la del 10.
 */
	public static void main(String[] args) throws InterruptedException {

		tabla(1);
		Thread.sleep(2000);
		tabla(2);
		Thread.sleep(2000);
		tabla(3);
		Thread.sleep(2000);
		tabla(4);
		Thread.sleep(2000);
		tabla(5);
		Thread.sleep(2000);
		tabla(6);
		Thread.sleep(2000);
		tabla(7);
		Thread.sleep(2000);
		tabla(8);
		Thread.sleep(2000);
		tabla(9);
		Thread.sleep(2000);
		tabla(10);
	}
	
	public static int tabla(int tabla) {
		
		if(tabla <= 0 || tabla >= 11) {
			System.out.println("Número inválido");
		} else {
			System.out.println("La tabla de multiplicación del " + tabla + " es:");
			for(int vueltas = 10; vueltas >= 0; vueltas--) {
				System.out.println(tabla + " x " + vueltas + " = " + (tabla*vueltas));
				
			}
			
		}
		
		return tabla;
	}

}
