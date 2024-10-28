package Ej41_50;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio49 {
/**
 * 49. Hacer un algoritmo que simule el funcionamiento de un reloj digital
 * y que nos permita ponerlo en hora, es decir, al comenzar a ejecutar el programa
 * nos preguntará si deseamos ponerlo en hora, si respondemos sí, nos pedirá la hora,
 * minutos y segundos de partida, si respondemos no, comenzaremos en la 00:00:00.
 * Este algoritmo nunca finalizará.
 * @param args
 * @throws Exception 
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		byte hora = 0, minutos = 0, segundos = 0;
		String eleccion;
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Deseas escribir tu la hora? (S/N): ");
		eleccion = sc.nextLine();
		
		if(!eleccion.toUpperCase().equals("S") || !eleccion.toUpperCase().equals("N")) {
			throw new Exception("Selecciona una opción correcta.");
		}
		if(eleccion.toUpperCase().equals("S")) {
			System.out.print("Escribe la hora: ");
			hora = sc.nextByte();
			
			System.out.print("Escribe los minutos: ");
			minutos = sc.nextByte();
			
			System.out.print("Escribe los segundos: ");
			segundos = sc.nextByte();
			if(hora < 0 || hora > 24) {
				System.out.println("Escribe la hora correctamente.");
			} else if(minutos < 0 || minutos > 59) {
				System.out.println("Escribe los minutos correctamente.");
			} else if(segundos < 0 || segundos > 59) {
				System.out.println("Escribe los segundos correctamente.");
			}
		}	
		
		DecimalFormat patron = new DecimalFormat("00");
		sc.close();
		while(true) {
			Thread.sleep(1000);
			if(segundos == 60) {
				minutos++;
				segundos = 0;
			}
			if(minutos == 60) {
				hora++;
				minutos = 0;
			}
			if(hora > 23) {
				minutos = 0;
				segundos = 0;
				hora = 0;
			}			
			
			System.out.println(patron.format(hora) + ":" + patron.format(minutos) + ":" + patron.format(segundos));
			segundos++;
		}
		
	}

}
