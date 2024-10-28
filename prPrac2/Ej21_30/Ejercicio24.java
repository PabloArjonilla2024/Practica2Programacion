package Ej21_30;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
    	int num1, num2;
        Scanner sc = new Scanner(System.in);

        // Solicitar los dos números enteros positivos
        System.out.print("Introduce el primer número entero positivo: ");
        num1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero positivo: ");
        num2 = sc.nextInt();

        // Validar que los números sean positivos
        if (num1 < 0 || num2 < 0) {
            System.out.println("Ambos números deben ser enteros positivos.");
        } else {
            // Calcular el producto mediante sumas sucesivas
            int producto = 0;
            for (int i = 0; i < num2; i++) {
                producto += num1;
            }

            // Mostrar el resultado
            System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
            
            sc.close();
        }
    }
}
