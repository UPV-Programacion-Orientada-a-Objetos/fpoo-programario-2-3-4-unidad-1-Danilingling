package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios3 {
    public static void E3() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        double total = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Ingrese un float");
            Lectura = b.readLine();
            double a = Double.parseDouble(Lectura);
            total = total + a;
        }
        System.out.print("Total: " + total);
    }
}