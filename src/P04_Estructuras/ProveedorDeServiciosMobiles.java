package P04_Estructuras;
import java.util.Scanner;
public class ProveedorDeServiciosMobiles {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        double minutos, total;
        String opcion;
        int tiempoExtra=0;
        System.out.println("Menú\n Paquete A\n Paquete B\nPaquete C");

        do {
            System.out.println("Ingrese el número de la opción que desea realizar");
            opcion = entrada.next();

            switch (opcion) {
                case "A":
                    System.out.println("Paquete A \nIngrese la cantidad de minutos utilizados ");
                    minutos = entrada.nextDouble();
                    if(minutos<=450){
                        System.out.println("El pago mensual de su paquete movil es de: $39.99 al mes");
                    }else {
                        tiempoExtra=(int) (minutos-450);
                        total=(tiempoExtra*0.45)+39.99;
                        System.out.println("El total a pagar es de "+ total);
                    }
                    break;

                case "B":

                    System.out.println("Paquete B \nIngrese la cantidad de minutos utilizados ");
                    minutos = entrada.nextDouble();
                    if(minutos<=900){
                        System.out.println("El pago mensual de su paquete movil es de: $59.99 al mes");
                    }else {
                        tiempoExtra=(int) (minutos-900);
                        total=(tiempoExtra*0.40)+59.99;
                        System.out.println("El total a pagar es de "+ total);
                    }
                    break;

                case "C":

                    System.out.println("Paquete C \nIngrese la cantidad de minutos utilizados ");
                    minutos = entrada.nextDouble();

                    System.out.println("El pago mensual de su paquete movil es de: $69.99 al mes\n independientemente del numero de minutos utilizados, ya que \n"
                            + "su paquete es ilimitado");
                    break;

                default :
                    System.out.println("FIN DEL PROGRAMA");

            }
        }while(opcion !="A"||opcion !="B"||opcion !="C"||opcion !="D" );


    }
}

