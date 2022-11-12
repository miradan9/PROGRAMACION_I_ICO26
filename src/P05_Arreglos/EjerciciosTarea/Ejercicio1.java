package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float[] numeros=new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i]=entrada.nextFloat();
        }
        //Mostrar los datos en el mismo orden que se introducen puede usarse el ciclo for o el ciclo for each
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }
    }

}
