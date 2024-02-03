package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void IP2() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese un numero:");
        Lectura = b.readLine();
        double num1 = Double.parseDouble(Lectura);
        a(num1);
    }

    public static void a(double a) {

        if (a < 0)
        {
            System.out.println(a + " es un numero negativo");
        } else if (a > 0)
        {
            System.out.println(a + " es un numero positivo");
        }
        else if (a == 0)
        {
            System.out.println(a + " es un cero");
        }
    }
}