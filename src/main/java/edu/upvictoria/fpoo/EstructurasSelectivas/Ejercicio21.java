package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio21 {
    public static void IP21() throws IOException {
        double beca = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese su edad:");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);

        System.out.println("Ingrese su promedio:");
        Lectura = buffer.readLine();
        double b = Double.parseDouble(Lectura);

        if (a > 18) {
            if (b >= 9) {
                beca = 3000.00;
            } else if (b >= 8) {
                beca = 2000.00;
            } else if (b >= 6) {
                beca = 100.00;
            }
        } else {
            if (b >= 9) {
                beca = 2000.00;
            } else if (b >= 8) {
                beca = 1000.00;
            } else if (b >= 6) {
                beca = 500.00;
            }
        }

        if (beca > 0) {
            System.out.println("El estudiante tuvo una beca de $" + beca);
        } else {
            System.out.println("No hay beca");
        }

        System.out.println("");
    }
}