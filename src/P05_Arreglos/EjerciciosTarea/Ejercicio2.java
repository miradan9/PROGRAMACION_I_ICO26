package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float[] numeros=new float[5];

        System.out.println("Guardando los datos  del arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i]=entrada.nextFloat();
        }
        //Imprimir de forma inversa ciclo for
        System.out.println("\nLos elementos del arreglo en orden inverso son:");
        for(int i=4;i>=0;i--){
            System.out.println(numeros[i]);
    }
}
}
