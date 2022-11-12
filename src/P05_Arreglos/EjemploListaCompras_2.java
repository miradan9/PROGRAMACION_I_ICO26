package P05_Arreglos;
import java.util.Scanner;
public class EjemploListaCompras_2 {
    public static void main(String[] args) {
        final int NUM_ELEMENTOS=5;
        String[] listaCompras=new String[NUM_ELEMENTOS];
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa los articulos para conformar "+ "la lista de compras:");
        //Lee datos del primer articulo
        System.out.print("Primer artículo: ");
        listaCompras[0]=entrada.nextLine();
        //Lee datos del segundo articulo
        System.out.print("Segundo artículo: ");
        listaCompras[1]=entrada.nextLine();
        //Lee datos del tercero articulo
        System.out.print("Tercer artículo: ");
        listaCompras[2]=entrada.nextLine();
        //Lee datos del cuarto articulo
        System.out.print("Cuarto artículo: ");
        listaCompras[3]=entrada.nextLine();
        //Lee datos del quinto articulo
        System.out.print("Último artículo: ");
        listaCompras[4]=entrada.nextLine();

        //Muestra los valores almacenados
        System.out.println("Los artículos a comprar son:");
        System.out.println(listaCompras[0]);
        System.out.println(listaCompras[1]);
        System.out.println(listaCompras[2]);
        System.out.println(listaCompras[3]);
        System.out.println(listaCompras[4]);
    }
}
