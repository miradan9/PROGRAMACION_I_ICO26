package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//Arreglo de 10 numeros enteros
        int ultimo;

        System.out.println("Llenar el arreglo");
        for (int i=0;i<10;i++) {
            System.out.print(i+ ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        ultimo = arreglo[9];//Guardamos el ultimo elemento, por que si no se pierde
        //Se recorren
        for(int i=8;i>=0;i--){//Avanzar un posicion abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;//Ponemos el último arreglo como el primero
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i=0;i<10;i++){
            System.out.println(i+" Elemento: "+arreglo[i]);
        }
    }
}

