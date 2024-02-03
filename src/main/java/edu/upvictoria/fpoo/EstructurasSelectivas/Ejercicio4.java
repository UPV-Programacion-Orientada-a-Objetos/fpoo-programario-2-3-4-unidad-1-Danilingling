package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void IP4() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese el monto total:");
        Lectura = b.readLine();
        double num1 = Double.parseDouble(Lectura);
        a(num1);
    }

    public static void a(double a) {

        if (a > 2500) {
            double t = 2500 * .15;
            System.out.println("Se aplicara descuento del 15%");
            System.out.println("Total: " + a);
            a = a - t;
            System.out.println("Total con descuento: " + a);
        } else if (a < 2500) {
            double t = 2500 * 8;
            System.out.println("Se aplicara descuento del 15%");
            System.out.println("Total: " + a);
            a = a - t;
            System.out.println("Total con descuento: " + a);
        }

    }
}