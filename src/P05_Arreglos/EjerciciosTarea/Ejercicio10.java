package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]=new int[10];// Creamos el arreglo con 10 elementos enteros
        int n_posicion, ultimo;

        System.out.println("Llenar el arreglo: ");
        for(int i=0;i<10;i++){
            System.out.print(i+". Digite un número: ");
            arreglo[i]= entrada.nextInt();
        }
        System.out.print("\nDigita la cantidad de posiciones a desplazar: ");
        n_posicion= entrada.nextInt();

        for (int vuelta=1;vuelta<=n_posicion;vuelta++){
            ultimo=arreglo[9];//Guardamos el ultimo elemento del arreglo

            for(int i=8;i>=0;i--){//Desplazando una posicion en el arreglo
                arreglo[i+1]= arreglo[i];
            }
            arreglo[0]=ultimo;//ponemos el ultimo como el primero
        }
        System.out.println("\nEl arreglo resultante es: ");
        for(int i=0;i<10;i++){
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
}