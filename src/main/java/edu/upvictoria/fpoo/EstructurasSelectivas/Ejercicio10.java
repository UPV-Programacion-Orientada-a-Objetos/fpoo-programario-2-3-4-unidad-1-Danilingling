package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {
    public static void IP10() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese el tipo de autobus:");
        System.out.println(" 1- A: $2.0");
        System.out.println(" 2- B: $2.5");
        System.out.println(" 3- C: $3.0");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);

        System.out.println("Ingrese la cantidad de personas:");
        Lectura = buffer.readLine();
        double personas = Double.parseDouble(Lectura);
        a(num1, personas);
    }
    public static void a(double a, double b) {
        if (b < 20) {
            b = b * 20;
            System.out.println("El costo por persona sera de $20");
            System.out.println("El total es; $" + b);
        } else if (b > 20) {
            if (a == 1) {
                a = 2;
                b = b * a;
                System.out.println("El costo por persona sera de $2.0");
                System.out.println("El total es; $" + b);

            } else if (a == 2) {
                a = 2.5;
                b = b * a;
                System.out.println("El costo por persona sera de $2.5");
                System.out.println("El total es; $" + b);

            } else if (a == 3) {
                b = b * a;
                System.out.println("El costo por persona sera de $3.0");
                System.out.println("El total es; $" + b);
            }
        }
    }
}
