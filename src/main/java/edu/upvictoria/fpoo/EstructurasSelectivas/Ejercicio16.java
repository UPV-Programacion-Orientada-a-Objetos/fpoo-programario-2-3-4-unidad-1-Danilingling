package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio16 {
    public static void IP16() throws IOException {
        double sem;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese las horas");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);

        System.out.println("Ingrese pago x hora");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);

        if (a > 40) {
            int horas = (a - 40);
            sem = (40 * b) + (horas * (b * 2));
        } else {
            sem = a * b;
        }
    }
}