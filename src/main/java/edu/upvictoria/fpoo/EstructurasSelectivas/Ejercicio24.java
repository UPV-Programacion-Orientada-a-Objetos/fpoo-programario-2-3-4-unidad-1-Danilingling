package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio24 {
    public static void IP24() throws IOException {


        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese los km de distancia:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese el precio del km:");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);

        double c = a * b;

        System.out.println("Costo de viaje de ida: $" + c);
        System.out.println("Costo de viaje de ida: $" + c);
    }
}