package PilasYColas;
import java.util.EmptyStackException;
public class PilaJugadorArreglo {
    private Jugador[] pila;
    private int top;

    public PilaJugadorArreglo(int capacidad) {
        pila = new Jugador[capacidad];
    }

    public void push(Jugador elJugador) {
        if (top == pila.length) {
            Jugador[] newArray = new Jugador[2 * pila.length];
            System.arraycopy(pila, 0, newArray, 0, pila.length);
            pila = newArray;
        }
        pila[top++] = elJugador;
    }

    public Jugador pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        Jugador elJugador = pila[--top];
        pila[top] = null;
        return elJugador;
    }

    public Jugador consultarTop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return pila[top - 1];
    }

    public int numElementos() {
        return top;
    }

    public boolean estaVacia() {
        return top == 0;
    }

    public void imprimirPila() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }

    public class Main {
        public static void main(String[] args) {
            PilaJugadorArreglo pilaE = new PilaJugadorArreglo(10);

            Jugador j1 = new Jugador(1, "José", "Defensa", 3);
            Jugador j2 = new Jugador(2, "Rogelio", "Defensa", 5);
            Jugador j3 = new Jugador(3, "Fernando", "Medio", 6);
            Jugador j4 = new Jugador(4, "Luis", "Medio", 5);
            Jugador j5 = new Jugador(2, "Mario", "Delantero", 4);
            System.out.println("---------------");
            System.out.println("Ingresando elementos");
            pilaE.push(j1);
            pilaE.push(j2);
            pilaE.push(j3);
            pilaE.push(j4);
            pilaE.push(j5);

            pilaE.imprimirPila();
            System.out.println("--------------------");
            System.out.println("Elemento top: " + pilaE.consultarTop());
            System.out.println("--------------------");
            System.out.println("Sacando: " + pilaE.pop());
            System.out.println("-------------Después de sacar un elemento");
            System.out.println("Elemento top: " + pilaE.consultarTop());
        }
    }
}
