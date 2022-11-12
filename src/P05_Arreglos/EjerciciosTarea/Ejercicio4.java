package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int [10];

        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i]=entrada.nextInt();
        }
        System.out.println("El resultado es: ");
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+" ");//imprimer el primer,segundo
            System.out.print(numeros[9-i]+" ");//ultimo, el penultimo
        }
        System.out.println();
    }
}
