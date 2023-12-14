/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        // Una variable suma para aumentar los valores del arrego
        int suma = 0;
        // Una variable media para calcular la media aritmetica de los valores
        double media;
        // Un contador para los valores mayores a la media
        int contadora = 0;
        // Un contador para los valores menores de la media
        int contadord = 0;
        // Un ciclo para comenzar a sumar los valores del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        // Se calcula la media aritmetica
        media = suma / arreglo.length;
        // Un ciclo para comprobar si los valores estan por arriba o por debajo
        // de la media
        for (int i = 0; i < arreglo.length; i++) {
            // Se aumenta el contador de mayor
            if (arreglo[i] > media) {
                contadora++;
                // Se aumenta el contador de menor
            } else {
                if (arreglo[i] < media) {
                    contadord++;
                }
            }
        }
        // Presentamos los valores de los contadores
        System.out.printf("Los valores arriba de la media aritmetica "
                + "son: %d\nLos valores debajo de la media aritmetica "
                + "son: %d\n", contadora, contadord);
    }

}
