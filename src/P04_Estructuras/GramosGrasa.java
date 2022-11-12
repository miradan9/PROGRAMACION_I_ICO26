package P04_Estructuras;
import java.util.Scanner;
public class GramosGrasa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double CantidadCalorias, CantidadGramos, Porcentaje, total;
        int numero = 0;
        while (numero != 5) {

            System.out.println("Programa Gramos-Grasa");

            System.out.println("Ingrese la cantidad de calorias de grasa del alimento: ");
            CantidadCalorias = entrada.nextDouble();

            System.out.println("Ingrese la cantidad de gramos de grasa del alimento: ");
            CantidadGramos = entrada.nextDouble();

            total = CantidadGramos * 9;
            if (CantidadCalorias > total) {
                System.out.println("Números invalidos");
                System.out.println("------------------------------------------------------------------------------");
            } else {
                Porcentaje = (CantidadCalorias / total) * 100;
                System.out.println("El porcentaje de calorias que provienen de la grasa son de: " + Porcentaje);
                if (Porcentaje < 30) {
                    System.out.println("El alimento es bajo en grasa");
                } else if (Porcentaje > 30) {
                    System.out.println("Los números son invalidos");
                }
                System.out.print("Escriba el numero (5 para terminar), si desea continuar ingrese otro número: ");
                numero = entrada.nextInt();
                System.out.println("------------------------------------------------------------------------------");
            }


    }
}}