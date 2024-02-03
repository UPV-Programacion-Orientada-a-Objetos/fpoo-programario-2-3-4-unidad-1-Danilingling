package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio17 {
    public static void IP17() throws IOException {

        String regalo;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese su presupuesto");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        if (a <= 10.00) {
            regalo = "Tarjeta";
        } else if (a <= 100.00) {
            regalo = "Chocolates";
        } else if (a <= 250.00) {
            regalo = "Flores";
        } else {
            regalo = "Anillo";
        }
        System.out.println("El regalo sera: " + regalo );


    }
}