package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio15 {
    public static void IP15() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;

        System.out.println("Ingrese la edad");
        Lectura = buffer.readLine();
        int a = Integer.parseInt(Lectura);
        if (a >= 18) {
            System.out.println("Si puede votar");
        } else {
            System.out.println("No puede votar");
        }
    }
}