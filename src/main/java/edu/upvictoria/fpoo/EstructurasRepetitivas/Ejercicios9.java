package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios9 {
    public static void E9() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese cuantos numeros de la sucesion de fibonacci desea sean mostrados ");
        Lectura = b.readLine();
        int n = Integer.parseInt(Lectura);
        int n1 = 0, n2 = 1;


        for (int i = 0; i < n; i++)
        {
            int a = n1 + n2;
            System.out.println(i + ".- " + a);
            n1 = n2;
            n2 = a;
        }
    }
}