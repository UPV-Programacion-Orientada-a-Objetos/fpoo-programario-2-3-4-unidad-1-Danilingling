package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios10 {
    public static void E10() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        int horastotales = 0;

        for (int i = 0; i < 7; i++)
        {
            System.out.println("Ingrese horas trabajadas de hoy: ");
            Lectura = b.readLine();
            int n = Integer.parseInt(Lectura);
            horastotales = horastotales + n;
        }
        double sueldo = horastotales * 25;
        System.out.println("Total de horas: " + horastotales);
        System.out.println("Sueldo: " + sueldo);
    }
}