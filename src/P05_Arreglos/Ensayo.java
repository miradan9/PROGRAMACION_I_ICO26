package P05_Arreglos;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ensayo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        double[]pendientes={11.62,13.98,18.45,12.68,14.76};

        System.out.println("LLENAMOS EL ARREGLO");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Inserte la primera cantidad: ");
            pendientes[i]=entrada.nextDouble();

        }
        System.out.println("----------------------------------------------");
        //Imprimimos los valores
        for(double i:pendientes){
            System.out.println(". Lista de números: "+i);
        }
    }

}
