package Computadora;
import java.util.Scanner;

public class PruebaComputadoras {
    static Catalogo catalogoComputadoras = new Catalogo();
    static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {
        catalogoComputadoras.verCatalogo();
        int opcion, indice;
        int clave;
        String Titulo;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1 -> pedirDatosComputadora();
                case 2 -> catalogoComputadoras.verCatalogo();
                case 3 -> {
                    catalogoComputadoras.verCatalogoDisponible();
                }
                case 4 -> {
                    System.out.println("Buscar una computadora por clave (B.Binaria");
                    catalogoComputadoras.ordenarClaves();
                    System.out.print("Dame la clave de la computadora a buscar: ");
                    clave = entrada.nextInt();
                    indice = catalogoComputadoras.buscarComputadoraPorClaveBinaria(clave);
                    if (indice != -1) {
                        catalogoComputadoras.mostrarComputadora(indice);
                    } else {
                        System.out.println("No se encontró...");
                    }
                }
                case 5 -> {
                    System.out.println("Buscar una computadora por Clave (B.Secuencial");
                    System.out.print("Ingresa Clave de la computadora: ");
                    int Clave = entrada.nextInt();
                    if (catalogoComputadoras.validarDisponiblidad(Clave)){
                        indice = catalogoComputadoras.buscarComputadoraPorClaveSecuencial(Clave);

                        if (indice != -1) {
                            catalogoComputadoras.mostrarComputadora(indice);
                        } else {
                            System.out.println("No se encontró ");
                        }
                    }else {
                        System.out.println("Clave de computadora sin disponibilidad");
                    }

                }
                case 6 -> {
                    System.out.print("Dame la clave de la computadora que deseas borrar:");
                    clave = entrada.nextInt();
                    indice = catalogoComputadoras.buscarComputadoraPorClaveSecuencial(clave);
                    if (indice == -1) {
                        System.out.println("La clave no existe repite la operación ");
                    } else {
                        catalogoComputadoras.borrarComputadora(clave);
                        System.out.println("La computadora se ha eliminado ");
                        catalogoComputadoras.verCatalogo();
                    }
                }
                case 7 -> cambiarModelo();
                case 8 -> {
                    System.out.println("Computadoras de mayor precio");
                    //catalogoComputadoras.ordenarPrecios();
                    //catalogoComputadoras.verCatalogo();
                    catalogoComputadoras.MostrarPrecioMayor();
                }
                case 9 -> {
                    System.out.println("Computadoras ordenadas por cantidad de nucleos: ");
                    catalogoComputadoras.ordenarPorNucleos();
                    catalogoComputadoras.verCatalogo();
                }
                case 10 -> {
                    System.out.println("Hasta la proxima");
                }

                default -> System.out.println("OPCIÓN NO VALIDA ");
            }
        } while (opcion != 10);

    }

    private static void menu() {
        imprimirLinea();
        System.out.println("MENU");
        System.out.println("1.- Añadir computadora ");
        System.out.println("2.- Mostrar lista total de computadoras ");
        System.out.println("3.- Mostrar lista de computadoras disponibles");
        System.out.println("4.- Buscar computadora por clave (Busqueda binaria)");
        System.out.println("5.- Buscar computadora por clave (Disponibles) ");
        System.out.println("6.- Borrar computadora");
        System.out.println("7.- Cambiar el modelo de una computadora");
        System.out.println("8.- Mostrar el precio mas alto del inventario");
        System.out.println("9.- Ordenar por nucleos ");
        System.out.println("10.- Imprimir inventario de computadoras");
        System.out.println("11.- Salir...");
        System.out.print("Elige una opción: ");
    }

    public static void pedirDatosComputadora() {
        int clavex, cantidadx, nucleox;
        String marcax, modelox;
        double preciox;
        String disponibilidad;
        boolean disponiblex = false;
        System.out.print("Dame la clave de la computadora: ");
        clavex = entrada.nextInt();
        entrada.nextLine();

        if (catalogoComputadoras.validarExistencia(clavex) == -1) {
            System.out.print("Dame la marca de la computadora: ");
            marcax = entrada.nextLine();
            System.out.print("Escribe el modelo de la computadora: ");
            modelox = entrada.nextLine();
            System.out.print("Dame la cantidad de nucleos de la computadora: ");
            nucleox = entrada.nextInt();
            System.out.print("Dame el precio de la computadora: ");
            preciox = entrada.nextDouble();
            System.out.print("Dame la cantidad de computadoras: ");
            cantidadx = entrada.nextInt();
            entrada.nextLine();
            System.out.println("¿Disponible?");
            disponibilidad = entrada.nextLine().toLowerCase();
            if (disponibilidad.equals("true")) {
                disponiblex = true;
            }
            Computadora computadora = new Computadora(clavex, marcax, modelox, nucleox, preciox, cantidadx, disponiblex);
            catalogoComputadoras.insertarComputadora(computadora);
        } else {
            System.out.println("Clave existente, reintente...");
        }
    }

    public static void imprimirLinea() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

    private static void cambiarModelo() {
        int clave, indice;
        System.out.println("Cambiar Modelo de computadora ");
        System.out.print("Dame la clave de la computadora: ");
        clave = entrada.nextInt();
        indice = catalogoComputadoras.buscarComputadoraPorClaveSecuencial(clave);
        if (indice == -1) {
            System.out.println("La clave no existe ");
            System.out.println();
        } else {
            entrada.nextLine();
            System.out.println("Datos de la computadora");
            catalogoComputadoras.mostrarComputadora(indice);
            System.out.println();
            System.out.print("Ingresa el nuevo modelo de la computadora: ");
            String modelo = entrada.nextLine();
            catalogoComputadoras.cambiarModelo(indice, modelo);
            System.out.println("Datos guardados");
            System.out.println();
        }
    }
}
