package P05_Arreglos;

import java.util.Scanner;

public class Ensayo3_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] distancias = new double[100];
        System.out.println("LISTA DE DISTANCIAS");

        for (int i = 0; i < 100; i++) {
            System.out.print("°Distancia " + (i + 1) + ": ");
            distancias[i] = entrada.nextInt();
            if (distancias[i] < 0 ) {
                System.out.println("ERROR");
            }
            else if (distancias[i] > 100) {
                System.out.println("ERROR");
            }
        }
        System.out.println("Distancias finales: " + distancias);
    }
}
