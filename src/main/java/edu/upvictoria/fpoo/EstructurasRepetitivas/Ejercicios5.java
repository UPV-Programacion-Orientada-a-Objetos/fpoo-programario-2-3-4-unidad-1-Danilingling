package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios5 {
    public static void E5() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        int i = 0;
        double estaturas = 0;


        System.out.print("Ingrese numero de personas");
        Lectura = b.readLine();
        int personas = Integer.parseInt(Lectura);
        while (i != personas){
            System.out.print("Ingrese numero de alumnos");
            Lectura = b.readLine();
            double estatura = Double.parseDouble(Lectura);
            estaturas = estaturas + estatura;
            i++;
        }
        double promedio =  estaturas / personas;
        System.out.print("Total: " + promedio);
    }
}