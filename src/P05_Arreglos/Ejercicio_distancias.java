package P05_Arreglos;

import java.util.Scanner;

//c. una lista de 100 distancias en número de precisión doble; se llenará usando números aleatorios entre 1 a 1000
public class Ejercicio_distancias {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        double [] distancias=new double[100];
        for(int i=0;i<100;i++){
            System.out.print("°Distancia: ");
            distancias[i]=entrada.nextDouble();
            if(distancias[i]<1){
                System.out.println("ERROR,vuelva a ingresar un valor válido.");
                System.out.println("-------------------------------------------");
            }
            else if(distancias[i]>1000){
                System.out.println("ERROR,vuelva a ingresar un valor válido.");
                System.out.println("-------------------------------------------");

            }
        }
        System.out.println("Distancias finales:"+distancias);
    }

}
