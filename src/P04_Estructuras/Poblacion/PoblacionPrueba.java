package P04_Estructuras.Poblacion;
import java.util.Scanner;
public class PoblacionPrueba {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Prueba de crecimiento de la población");
        System.out.println("Ingresa la cantidad de bacterias iniciales: ");
        int bacterias= entrada.nextInt();
        System.out.println("Ingresa el porcentaje de crecimiento: ");
        int crecimiento=entrada.nextInt();
        System.out.println("Ingresa los días de a simular el crecimiento: ");
        int dias=entrada.nextInt();
        Poblacion poblacion1=new Poblacion(bacterias,crecimiento,dias);

        }
    }
