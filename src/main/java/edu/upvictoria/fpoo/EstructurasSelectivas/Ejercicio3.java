package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void IP3() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la cantidad de lapices comprados:");
        Lectura = b.readLine();
        double num1 = Double.parseDouble(Lectura);
        a(num1);
    }

    public static void a(double a) {

        if (a >= 1000)
        {
            System.out.println("El precio del lapiz sera de $3.65");
        } else if (a < 1000)
        {
            System.out.println("El precio del lapiz sera de $4.83");
        }

    }
}