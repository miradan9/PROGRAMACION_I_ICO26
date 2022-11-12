package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true;
        arreglo = new int[10];
        do{
            //Pedimos el arreglo
            System.out.println("Rellene el arreglo: ");
            for(int i = 0; i < 10; i++){
                System.out.print(i+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Verificar si el arreglo esta ordenado
            for(int i = 0; i < 9; i++){
                if(arreglo[i]<arreglo[i+1]){//Creciente
                    creciente = true;
                }
                if (arreglo[i]>arreglo[i+1]) {//Decreciente
                    creciente = false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("\nEl Arreglo esta desordenado, digite nuevamente:\n");
            }
        }while(creciente == false);

        //Pedimos el numero a buscar
        System.out.print("\nDigite el numero a buscar en el arreglo: ");
        numero = entrada.nextInt();
        //Buscamos el numero en el arreglo
        int i=0;
        while (i<10 && arreglo[i]<numero){
            i++;
        }
        if(i==10){//Hemos recorrido el arreglo y no encontramos nada
            System.out.println("\nNumero no encontrado");
        }
        else{
            if(arreglo[i]==numero){
                System.out.println("\nNumero encontrado, el la posicion: "+i);
            }
            else{
                System.out.println("\nNumero no encontrado");
            }
        }
    }
}
