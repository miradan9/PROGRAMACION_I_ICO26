//Valeria Danae Aguayo Miranda.

package U4_Archivos;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.sort;

public class ArrayListMenu {

        private static ArrayList<String> listaAsignaturas =new ArrayList<>();
        private static Scanner entrada = new Scanner(System.in);
        static ArchivoCadenas archivo;
        public static void main(String[] args) {
            archivo=new ArchivoCadenas("asignaturas.txt");
            listaAsignaturas =archivo.LeerArchivo();
            sort(listaAsignaturas);
            mostrarListaAsignaturas();
            int opcion, indice;
            String nombreA;
            do {
                menu();
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Dime el nombre de una asignatura: ");
                        nombreA = entrada.next();
                        meterAsignaturas(nombreA);
                        archivo.EscribirEnArchivo(listaAsignaturas);
                        break;
                    case 2:
                        sort(listaAsignaturas);
                        mostrarListaAsignaturas();
                        break;
                    case 3:
                        System.out.print("Dame el nombre de la asignatura a buscar: ");
                        nombreA = entrada.next();
                        indice = buscarAsignatura(nombreA);
                        if (indice != -1) {
                            System.out.println("Encontrada en la posición " + indice);
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;
                    case 4:
                        sort(listaAsignaturas);
                        mostrarListaAsignaturas();
                        System.out.print("Dame el nombre de la asignatura a borrar: ");
                        nombreA = entrada.next();
                        indice = buscarAsignatura(nombreA);
                        if (indice != -1) {
                            listaAsignaturas.remove(indice);
                            archivo.EscribirEnArchivo(listaAsignaturas);
                            System.out.println("Asignatura Eliminada");
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;
                    case 5:
                        sort(listaAsignaturas);
                        mostrarListaAsignaturas();
                        System.out.print("Dame el nombre de la asignatura a cambiar: ");
                        nombreA = entrada.next();
                        indice = buscarAsignatura(nombreA);
                        if (indice != -1) {
                            System.out.print("Dame nuevo nombre de la asignatura: ");
                            nombreA = entrada.next();
                            listaAsignaturas.set(indice, nombreA);
                            archivo.EscribirEnArchivo(listaAsignaturas);
                            System.out.println("Nombre cambiado");
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                        default:
                        System.out.println("No válido");
                        break;
                } //fin de switch
            } while (opcion != 6);
        }
        private static void menu(){
            System.out.println("-------------------------------------");
            System.out.println("Uso de ArrayList para una lista de asignaturas");
            System.out.println("1.-Añadir una asignatura a la lista");
            System.out.println("2.-Mostar asignaturas");
            System.out.println("3.-Buscar una asignatura");
            System.out.println("4.-Borrar una asignatura");
            System.out.println("5.-Cambiar una asignatura");
            System.out.println("6.-Salir");
            System.out.println("Elige tu opción: ");
        }
        private static void meterAsignaturas(String nombreAsignatura){
            listaAsignaturas.add(nombreAsignatura);
        }
        private static void mostrarListaAsignaturas(){
            System.out.println("Lista de asignaturas: ");
            for(String asignatura: listaAsignaturas){
                System.out.print(asignatura+" ");
            }
            System.out.println();
        }
        private static int buscarAsignatura(String nombreFruta){
            for (int index = 0; index< listaAsignaturas.size(); index++){
                if(nombreFruta.equals(listaAsignaturas.get(index))){
                    return index;
                }
            }
            return -1;
        }
    }