package Ej31_40;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio40 {
    static float totalDinero = 0;

    /**
     * 40. Introducir un número desde teclado y desglosarlo de forma ideal
     * en billetes y monedas de curso legal, es decir, con el mínimo número de billetes y monedas
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("es-ES"));
        System.out.print("Escribe el dinero que deseas desglosar: ");
        totalDinero = sc.nextFloat();
        
        totalDinero = Math.nextUp(totalDinero);
        // Billetes de 500
        int billetes500 = calculoBilletes(500);
        if(billetes500 != 0) System.out.println(billetes500 + " billetes de 500€");

        // Billetes de 200
        int billetes200 = calculoBilletes(200);
        if(billetes200 != 0) System.out.println(billetes200 + " billetes de 200€");

        // Billetes de 100
        int billetes100 = calculoBilletes(100);
        if(billetes100 != 0) System.out.println(billetes100 + " billetes de 100€");

        // Billetes de 50
        int billetes50 = calculoBilletes(50);
        if(billetes50 != 0) System.out.println(billetes50 + " billetes de 50€");

        // Billetes de 20
        int billetes20 = calculoBilletes(20);
        if(billetes20 != 0) System.out.println(billetes20 + " billetes de 20€");

        // Billetes de 10
        int billetes10 = calculoBilletes(10);
        if(billetes10 != 0) System.out.println(billetes10 + " billetes de 10€");

        // Billetes de 5
        int billetes5 = calculoBilletes(5);
        if(billetes5 != 0) System.out.println(billetes5 + " billetes de 5€");

        // Monedas de 2€
        int moneda2_0 = calculoBilletes(2);
        if(moneda2_0 != 0) System.out.println(moneda2_0 + " monedas de 2€");

        // Monedas de 1€
        int moneda1_0 = calculoBilletes(1);
        if(moneda1_0 != 0) System.out.println(moneda1_0 + " monedas de 1€");

        // Monedas de 50 céntimos
        int moneda50 = calculoMonedas(0.5f);
        if(moneda50 != 0) System.out.println(moneda50 + " monedas de 50 céntimos");
        
        // Monedas de 20 céntimos
        int moneda20 = calculoMonedas(0.2f);
        if(moneda20 != 0) System.out.println(moneda20 + " monedas de 20 céntimos");

        // Monedas de 10 céntimos
        int moneda10 = calculoMonedas(0.1f);
        if(moneda10 != 0) System.out.println(moneda10 + " monedas de 10 céntimos");

        // Monedas de 5 céntimos
        int moneda05 = calculoMonedas(0.05f);
        if(moneda05 != 0) System.out.println(moneda05 + " monedas de 5 céntimos");

        // Monedas de 2 céntimos
        int moneda02 = calculoMonedas(0.02f);
        if(moneda02 != 0) System.out.println(moneda02 + " monedas de 2 céntimos");

        // Monedas de 1 céntimos
        int moneda01 = calculoMonedas(0.01f);
        if(moneda01 != 0) System.out.println(moneda01 + " monedas de 1 céntimo");

        sc.close();
    }

    public static int calculoBilletes(int valorBillete) {
    	int cantidadBilletes = (int)(totalDinero / valorBillete);
    	while(totalDinero >= valorBillete) {
        totalDinero -= cantidadBilletes * valorBillete;
    	}
        return cantidadBilletes;
    }

    public static int calculoMonedas(float valorMoneda) {
    	int cantidadMonedas = (int)(totalDinero / valorMoneda);
    	while(totalDinero >= valorMoneda) {
        totalDinero -= cantidadMonedas * valorMoneda;
    	}
        return cantidadMonedas;
    }
}
