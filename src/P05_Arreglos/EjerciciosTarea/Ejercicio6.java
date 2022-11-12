package P05_Arreglos.EjerciciosTarea;

import groovy.json.JsonOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;
        a = new int[12];//Arreglo a[]va a tener 12elementos
        b = new int[12];
        c = new int[24];//Arreglo c[]va almacenar a a[] y b[]

        //Pedimos el arreglo a[]
        System.out.println("Digite el primer arreglo");
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        //Pedimos el arreglo b[]
        System.out.println("Digite el segundo arreglo");
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            b[i] = entrada.nextInt();
        }
        //Ahora vamos a mezclar los dos arreglos a y b
        //El iterador i será para los arreglos a y b
        //y el iterador j será para el arreglo c
        i = 0;
        j = 0;
        while (i < 12) {
            //Copiar los tres elemetnos de a
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
            //Ahora copiamos tres elementos de b
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }
        System.out.println("El arreglo resultante es: ");
        for (i = 0; i < 24; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}