package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio19 {
    public static void IP19() throws IOException {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        String mayor;
        String menor;
        System.out.println("Ingrese el nombre de la primera persona: ");
        String p1 = buffer.readLine();
        System.out.println("Ingrese el año de nacimiento de la primera persona: ");
        Lectura = buffer.readLine();
        int f1 = Integer.parseInt(Lectura);

        System.out.println("Ingrese el nombre de la segunda persona: ");
        String p2 = buffer.readLine();
        System.out.println("Ingrese el año de nacimiento de la segunda persona: ");
        Lectura = buffer.readLine();
        int f2 = Integer.parseInt(Lectura);

        System.out.println("Ingrese el nombre de la tercera persona: ");
        String p3 = buffer.readLine();
        System.out.println("Ingrese el año de nacimiento de la tercera persona: ");
        Lectura = buffer.readLine();
        int f3 = Integer.parseInt(Lectura);

        int e1 = 2024 - f1;
        int e2 = 2024 - f2;
        int e3 = 2024 - f3;
        if (e1 > e2 && e1 > e3) {
            mayor = p1;
        } else if (e2 > e1 && e2 > e3) {
            mayor = p2;
        } else {
            mayor = p3;
        }

        if (e1 < e2 && e1 < e3) {
            menor = p1;
        } else if (e2 < e1 && e2 < e3) {
            menor = p2;
        } else {
            menor = p3;
        }

        System.out.println("La persona de mayor es: " + mayor);
        System.out.println("La persona de menor es: " + menor);
    }
}