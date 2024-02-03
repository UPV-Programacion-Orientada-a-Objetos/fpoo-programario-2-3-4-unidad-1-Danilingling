package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void IP14() throws IOException {

        double lim;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el tipo de tarjeta: ");
        System.out.println("1: ");
        System.out.println("2: ");
        System.out.println("3: ");
        System.out.println("4 en adelante: ");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        if (a == 1) {
            lim = 0.25;
        } else if (a == 2) {
            lim = 0.35;
        } else if (a == 3) {
            lim = 0.40;
        } else {
            lim = 0.50;
        }

        lim = lim * 100;

        System.out.println("El aumento es: " + lim);
    }
}