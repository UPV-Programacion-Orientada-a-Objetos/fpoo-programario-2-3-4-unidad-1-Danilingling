package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios2 {
    public static void E2() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        int i = 0;
        double total = 0;


         do{
            System.out.print("Ingrese un float");
            Lectura = b.readLine();
            double a = Double.parseDouble(Lectura);
            total = total + a;
            i++;
        }while (i != 10);
        System.out.print("Total: " + total);
    }
}