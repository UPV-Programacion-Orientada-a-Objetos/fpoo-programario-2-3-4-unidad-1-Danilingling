package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios6 {
    public static void E6() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        double ahorrot = 0;
        for (int i = 0; i < 12; i++)
        {
            System.out.println("Ingrese la cantidad de ahorros en el mes: " + i);
            Lectura = b.readLine();
            double ahorro = Double.parseDouble(Lectura);
            ahorrot = ahorrot + ahorro;
            System.out.println("Ahorro hasta el momento: " + ahorrot);

        }

        System.out.print("Total: " + ahorrot);
    }
}