package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo  de 10 elementos enteros
        int numero, posicion;

        System.out.println("llenamos el arreglo");
        for (int i = 0; i < 8; i++) {
            System.out.print((i) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.print("\nDigite un numero: ");
        numero = entrada.nextInt();
        System.out.print("\nDigite una posición: ");
        posicion = entrada.nextInt();

        //Correr una posicion los elementos detras de la posicion que el usuario quiere
        for (int i = 7; i >= posicion; i--) {//1-2-3-número-4-5-6
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[posicion] = numero;//Insertamos numero en la posicion requerida

        System.out.println("El nuevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posicion " + i + ": " + arreglo[i]);
        }
    }
}

