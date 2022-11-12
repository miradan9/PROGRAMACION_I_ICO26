package P04_Estructuras;
import java.util.Scanner;
public class Ruleta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero de 0 a 36: ");
        num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " El número espar");
        } else {
            System.out.println(num + " El número es impar");
        }

        System.out.println("Por lo cual corresponde a la casilla");
        if (num >= 1 && num <= 10) {
            if (num % 2 == 0) {
                System.out.println("Casilla negra");
            } else {
                System.out.println("Casilla roja");
            }
        } else if (num > 10 && num <= 18) {
            if (num % 2 == 0) {
                System.out.println("Casilla roja");
            } else {
                System.out.println("Casilla negra");
            }
        } else if (num > 18 && num <= 28) {
            if (num % 2 == 0) {
                System.out.println("Casilla negra");
            } else {
                System.out.println("Casilla roja");
            }
        } else if (num > 28 && num <= 36) {
            if (num % 2 == 0) {
                System.out.println("Casilla roja");
            } else {
                System.out.println("Casilla negra");
            }
        } else if (num > 36) {
            System.out.println("El numero que usted selecciono sobrepasa de los numero pedido");
        }
        while (num != 37) ;
    }
}
