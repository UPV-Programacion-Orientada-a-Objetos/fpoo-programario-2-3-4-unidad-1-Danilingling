package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void IP8() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la cantidad de alumnos para el viaje:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);

        Mayor(num1);
    }

    public static void Mayor(double a) {
        if (a >= 100) {
            a = a * 65;
            System.out.println("El costo por alumno es: $65");
            System.out.println("El total es: $" + a);
        } else if (a>50 && a<99) {
            a = a * 70;
            System.out.println("El costo por alumno es: $70");
            System.out.println("El total es: $" + a);
        } else if (a>30 && a<49) {
            a = a * 95;
            System.out.println("El costo por alumno es: $70");
            System.out.println("El total es: $" + a);
        } else if (a<30) {
            double total = 4000/a;
            System.out.println("El costo por alumno es: $" + total);
            System.out.println("El total es: $" + 4000);
        }
    }
}