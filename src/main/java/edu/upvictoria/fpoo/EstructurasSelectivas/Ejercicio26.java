package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio26 {
    public static void IP26() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        double sueldo;

        System.out.println("Ingrese las horas trabajadas:");
        Lectura = buffer.readLine();
        double a = Double.parseDouble(Lectura);

        System.out.println("Ingrese el pago por hora:");
        Lectura = buffer.readLine();
        double pago = Double.parseDouble(Lectura);

        if (a <= 40) {
            sueldo = a * pago;
        } else if (a <= 45) {
            sueldo = 40 * pago + (a - 40) * pago * 2;
        } else if (a <= 50) {
            sueldo = 40 * pago + 5 * pago * 2 + (a - 45) * pago * 3;
        } else {
            System.out.println("No se permite trabajar más de 50 horas");
            return;
        }
        System.out.println("El sueldo semanal del trabajador es: $" + sueldo);
    }
}