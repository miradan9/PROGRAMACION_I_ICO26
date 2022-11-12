package P04_Estructuras;
import java.util.Scanner;
public class CuadradoDeNumeros {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero, cuadrado;
    int contador=0;
        System.out.print("Escribe un número para obtener su cuadrado (negativo para terminar): ");
        numero= entrada.nextInt();
        while (numero>=0){
            cuadrado=numero*numero;
            System.out.println("El resultado es: "+cuadrado);
            System.out.print("Escribe un número para obtener su cuadrado (negativo para terminar): ");
            numero= entrada.nextInt();
        }

        System.out.println("TÉRMINO NO VÁLIDO");
        System.out.println("FIN DEL PROGRAMA");
}
}
