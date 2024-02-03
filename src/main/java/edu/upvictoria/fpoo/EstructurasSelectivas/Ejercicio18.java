package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio18 {
    public static void IP18() throws IOException {
        double precio;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese las horas");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);

        if (a <= 2) {
            precio = a * 5.00;
        } else if (a <= 5) {
            precio = 2 * 5.00 + (a - 2) * 4.00;
        } else if (a <= 10) {
            precio = 2 * 5.00 + 3 * 4.00 + (a - 5) * 3.00;
        } else {
            precio= 2 * 5.00 + 3 * 4.00 + 5 * 3.00 + (a - 10) * 2.00;
        }
        System.out.println("El total es: $" + precio);

    }
}