package P05_Arreglos;

import java.util.Scanner;

public class Ensayo2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int []voltajes=new int[10];

        System.out.println("LLENAMOS EL ARREGLO");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Inserte cantidad: ");
            voltajes[i]=entrada.nextInt();

        }
        System.out.println("----------------------------------------------");
        //Mostramos los valores
        for(double i:voltajes){
            System.out.println("Lista de números: "+i);
        }
    }
}
