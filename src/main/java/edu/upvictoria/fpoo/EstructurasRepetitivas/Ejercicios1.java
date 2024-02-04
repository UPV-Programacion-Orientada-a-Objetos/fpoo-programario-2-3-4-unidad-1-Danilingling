package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios1 {
    public static void E1() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        int i = 0;
        double total = 0;


        while (i != 10) {
            System.out.print("Ingrese un float");
            Lectura = b.readLine();
            double a = Double.parseDouble(Lectura);
            total = total + a;
            i++;
        }
        System.out.print("Total: " + total);
    }
}
