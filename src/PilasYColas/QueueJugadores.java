package PilasYColas;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class QueueJugadores {
    public static void main(String[] args) {
        int opcion;
        Queue<Jugador> colaJugadores = new LinkedList<>();
        Jugador j1 = new Jugador(1, "José", "Defensa", 3);
        Jugador j2 = new Jugador(2, "Rogelio", "Defensa", 5);
        Jugador j3 = new Jugador(3, "Fernando", "Medio", 6);
        Jugador j4 = new Jugador(4, "Luis", "Medio", 5);
        Jugador j5 = new Jugador(5, "Mario", "Delantero", 4);
        colaJugadores.add(j1);
        colaJugadores.add(j2);
        colaJugadores.add(j3);
        colaJugadores.add(j4);
        colaJugadores.add(j5);
        Scanner entrada = new Scanner(System.in);
        do {
            imprimirLinea();
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    int numero, goles;
                    String nombre, posicion;
                    System.out.println("Dame el numero: ");
                    numero = entrada.nextInt();
                    System.out.println("Dame el nombre: ");
                    nombre = entrada.nextLine();
                    nombre = entrada.nextLine();
                    System.out.println("Dame la posición: ");
                    posicion = entrada.nextLine();
                    System.out.println("Dame los goles: ");
                    goles = entrada.nextInt();
                    Jugador jugador = new Jugador(numero, nombre, posicion, goles);
                    colaJugadores.add(jugador);
                    break;
                case 2:
                    if (colaJugadores.isEmpty()) {
                        System.out.printf("La cola está vacía%n%n");
                    } else {
                        Jugador jugadorEliminado = colaJugadores.remove();
                        System.out.printf("Se saco %s%n", jugadorEliminado);
                    }
                    break;
                case 3:
                    if (colaJugadores.isEmpty()) {
                        System.out.printf("La cola esta vacía%n%n");
                    } else {//la cola no está vacía
                        System.out.printf("La cola contiene: (frente) %s (final)%n", colaJugadores);
                    }
                    break;
                case 4:
                    if (colaJugadores.isEmpty()) {
                        System.out.printf("La cola está vacía%n%n");
                    } else { //la cola no está vacía
                        System.out.println("Alfrente está " + colaJugadores.peek());

                    }
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }// fin de switch
        } while (opcion != 5);
    }

    private static void menu() {
        System.out.println("Opciones sobre jugadores");
        System.out.println("1.-Meter jugador");
        System.out.println("2.-Sacar jugador");
        System.out.println("3.-Imprimir pila de jugadores");
        System.out.println("4.-Consultar top de la pila");
        System.out.println("5.-Salir");
        System.out.print("Elige tu opción: ");
    }// fin de menu
    private static void imprimirLinea(){
        System.out.println("--------------------------------------------------------"+
                "-------------------------------------");
    }
}
