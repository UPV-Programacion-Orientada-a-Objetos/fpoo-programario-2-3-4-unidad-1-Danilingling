package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio27 {
    public static void IP27() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese el número de alumnos:");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);
        double costo;

        if (a > 100) {
            costo = 20;
        } else if (a >= 50 && a <= 100) {
            costo = 35;
        } else if (a >= 20 && a < 50) {
            costo = 40;
        } else if (a < 20) {
            costo = 70;
        } else {
            System.out.println("Número de alumnos inválido");
            return;
        }

        double costot = costo * a;
        System.out.println("El costo x alumno es: $" + costo);
        System.out.println("El costo total es: $" + costot);
    }
}