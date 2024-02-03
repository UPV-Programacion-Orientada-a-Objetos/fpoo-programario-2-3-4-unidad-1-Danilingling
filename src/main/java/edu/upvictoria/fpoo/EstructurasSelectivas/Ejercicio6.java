package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void IP6() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la cantidad de platillos a consumir:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);

        Mayor(num1);
    }

    public static void Mayor(double a) {
        if (200 > a) {
            a = a * 95;
            System.out.println("El costo del platillo es: $95");
            System.out.println("El total es: $" + a);

        } else if (a > 200 && a <= 300) {
            a = a * 85;
            System.out.println("El costo del platillo es: $85");
            System.out.println("El total es: $" + a);
        } else if (a > 300) {
            a = a * 75;
            System.out.println("El costo del platillo es: $75");
            System.out.println("El total es: $" + a);
        }
    }
}
