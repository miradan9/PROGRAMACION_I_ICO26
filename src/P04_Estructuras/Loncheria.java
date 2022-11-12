package P04_Estructuras;
import java.util.Scanner;
public class Loncheria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Lista de precios para una lonchería");
        //Tortas, refrescos, quesadillas, tacos, Aguas freascas

        double precioTortas, precioRefrescos, precioQuesadillas = 1, precioTacos, precioAguas;
        System.out.print("Dame el precio de las tortas: ");
        precioTortas = entrada.nextDouble();
        System.out.printf("%15s %8s\n", "Cantidad-tortas", "Total");
        System.out.println("___________________________________________________");

        //for- inicio, condición, incremento
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%15d %8.2f\n", i, i * precioTortas);
        }
        System.out.print("Dame el precio de los refrescos: ");
        precioRefrescos = entrada.nextDouble();
        System.out.printf("%18s %8s\n", "Cantidad-Refrescos", "Total");
        System.out.println("____________________________________________________");
        for (int i = 10; i <= 20; i++) {
            System.out.printf("%18s %8.2f\n", i, i * precioRefrescos);
        }
        //Quesadillas
        System.out.print("Dame el precio de las quesadillas: ");
        precioQuesadillas = entrada.nextDouble();
        System.out.printf("%18s %8s\n", "Cantidad-Quesadillas", "Total");
        System.out.println("____________________________________________________");
        for (int i = 12; i <= 48; i = i + 4) {
            System.out.printf("%18s %8.2f\n", i, i * precioQuesadillas);
        }
        //Tacos
        System.out.print("Dame el precio de los tacos: ");
        precioTacos = entrada.nextDouble();
        System.out.printf("%18s %8s\n", "Cantidad-Tacos", "Total");
        System.out.println("____________________________________________________");
        for (int i = 20; i >= 10; i--) {
            System.out.printf("%18s %8.2f\n", i, i * precioTacos);
        }
        //Aguas frescas
        System.out.print("Dame el precio de las Aguas Frescas: ");
        precioAguas = entrada.nextDouble();
        System.out.printf("%18s %8s\n", "Cantidad-Aguas Frescas", "Total");
        System.out.println("____________________________________________________");
        for (int i = 10; i <= 100; i = i + 10)//puede ser i=i+10 ó i+=10 checa cap en apuntes de clase debidos que se hacen otras modificaciones{
            System.out.printf("%18s %8.2f\n", i, i * precioAguas);
        }
    }

