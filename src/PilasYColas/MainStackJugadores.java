package PilasYColas;
import java.util.Scanner;
import java.util.Stack;

public class MainStackJugadores {
    public static void main(String[] args) {

        int opcion;
        Stack<Jugador> pilaJugadores = new Stack<>();
        Jugador j1 = new Jugador(1, "José", "Defensa", 3);
        Jugador j2 = new Jugador(2, "Rogelio", "Defensa", 5);
        Jugador j3 = new Jugador(3, "Fernando", "Medio", 6);
        Jugador j4 = new Jugador(4, "Luis", "Medio", 5);
        Jugador j5 = new Jugador(5, "Mario", "Delantero", 4);
        pilaJugadores.push(j1);
        pilaJugadores.push(j2);
        pilaJugadores.push(j3);
        pilaJugadores.push(j4);
        pilaJugadores.push(j5);
        Scanner entrada = new Scanner(System.in);
        do {
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
                    pilaJugadores.push(jugador);
                    break;
                case 2:
                    if (pilaJugadores.isEmpty()) {
                        System.out.printf("La pila está vacía%n%n");
                    } else {
                        Jugador jugadorEliminado = pilaJugadores.pop();
                        System.out.printf("Se saco %s%n", jugadorEliminado);
                    }
                    break;
                case 3:
                    if (pilaJugadores.isEmpty()) {
                        System.out.printf("La pila esta vacía%n%n");
                    } else {//la pila no está vacía
                        System.out.printf("La pila contien: %s (cima)%n", pilaJugadores);
                    }
                    break;
                case 4:
                    if (pilaJugadores.isEmpty()) {
                        System.out.printf("La pila está vacía%n%n");
                    } else { //la pila no está vacía
                        System.out.println("En la cima está " + pilaJugadores.peek());

                    }
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }// fin de switch
        } while(opcion!=5);
    }
    private static void menu(){
        System.out.println("Opciones sobre jugadores");
        System.out.println("1.-Meter jugador");
        System.out.println("2.-Sacar jugador");
        System.out.println("3.-Imprimir pila de jugadores");
        System.out.println("4.-Consultar top de la pila");
        System.out.println("5.-Salir");
        System.out.print("Elige tu opción: ");
    }// fin de menu
}
