package P05_Arreglos;

 import java.util.Scanner;
public class EjemploListaCompras_3 {
    public static void main(String[] args) {

        final int NUM_ELEMENTOS = 5;
        String[] listaCompras = new String[NUM_ELEMENTOS];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa los "+NUM_ELEMENTOS+"artículos para conformar la lista de compras:");

        //Leer los artículos a comprar
        for(int index=0; index<NUM_ELEMENTOS; index++){
            System.out.print("Artículo # "+ (index + 1) + ": ");
            listaCompras[index]=entrada.nextLine();
        }
        //Muestra los valores almacenados
        System.out.println("----------------------");
        System.out.println("Los artículos a comprar son: ");
        for(int index=0; index<NUM_ELEMENTOS; index++) {
            System.out.println(listaCompras[index]);
        }
        }
    }

