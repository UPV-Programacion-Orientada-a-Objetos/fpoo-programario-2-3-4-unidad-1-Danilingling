package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio30 {
    public static void IP30() throws IOException {


        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
    double bono;
        System.out.println("Ingrese el salario mínimo:");
        Lectura = buffer.readLine();
        double salario = Double.parseDouble(Lectura);

        System.out.println("Ingrese los p del profesor:");
        Lectura = buffer.readLine();
        double p = Double.parseDouble(Lectura);

        if (p >= 0 && p <= 100) {
            bono = salario;
        } else if (p >= 101 && p <= 150) {
            bono = salario * 2;
        } else if (p >= 151) {
            bono = salario * 3;
        } else {
            System.out.println("Puntos incorrectos");
            return;
        }
        System.out.println("El monto del bono es: $" + bono);
    }
}