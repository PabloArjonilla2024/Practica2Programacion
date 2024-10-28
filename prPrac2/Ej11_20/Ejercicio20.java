package Ej11_20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        // Serie s(n) = 1 + 1/2 + 1/3 + ... + 1/n
        double suma = 0.0;  // Para almacenar la suma de la serie
        int n;  // El valor límite para la serie

        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número hasta el cual calcular la serie: ");
        n = sc.nextInt();

        // Bucle para calcular la serie
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;  // Acumular el valor de 1/i en cada iteración
        }

        // Mostrar el resultado final
        System.out.printf("La suma de la serie es: %.4f%n", suma);
        
        sc.close();
    }
}
