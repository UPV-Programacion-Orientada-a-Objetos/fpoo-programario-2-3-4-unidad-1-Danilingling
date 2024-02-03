package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio28 {
    public static void IP28() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese la calificacion:");
        Lectura = buffer.readLine();
        int calificacion = Integer.parseInt(Lectura);
        String cal;

        if (calificacion == 10) {
            cal = "A";
        } else if (calificacion == 9) {
            cal = "B";
        } else if (calificacion == 8) {
            cal = "C";
        } else if (calificacion >= 6 && calificacion <= 7) {
            cal = "D";
        } else if (calificacion >= 0 && calificacion <= 5) {
            cal = "F";
        } else {
            System.out.println("Calificación inválida");
            return;
        }

        System.out.println("La calificación es: " + cal);
    }
}