/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Creamos el arreglo de tipo cadena
        String[] marcas;
        // El tamaño del arreglo
        int numero;
        // Es el contador para que el ciclo vaya iterando
        int i = 0;
        // Crear una variable de tipo caracter para almacenar la primera letra
        char letra;
        // Una cadena para ir acumulando las marcas
        String cadena = "";
        System.out.println("Ingrese la cantidad de marcas que desea "
                + "ingresar");
        numero = entrada.nextInt();
        entrada.nextLine();
        // Le asignamos el valor que da el usuario
        marcas = new String[numero];
        // Un ciclo para ir preguntando las marcas
        while (i < marcas.length) {
            System.out.println("Ingrese la marca del vehículo");
            marcas[i] = entrada.nextLine();
            // Obtenemos la primera letra de la marca
            letra = marcas[i].charAt(0);
            // Un condicional para verificar la excepcion
            switch (letra) {
                case 'A':
                case 'C':
                case 'T':
                    System.out.println("EL valor no se contabiliza");
                    // en caso de ser una de las letras el contador no se suma
                    break;
                default:
                    // aumentamos el contador
                    i++;
                    break;
            }
        }
        // Un ciclo para presentar los valores
        for (i = 0; i < marcas.length; i++) {
            cadena = String.format("%s%s\n", cadena, marcas[i]);
        }
        System.out.printf("Las marcas ingresadas son: \n%s", cadena);
    }
}
