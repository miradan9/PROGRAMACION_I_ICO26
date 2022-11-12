package Busqueda;
import java.util.Scanner;

public class Menu {
    static  Scanner Scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] listaPalabras=Vocabulario.listaDesordenada;

        System.out.println("BÚsqueda lineal y binaria ");
        System.out.println("Diego Ruiz Estudillo");
        System.out.println("1.Busqueda lineal");
        System.out.println("2.Busqueda binaria");
        System.out.println("3.Salir");
        System.out.println("Digite una opción: ");

        int opcion = Scanner.nextInt();
        switch (opcion) {
            case 1:
                BusquedaLineal();
                break;

            case 2:
                BusquedaBinaria();
                break;

        }
        while (opcion!=3);
    }
    static void BusquedaLineal(){
        System.out.println("Busqueda Lineal ");
        System.out.println("Digite la palabra a buscar: ");
    }


    static void BusquedaBinaria(){
        System.out.println("Busqueda binaria ");
        System.out.println("Digite la palabra a buscar: ");

        String miarray [] = {};


    }
}
