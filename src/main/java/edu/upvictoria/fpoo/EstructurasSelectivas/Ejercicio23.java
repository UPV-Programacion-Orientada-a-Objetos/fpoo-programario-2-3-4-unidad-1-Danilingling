package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio23 {
    public static void IP23() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese consumo de energia en kilowatts: ");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese precio por kilowatts: ");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);

        a = b * a;

        System.out.println("El pago es: $" + a);
    }
}