package P03_Clases.EjercicioCargosBancarios;
import java.util.Scanner;
public class PruebaCargosBancarios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double saldo;
        int cheques;
        System.out.println("Dame el saldo del cliente: ");
        saldo = entrada.nextDouble();
        System.out.println("Dame la cantidad de cheques emitidos: ");
        cheques = entrada.nextInt();
        CargosBancarios cargosB = new CargosBancarios(saldo, cheques);
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: "+ cargosB.obtenerSaldoActual());
                    break;
                case  2:
                    System.out.println("Cargos bancarios: "+cargosB.obtenerCobroTotal());
                    System.out.println("Saldo actual después de los cobros: "+ cargosB.obtenerSaldoActual());
                    break;
                case 3:
                    System.out.println("Dame nuevo saldo del cliente: ");
                    saldo=entrada.nextDouble();
                    System.out.println("Dame nueva cantidad de cheques emitidos: ");
                    cheques=entrada.nextInt();
                    break;
                case 4:
                    break;
                default:
                    break;
            }//fin de switch //nos permite tener varios caminos
        } while (opcion != 4);
    }//fin de main
    public static void menu(){
        System.out.println("---------------------------------------------");
        System.out.println("Menú principal");
        System.out.println("1.-Mostrar saldo actual");
        System.out.println("2.-Aplicar cargos bancarios y mostrar el saldo restante");
        System.out.println("3.-Asignar nuevos valores al balance de la cuenta");
        System.out.println("4.-Salir");
        System.out.println("Dame tu opción: ");
    }//fin de menú
}
