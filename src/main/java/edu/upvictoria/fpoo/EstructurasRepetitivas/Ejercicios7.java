package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios7 {
    public static void E7() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.print("Ingrese numero de cantidades");
        Lectura = b.readLine();
        int cantidades = Integer.parseInt(Lectura);
        int menores = 0;
        int mayores = 0;

        for (int i = 0; i < cantidades; i++)
        {
            System.out.print("Ingrese cantidad de " + i);
            Lectura = b.readLine();
            double cantidad = Double.parseDouble(Lectura);
            if(cantidad <= 0)
            {
                menores++;
            }
            else {
                mayores++;
            }

        }
        System.out.print("Cantidades negativas o 0 " + menores);
        System.out.print("Cantidades positivas " + mayores);

    }
}