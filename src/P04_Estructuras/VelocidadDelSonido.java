package P04_Estructuras;
import java.util.Scanner;
public class VelocidadDelSonido {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double distancia, tiempo;
        int opcion=4;

        System.out.println("Menú\n1.Velocidad en aire\n2.Velocidad en agua\n3.Velocidad en agua\n4.Salir");
        do {
            System.out.println("Ingrese el número de la opción que desea realizar: ");
            opcion = entrada.nextInt();

            if(opcion>4){
                System.out.println("El número ingresado no existe dentro del menú");
            }else {

                switch (opcion) {
                    case 1:
                        System.out.println("Velocidad en aire\nIngrese la distancia en pies: ");
                        distancia = entrada.nextDouble();
                        tiempo = distancia / 1100;
                        System.out.println("El tiempo que tardara es de: " + tiempo);
                        break;

                    case 2:
                        System.out.println("Velocidad en agua\nIngrese la distancia en pies: ");
                        distancia = entrada.nextDouble();
                        tiempo = distancia / 4900;
                        System.out.println("El tiempo que tardara es de: " + tiempo);
                        break;

                    case 3:
                        System.out.println("Velocidad en acero\nIngrese la distancia en pies: ");
                        distancia = entrada.nextDouble();
                        tiempo = distancia / 16400;
                        System.out.println("El tiempo que tardara es de: " + tiempo);
                        break;

                    default:
                        System.out.print("Fin del programa");

                }
            }
        }while(opcion != 4);
    }
}

