package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSelectivas.*;
import edu.upvictoria.fpoo.EstructurasRepetitivas.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean a = true;
        boolean b = true;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido al Programario 2,3 y 4 de 2230422");
        while (a) {
            System.out.println("Ingrese el paquete del repositorio elegido:");
            System.out.println(" 1.Estructuras Selectivas");
            System.out.println(" 2.Estructuras Repetitivas");
            System.out.println(" 3.Arreglos");
            System.out.println(" 4.Terminar App");
            String Lectura = buffer.readLine();
            int paquete = Integer.parseInt(Lectura);
            b = true;
            switch (paquete) {
                case 1:
                    while (b) {
                        System.out.println("Ingrese el ejercicio a elegir: ");
                        System.out.println(" 1.El numero mayor");
                        System.out.println(" 2.Positivo o negativo");
                        System.out.println(" 3.El pago");
                        System.out.println(" 4.Promocion");
                        System.out.println(" 5.Tres cantidades");
                        System.out.println(" 6.La langosta ahumada");
                        System.out.println(" 7.Precio inicial uvas");
                        System.out.println(" 8.Viaje de estudios");
                        System.out.println(" 9.Chismea = x -");
                        System.out.println(" 10.Autobuses");
                        System.out.println(" 11.Hamburguesas");
                        System.out.println(" 12.Consultorio");
                        System.out.println(" 13.Precios de venta");
                        System.out.println(" 14.Banco sube credito");
                        System.out.println(" 15.Elecciones");
                        System.out.println(" 16.Sueldo semanal");
                        System.out.println(" 17.Regalo 14 de febrero");
                        System.out.println(" 18.Estacionamiento");
                        System.out.println(" 19.Tres personas");
                        System.out.println(" 20.Descuento en articulo");
                        System.out.println(" 21.Presidente");
                        System.out.println(" 22.Bono mensual");
                        System.out.println(" 23.Compañia de seguros");
                        System.out.println(" 24.Linea de Autobuses");
                        System.out.println(" 25.Bono de antigüedad");
                        System.out.println(" 26.Sueldo semanal 2.0");
                        System.out.println(" 27.Alumnos en viaje");
                        System.out.println(" 28.Calificacion");
                        System.out.println(" 29.Identificar dia");
                        System.out.println(" 30.Bono por desempeño");
                        System.out.println(" 31.Regresar al Menu");
                        Lectura = buffer.readLine();
                        int ejercicio = Integer.parseInt(Lectura);
                        switch (ejercicio) {
                            case 1:
                                Ejercicio1.IP1();
                                Thread.sleep(2000);
                                break;
                            case 2:
                                Ejercicio2.IP2();
                                Thread.sleep(2000);
                                break;
                            case 3:
                                Ejercicio3.IP3();
                                Thread.sleep(2000);
                                break;
                            case 4:
                                Ejercicio4.IP4();
                                Thread.sleep(2000);
                                break;
                            case 5:
                                Ejercicio5.IP5();
                                Thread.sleep(2000);
                                break;
                            case 6:
                                Ejercicio6.IP6();
                                Thread.sleep(2000);
                                break;
                            case 7:
                                Ejercicio7.IP7();
                                Thread.sleep(2000);
                                break;
                            case 8:
                                Ejercicio8.IP8();
                                Thread.sleep(2000);
                                break;
                            case 9:
                                Ejercicio9.IP9();
                                Thread.sleep(2000);
                                break;
                            case 10:
                                Ejercicio10.IP10();
                                Thread.sleep(2000);
                                break;
                            case 11:
                                Ejercicio11.IP11();
                                Thread.sleep(2000);
                                break;
                            case 12:
                                Ejercicio12.IP12();
                                Thread.sleep(2000);
                                break;
                            case 13:
                                Ejercicio13.IP13();
                                Thread.sleep(2000);
                                break;
                            case 14:
                                Ejercicio14.IP14();
                                Thread.sleep(2000);
                                break;
                            case 15:
                                Ejercicio15.IP15();
                                Thread.sleep(2000);
                                break;
                            case 16:
                                Ejercicio16.IP16();
                                Thread.sleep(2000);
                                break;
                            case 17:
                                Ejercicio17.IP17();
                                Thread.sleep(2000);
                                break;
                            case 18:
                                Ejercicio18.IP18();
                                Thread.sleep(2000);
                                break;
                            case 19:
                                Ejercicio19.IP19();
                                Thread.sleep(2000);
                                break;
                            case 20:
                                Ejercicio20.IP20();
                                Thread.sleep(2000);
                                break;
                            case 21:
                                Ejercicio21.IP21();
                                Thread.sleep(2000);
                                break;
                            case 22:
                                Ejercicio22.IP22();
                                Thread.sleep(2000);
                                break;
                            case 23:
                                Ejercicio23.IP23();
                                Thread.sleep(2000);
                                break;
                            case 24:
                                Ejercicio24.IP24();
                                Thread.sleep(2000);
                                break;
                            case 25:
                                Ejercicio25.IP25();
                                Thread.sleep(2000);
                                break;
                            case 26:
                                Ejercicio26.IP26();
                                Thread.sleep(2000);
                                break;
                            case 27:
                                Ejercicio27.IP27();
                                Thread.sleep(2000);
                                break;
                            case 28:
                                Ejercicio28.IP28();
                                Thread.sleep(2000);
                                break;
                            case 29:
                                Ejercicio29.IP29();
                                Thread.sleep(2000);
                                break;
                            case 30:
                                Ejercicio30.IP30();
                                Thread.sleep(2000);
                                break;
                            case 31:
                                b = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta");
                                break;
                        }
                    }
                    break;
                case 2:
                    while (b) {
                        System.out.println("Ingrese el ejercicio a elegir: ");
                        System.out.println(" 1.Diez numeros flotantes");
                        System.out.println(" 2.Diez numeros flotantes pt. 2");
                        System.out.println(" 3.Diez numeros flotantes pt. 3");
                        System.out.println(" 4.Edad promedio");
                        System.out.println(" 5.Estatura");
                        System.out.println(" 6.Ahorro por anio");
                        System.out.println(" 7.N cantidades");
                        System.out.println(" 8.Imprimir numeros del 1 al 100");
                        System.out.println(" 9.N numeros de sucesion de Fibonacci");
                        System.out.println(" 10.Sueldo total");
                        System.out.println(" 11.Regresar al menu");
                        Lectura = buffer.readLine();
                        int ejercicio = Integer.parseInt(Lectura);
                        switch (ejercicio) {
                            case 1:
                                Ejercicios1.E1();
                                Thread.sleep(2000);
                                break;
                            case 2:
                                Ejercicios2.E2();
                                Thread.sleep(2000);
                                break;
                            case 3:
                                Ejercicios3.E3();
                                Thread.sleep(2000);
                                break;
                            case 4:
                                Ejercicios4.E4();
                                Thread.sleep(2000);
                                break;
                            case 5:
                                Ejercicios5.E5();
                                Thread.sleep(2000);
                                break;
                            case 6:
                                Ejercicios6.E6();
                                Thread.sleep(2000);
                                break;
                            case 7:
                                Ejercicios7.E7();
                                Thread.sleep(2000);
                                break;
                            case 8:
                                Ejercicios8.E8();
                                Thread.sleep(2000);
                                break;
                            case 9:
                                Ejercicios9.E9();
                                Thread.sleep(2000);
                                break;
                            case 10:
                                Ejercicios10.E10();
                                Thread.sleep(2000);
                                break;
                            case 11:
                                b = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta");
                                break;
                        }
                    }
                    break;
                case 3:
                    while (b) {
                        System.out.println("Ingrese el ejercicio a elegir: ");
                        System.out.println(" 1.Suma");
                        System.out.println(" 2.Vector");
                        System.out.println(" 3.Promedio general");
                        System.out.println(" 4.Productos");
                        System.out.println(" 5.Seis elementos");
                        System.out.println(" 6.Calificaciones");
                        System.out.println(" 7.Cuantos ceros");
                        System.out.println(" 8.Choferes");
                        System.out.println(" 9.Ventas");
                        System.out.println(" 10.Matriz");
                        System.out.println(" 11.Matriz transpuesta");
                        Lectura = buffer.readLine();
                        int ejercicio = Integer.parseInt(Lectura);
                        switch (ejercicio) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 32:
                                b = false;
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Gracias x su visita <3");
                    a = false;
                    break;
                default:
                    break;
            }
        }
    }
}