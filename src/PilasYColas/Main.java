package PilasYColas;
import org.w3c.dom.ls.LSOutput;
import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        PilaJugadorArreglo pilaE = new PilaJugadorArreglo(10);

        Jugador j1 = new Jugador(1, "José", "Defensa", 3);
        Jugador j2 = new Jugador(2, "Rogelio", "Defensa", 5);
        Jugador j3 = new Jugador(3, "Fernando", "Medio", 6);
        Jugador j4 = new Jugador(4, "Luis", "Medio", 5);
        Jugador j5 = new Jugador(5, "Mario", "Delantero", 4);

        ColaJugadoresArreglo colaJugadores = new ColaJugadoresArreglo(10);
        //Se meten los jugadores
        colaJugadores.meter(j1);
        colaJugadores.meter(j2);
        colaJugadores.meter(j3);
        colaJugadores.meter(j4);
        colaJugadores.meter(j5);

        System.out.println("---------------------------------");
        System.out.println("Los jugadores son: ");
        colaJugadores.imprimirCola();
        System.out.println("---------------------------------");
        //quitamos 2 jugadores
        System.out.println("Sacando: " + colaJugadores.sacar());
        System.out.println("Sacando: " + colaJugadores.sacar());
        System.out.println("---------------------------------");
        System.out.println("Los jugadores son: ");
        colaJugadores.imprimirCola();
        System.out.println("---------------------------------");
        // Consultamos quién es el primer jugador
        System.out.println();
        System.out.println("Primer jugador: " + colaJugadores.consultarFrente());


        //Menu
        //1.Meter Jugador
        //2. Sacar Jugador
        //3.Imprimir lista jugadores
        //4. Consultar frente de la cola
        //5.Salir
    }
}
