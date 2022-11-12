package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;

        System.out.println("Llenar el arreglo");
        do {
            //Llenando el arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1)+ ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //comprobar si el arreglo esta ordenado en forma creciente
            for(int i=0;i<4;i++){
                if(arreglo[i] < arreglo[i+1]){//Creciente 1-2-3
                    creciente = true;

                }
                if(arreglo[i] > arreglo[i+1]){// Decreciente:3-2-1
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.print("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitar:\n ");
            }
        }while(creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        //Esto es para darnos cuenta en que posicion va el numero
        while(arreglo[j] < numero && j<5){
            sitio_num++;
            j++;
        }

        //Por ultimo, trasladamos una posicion en el arreglo a los
        // elementos que van detras del numero
        for(int i=4;i>=sitio_num;i--){
            arreglo[i+1] = arreglo[i];
        }

        //Insertamos en numero que el usuario puso
        arreglo[sitio_num] = numero;

        System.out.print("\nEl arreglo queda: ");
        for (int i=0; i<6; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}
