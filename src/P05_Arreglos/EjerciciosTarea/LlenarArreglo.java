package P05_Arreglos.EjerciciosTarea;

import groovy.json.JsonToken;

import javax.swing.*;
import java.util.Scanner;

public class LlenarArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos; //Almacenar el numero de elemetnos del arreglo

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de elementos del arreglo"));

        char[] letras = new char[nElementos];

        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i + 1) + ". Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        //Imprimir
        System.out.println("\nLos caracteres del arreglo son: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(letras[i]+" ");
        }
    }
}
