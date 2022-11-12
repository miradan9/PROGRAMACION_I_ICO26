package BusquedaLinealYBinaria;

import java.util.Scanner;
//"VALERIA DANAE AGUAYO MIRANDA"
public class Menu {
    static String[] listaOrdenada = Vocabulario.listaOrdenada;
    static String[] listaDesordenada = Vocabulario.listaDesordenada;
    static Scanner palabraInsertada = new Scanner(System.in);
    static int Menu;
    static String posicion;

    public static void main(String[] args) {
        System.out.println("VALERIA DANAE AGUAYO MIRANDA");
        System.out.println("-----------------------------------------------------");
        System.out.println("Búsqueda Binaria y Lineal");
        System.out.println("1.- Buscar palabra con búsqueda lineal");
        System.out.println("2.- Buscar palabra con búsqueda binaria");
        System.out.println("3.- Salir");
        System.out.print("Selecciona el tipo de método que deseas realizar: ");
        Menu = palabraInsertada.nextInt();
        palabraInsertada.nextLine();
        switch (Menu) {
            case 1:
                System.out.println("Búsqueda Lineal...");
                System.out.print("Ingresa la palabra a buscar: ");
                posicion = palabraInsertada.nextLine();
                System.out.println("Buscando: '" + posicion + "'...");
                BusquedaLineal busquedaLineal = new BusquedaLineal(listaDesordenada);
                int indice = busquedaLineal.busqueda(posicion);
                if (indice == -1) {
                    System.out.println("No se encontraron resultados");
                } else {
                    System.out.println("'" + posicion + "' encontrado en la posición: " + indice);
                }
                break;
            case 2:
                System.out.println("Búsqueda Binaria");
                System.out.print("Ingresa la palabra a buscar: ");
                posicion = palabraInsertada.nextLine();
                System.out.println("Buscando: '" + posicion + "'...");
                BusquedaBinaria busquedaBinaria = new BusquedaBinaria(listaOrdenada);
                int indiceBinario = busquedaBinaria.buscar(posicion);
                if (indiceBinario == -1) {
                    System.out.println("No se encontraron resultados");
                } else {
                    System.out.println("'" + posicion + "' encontrado en la posición: " + indiceBinario);
                }
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion invalida. Reintente");
        }
    }
}
