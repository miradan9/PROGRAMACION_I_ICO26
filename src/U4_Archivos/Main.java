package U4_Archivos;
import java.util.Scanner;
public class Main {
    static Catalogo catalogoTienda=new Catalogo();
    static Scanner entrada=new Scanner (System.in);

    public static void main(String[] args) {
        catalogoTienda.verCatalogo(); //Para ver las canciones del catalogo
        int opcion, indice;
        int clave;
        String nombreCancion;
        do{
            menu();
            opcion= entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    pedirDatosCancion();
                    break;
                case 2:
                    catalogoTienda.ordenarClaves();
                    catalogoTienda.verCatalogo();
                    break;
                case 3:
                    System.out.print("Dame la clave de la canción a buscar: ");
                    clave=entrada.nextInt();
                    indice=catalogoTienda.buscarCancionPorClaveSecuencial(clave);
                    if(indice !=-1){
                        catalogoTienda.mostrarCancion(indice);
                    }else{
                        System.out.println("No encontró");
                    }
                    break;
                case 4:
                    System.out.println("Buscar una canción por clave(B.Binaria)");
                    //Primero se ordenan los elementos y luego se hace la búsqueda
                    catalogoTienda.ordenarClaves();
                    System.out.print("Dame la clave de la canción a buscar: ");
                    clave=entrada.nextInt();
                    indice=catalogoTienda.buscarCancionPorClaveBinaria(clave);
                    if(indice!=-1){
                        catalogoTienda.mostrarCancion(indice);
                    }else{
                        System.out.println("No se encontró");
                    }
                    break;
                case 5:
                    System.out.println("Buscar una Canción por nombre (B.Secuencial)");
                    System.out.print("Dame el nombre de la canción a buscar: ");
                    //Deben coincidir los nombre en mayúsculas y minúsculas
                    nombreCancion=entrada.nextLine();
                    indice=catalogoTienda.buscarCancionPorNombre(nombreCancion);
                    if(indice!=-1){
                        catalogoTienda.mostrarCancion(indice);
                    } else{
                        System.out.println("No se encontró");
                    }
                    break;
                case 6:
                    System.out.print("Dame ls clave de la canción a borrar: ");
                    clave=entrada.nextInt();
                    indice=catalogoTienda.buscarCancionPorClaveSecuencial(clave);
                    if(indice==-1){
                        System.out.println("La clave no existe. Repite la operación");
                    } else{
                        catalogoTienda.borrarCancion(clave);
                        System.out.println("La canción se ha eliminado");
                        catalogoTienda.verCatalogo();
                    }
                    break;
                case 7:
                    cambiarNombreCancion();
                    break;
                case 8:
                    System.out.println("Mostrar el total");
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No válido");
                    break;
            }//fin de switch
        }while (opcion!=9);
    }
    private static void menu(){
        imprimirLinea();
        System.out.println("Operaciones sobre canciones");
        System.out.println("1.- Añadir una canción a la lista");
        System.out.println("2.- Mostrar lista de canciones");
        System.out.println("3.- Buscar una canción por clave (B. Secuencial)");
        System.out.println("4.- Buscar una canción por clave (B. Binaria)");
        System.out.println("5.- Buscar una canción por nombre (B. Secuencial)");
        System.out.println("6.- Borrar una canción");
        System.out.println("7.- Cambiar el nombre de una canción");
        System.out.println("8.- Mostrar el total");
        System.out.println("9.- Salir");
        System.out.print("Elige tu opción: ");
    }//fin menu
    public static void pedirDatosCancion(){
        int clavex;
        String nombreCancionx, nombreCantantex, generox, albumx;
        double preciox;
        System.out.print("Dame la clave de la canción: ");
        clavex=entrada.nextInt();
        entrada.nextLine();
        System.out.print("Dame el nombre de la canción: ");
        nombreCancionx= entrada.nextLine();
        System.out.print("Dame el nombre de los artistas: ");
        nombreCantantex= entrada.nextLine();
        System.out.print("Dame el género: ");
        generox=entrada.nextLine();
        System.out.print("Dame el nombre del álbum: ");
        albumx=entrada.nextLine();
        System.out.print("Dame el precio de la canción: ");
        preciox= entrada.nextDouble();

        Cancion cancionx=new Cancion(clavex,nombreCancionx,nombreCantantex,generox,albumx,preciox);
        catalogoTienda.insertarCancion(cancionx);
    }
    public static void imprimirLinea(){
        System.out.println("----------------------------------------------------"+
                "------------------------------------");
    }
    private static void cambiarNombreCancion(){
        int clave, indice;
        System.out.println("Cambiar nombre");
        System.out.print("Dame la clave de la canción: ");
        clave= entrada.nextInt();
        indice=catalogoTienda.buscarCancionPorClaveSecuencial(clave);
        if(indice==-1){
            System.out.println("La clave no existe. Repite la operación");
            System.out.println();
        }else{
            entrada.nextLine();
            System.out.println("Datos de la canción");
            catalogoTienda.mostrarCancion(indice);
            System.out.println();
            System.out.print("Dame el nuevo nombre de la canción: ");
            String nombreCancion= entrada.nextLine();
            catalogoTienda.cambiarNombreCancion(indice,nombreCancion);
            System.out.println("Cambios guardados");
            System.out.println();
        }
    }
}