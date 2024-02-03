package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void IP1() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el primer numero:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);
        System.out.println("Ingrese el segundo numero:");
        Lectura = buffer.readLine();
        double num2 = Double.parseDouble(Lectura);
        Mayor(num1,num2);
    }

    public static void Mayor(double a, double b) {
        if (a>b){
            System.out.println(a + " es mayor que " + b);
        }
        if(b>a){
            System.out.println(b + " es mayor que " + a);
        }
        if (a==b){
            System.out.println(a + " es igual a " + b);
        }
    }
}