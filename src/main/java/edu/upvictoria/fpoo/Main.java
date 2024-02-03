package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasSelectivas.*;


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
                        System.out.println(" 11.Carretera");
                        System.out.println(" 12.Tiki Taka");
                        System.out.println(" 13.Producto");
                        System.out.println(" 14.Pago a sus empleados");
                        System.out.println(" 15.Horas trabajadas");
                        System.out.println(" 16.El mandilon");
                        System.out.println(" 17.Salario 6 anios");
                        System.out.println(" 18.Hamburguesas");
                        System.out.println(" 19.N cantidades pt. 2");
                        System.out.println(" 20.Focos de colores");
                        System.out.println(" 21.Ahorro diario");
                        System.out.println(" 22.Ciclo repite & Ciclo Desde");
                        System.out.println(" 23.Ciclo Mientras & Ciclo Desde");
                        System.out.println(" 24.Pago de N articulos");
                        System.out.println(" 25.Banco");
                        System.out.println(" 26.Edad promedio");
                        System.out.println(" 27.Funcion exponencial");
                        System.out.println(" 28.Almacen");
                        System.out.println(" 29.Vendedor");
                        System.out.println(" 30.Calificaciones");
                        System.out.println(" 31.Sueldo mensual");
                        System.out.println(" 32.Numeros naturales");
                        System.out.println(" 33.Tabla de multiplicar");
                        System.out.println(" 34.1961");
                        System.out.println(" 35.Vehiculos");
                        System.out.println(" 36.Funcion seno del angulo");
                        System.out.println(" 37.Dinero en monedero");
                        System.out.println(" 38.Bandido de peluche");
                        System.out.println(" 39.Regresar al menu");
                        Lectura = buffer.readLine();
                        int ejercicio = Integer.parseInt(Lectura);
                        switch (ejercicio) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 39:
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
                        System.out.println(" 12.Dos matrices");
                        System.out.println(" 13.Matriz pt. 2");
                        System.out.println(" 14.Multiplicacion matrices");
                        System.out.println(" 15.Matriz cuadrada");
                        System.out.println(" 16.Nombres y edades");
                        System.out.println(" 17.MOdificacion del 22");
                        System.out.println(" 18.Lectura de vector");
                        System.out.println(" 19.Arreglo");
                        System.out.println(" 20.Dos vectores");
                        System.out.println(" 21.Dos matrices cuadradas");
                        System.out.println(" 22.Matriz definida");
                        System.out.println(" 23.Cien elementos");
                        System.out.println(" 24.Magnitud");
                        System.out.println(" 25.Elementos negativos");
                        System.out.println(" 26.Producto de dos vectores");
                        System.out.println(" 27.Choferes");
                        System.out.println(" 28.Identificacion de negativo");
                        System.out.println(" 29.Matriz con leida");
                        System.out.println(" 30.Multiplicacion en diagonal");
                        System.out.println(" 31.Cantidad de pares e impares");
                        System.out.println(" 32.Regresar al menu");
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