package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void IP5() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el primer numero:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);
        System.out.println("Ingrese el segundo numero:");
        Lectura = buffer.readLine();
        double num2 = Double.parseDouble(Lectura);
        System.out.println("Ingrese el segundo numero:");
        Lectura = buffer.readLine();
        double num3 = Double.parseDouble(Lectura);
        Mayor(num1,num2,num3);
    }

    public static void Mayor(double a, double b,double c) {
        if (a>b){
            if(a>c){
                System.out.println("El numero mayor es: " + a);
            }
        }
        else if (b>a){
            if (b>c){
                System.out.println("El numero mayor es: " + b);
            }
        }
        else if (c>a){
            if (c>b){
                System.out.println("El numero mayor es: " + c);
            }
        }
    }
}
