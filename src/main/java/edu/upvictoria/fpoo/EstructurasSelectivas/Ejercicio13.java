package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio13 {
    public static void IP13() throws IOException {

        double total;
        double manodeobra;
        double fabricacion;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese la clave del artículo del 1 al 6: ");
        Lectura = buffer.readLine();
        double clave = Double.parseDouble(Lectura);

        System.out.println("Ingrese el costo de materia prima: ");
        Lectura = buffer.readLine();
        double costo = Double.parseDouble(Lectura);

        if (clave == 3 || clave == 4) {
            manodeobra = 0.75 * costo;
        } else if (clave == 1 || clave == 5) {
            manodeobra = 0.80 * costo;
        } else {
            manodeobra = 0.85 * costo;
        }
        if (clave == 2 || clave == 5) {
            fabricacion = 0.30 * costo;
        } else if (clave == 3 || clave == 6) {
            fabricacion = 0.35 * costo;
        } else {
            fabricacion = 0.28 * costo;
        }
        total = costo + (0.45 * costo);
        System.out.println("El precio de venta del artículo es: $" + total);
    }
}