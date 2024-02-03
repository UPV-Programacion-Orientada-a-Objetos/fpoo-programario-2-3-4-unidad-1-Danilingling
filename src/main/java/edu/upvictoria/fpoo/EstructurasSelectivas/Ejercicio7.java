package edu.upvictoria.fpoo.EstructurasSelectivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void IP7() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese si la uva es tipo:");
        System.out.println(" 1.A");
        System.out.println(" 2.B");
        Lectura = buffer.readLine();
        double tipo = Double.parseDouble(Lectura);

        System.out.println("Ingrese tamano de:");
        System.out.println(" 1.Grandes");
        System.out.println(" 2.Chicas");
        Lectura = buffer.readLine();
        double tamano = Double.parseDouble(Lectura);

        System.out.println("Ingrese el precio de la uva:");
        Lectura = buffer.readLine();
        double precio = Double.parseDouble(Lectura);
        a(tipo, tamano, precio);
    }

    public static void a(double tipo, double tamano, double precio) {

        if (tipo == 1 && tamano == 1)
        {
            precio = precio + 20;
            System.out.println("Ganancia de 20");
        }
        else if (tipo == 1 && tamano == 2)
        {
            precio = precio + 30;
            System.out.println("Ganancia de 30");
        }
        else if (tipo == 2 && tamano == 1)
        {
            precio = precio - 30;
            System.out.println("Perdida de 30");
        }
        else if (tipo == 2 && tamano == 2)
        {
            precio = precio * 30;
            System.out.println("Perdida de 30");
        }
    }
}