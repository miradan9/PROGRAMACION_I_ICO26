package PROGRAMACION_II.examenDiagnostico;
import java.util.Scanner;

public class valoresAleatorios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] numero = new double[10];
        double numeroCubo;
        double numeroCuadrado;
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Inserte un número: ");
            numero[i] = entrada.nextDouble();
        }
        System.out.printf("%2s %4s %4s\n", " Valor: ", "  Al cuadrado: ","  Al cubo: ");
        System.out.println("____________________________________________________");
        for (i = 0; i < 10; i++) {
            numeroCuadrado = Math.pow(numero[i], 2);
            numeroCubo = Math.pow(numero[i], 3);
            System.out.printf("%4s %12s %14s\n", numero[i], numeroCuadrado, numeroCubo);

        }
    }
}
