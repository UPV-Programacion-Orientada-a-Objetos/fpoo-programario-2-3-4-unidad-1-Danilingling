package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios4 {
    public static void E4() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        int alumnos = 0;
        int edades = 0;


        System.out.print("Ingrese numero de alumnos");
        for (int i = 1; i <= alumnos; i++){
            System.out.print("Ingrese numero de alumnos");
            Lectura = b.readLine();
            int edad = Integer.parseInt(Lectura);
            edades = edades + edad;
        }
        double promedio = (double) edades / alumnos;
        System.out.print("Total: " + promedio);
    }
}