package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ejercicio29 {
    public static void IP29() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese un número del 1 al 7:");
        Lectura = buffer.readLine();

        int dia = Integer.parseInt(Lectura);
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Número inválido");
                return;
        }
        System.out.println("El día de es: " + diaSemana);

    }
}
