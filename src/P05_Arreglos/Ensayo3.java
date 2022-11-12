package P05_Arreglos;

import java.util.Scanner;

public class Ensayo3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] distancias = new double[100];
        System.out.println("LISTA DE DISTANCIAS");

        for (int i = 0; i < 1000; i++) {
            System.out.print("°Distancia: ");
            distancias[i] = entrada.nextDouble();
            if (distancias[i] < 0 ) {
                System.out.println("ERROR, por favor ingrese una valor válido");
                System.out.println("---------------------------------------------");
            }
            else if (distancias[i] > 1000) {
                System.out.println("ERROR, por favor ingrese una valor válido");
                System.out.println("---------------------------------------------");
            }
        }
        System.out.println("Distancias finales: " + distancias);
    }
}

