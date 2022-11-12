package P04_Estructuras;
import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.Scanner;
public class Equipos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner((System.in));
        int opcion;
        System.out.println("PROGRAMA PARA ESCOGER UN EQUIPO DE FUTBOL");
        System.out.println("Equipos de Futbol mexicanos ");
        System.out.println("1.-Cruz Azul");
        System.out.println("2.-Chivas");
        System.out.println("3.-Pumas");
        System.out.println("4.-Toluca");
        System.out.println("Elige tu equipo: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Por fin...");
                break;
            case 2:
                System.out.println("Eres un ganador sin corona");
                break;
            case 3:
                System.out.println("Jugando fuertes pumas");
                break;
            case 4:
                System.out.println("Estás con el mejor equipo de mundo");
                break;
            default:
                System.out.println("Opción no válida. Escoge entre 1 y 4");
                break;
        }//fin de switch
    }//fin del main
}