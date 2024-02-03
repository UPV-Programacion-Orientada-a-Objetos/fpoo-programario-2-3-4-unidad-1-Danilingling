package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio20 {
    public static void IP20() throws IOException {

        double b = 0;
        double c;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el precio: ");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        if (a >= 200) {
            b = 0.15;
        } else if (a > 100 && a < 200) {
            b = 0.12;
        } else if (a <= 100) {
            b = 0.10;
        }
        c = a - (a * b);
        b = b * 100;
        System.out.println("Costo de articulo: $" + c);
        System.out.println("Descuento: " + c + "%");

    }
}