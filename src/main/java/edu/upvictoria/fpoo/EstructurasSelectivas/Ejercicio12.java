package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio12 {
    public static void IP12() throws IOException {

        double precio;
        double total;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el número de cita: ");
        Lectura = buffer.readLine();
        double cita = Double.parseDouble(Lectura);



        if (cita <= 3) {
            precio = 200.00;
        } else if (cita <= 5) {
            precio = 150.00;
        } else if (cita <= 8) {
            precio = 100.00;
        } else {
            precio = 50.00;
        }

        total = (3 * 200.00) + (2 * 150.00) + (3 * 100.00) + ((precio - 8) * 50.00);
        System.out.println("El costo de la cita es: $" + precio);
        System.out.println("El gasto total en el tratamiento es: $" + total);
    }
}
