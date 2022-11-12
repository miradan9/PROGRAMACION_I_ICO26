package P04_Estructuras;
import java.util.Scanner;
public class GastosDeEnvio {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    double peso;
        System.out.println("Envio rapido de mercancias");
        System.out.println("-------------------------------");
        System.out.println("Lista de precios de envio dependiendo el peso");
        System.out.println("PESO DEL PAQUETE     COSTO");
        System.out.printf("%2s %21s\n", "2kg o menor", "$ 1.10");
        System.out.printf("%2s %7s\n", "Mas de 2 kg y menor que 6","$ 2.20");
        System.out.printf("%2s %5s\n", "Mas de 6 kg y menor que 10","$ 3.70");
        System.out.printf("%2s %23s\n", "Mas de 10", "$ 4.80");
        System.out.println("-------------------------------");
        System.out.print("Ingrese la el peso del paquete: ");
    peso = entrada.nextDouble();

        if (peso >= 0 && peso<2){
        System.out.println("El precio de envio a pagar es: $ 1.10");
    }
        else if (peso>2 && peso<6){
        System.out.println("El precio de envio a pagar es: $ 2.20");
    }
        else if (peso>6 && peso<10){
        System.out.println("El precio de envio a pagar es: $ 3.70");
    }
        else if (peso>10){
        System.out.println("El precio de envio a pagar es: $ 4.80");
    }
        System.out.println("Fin del programa");
}
        }
