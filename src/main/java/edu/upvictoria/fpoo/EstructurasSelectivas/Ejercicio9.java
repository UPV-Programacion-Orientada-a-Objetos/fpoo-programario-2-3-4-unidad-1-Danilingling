package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {
    public static void IP9() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la cantidad de minutos de llamada:");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);
        a(num1);
    }

    public static void a(double a) {


        if (a < 5) {
            a = a * 1;
            System.out.println("El costo por minuto es: $1");
            System.out.println("El total es: $" + a);

        } else if (a >= 5 && a <= 8) {
            a = a * .8;
            System.out.println("El costo por minuto es: $.8");
            System.out.println("El total es: $" + a);

        } else if (a >= 9 && a <= 10) {
            a = a * .7;
            System.out.println("El costo por minuto es: $.70");
            System.out.println("El total es: $" + a);

        } else if (a >= 11) {
            a = a * .5;
            System.out.println("El costo por minuto es: $.5");
            System.out.println("El total es: $" + a);
        }
    }
}