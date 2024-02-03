package edu.upvictoria.fpoo.EstructurasSelectivas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {
    public static void IP11() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String Lectura;
        System.out.println("Ingrese la cantidad de hamburguesas: ");
        Lectura = buffer.readLine();
        double num1 = Double.parseDouble(Lectura);

        System.out.println("Seleccione el tipo de hamburguesa: ");
        System.out.println(" 1: Sencilla");
        System.out.println(" 2: Doble");
        System.out.println(" 3: Triple");
        Lectura = buffer.readLine();
        double num2 = Double.parseDouble(Lectura);

        System.out.println("¿Desea pagar con tarjeta de crédito?: ");
        System.out.println(" 1: Si");
        System.out.println(" 2: No");
        Lectura = buffer.readLine();
        double num3 = Double.parseDouble(Lectura);

        a(num1,num2,num3);

    }
    public static void a(double a, double b, double c) {

        double sen = 20;
        double dou = 25;
        double tri = 28;
        double costoTotal;

        switch ((int) b) {
            case 1:
                costoTotal = sen * a;
                break;
            case 2:
                costoTotal = dou * a;
                break;
            case 3:
                costoTotal = tri * a;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        if (c == 1) {
            double tarj = costoTotal * 0.05;
            costoTotal = costoTotal + tarj;
            System.out.println("El total con el cargo es: $" + costoTotal);
        } else {
            System.out.println("El costo total es: $" + costoTotal);
        }
    }
}
