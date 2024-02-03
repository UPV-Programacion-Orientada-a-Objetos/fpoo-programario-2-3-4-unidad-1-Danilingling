package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio25 {
    public static void IP25() throws IOException {

        int antiguedad = 0;
        int bono;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese los anios de antiguedad del trabajador:");
        Lectura = buffer.readLine();
        antiguedad = Integer.parseInt(Lectura);

        if (antiguedad <= 0) {
            bono = 0;
        } else if (antiguedad <= 5) {
            bono = antiguedad * 100;
        } else {
            bono = 1000;
        }
        System.out.println("El bono es: $" + bono);
    }
}
