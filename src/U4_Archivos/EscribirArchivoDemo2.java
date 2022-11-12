package U4_Archivos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class EscribirArchivoDemo2 {
    public static void main(String[] args) throws IOException {
        String nombreArchivo; //Nombre del archivo
        String nombreAmigo; //Nombre del amigo
        int numAmigos;  //Número de amigos

        Scanner entrada = new Scanner(System.in);

        //Obtener el numero de amigos.
        System.out.print("¿Cuántos aamigos tienes?");
        numAmigos=entrada.nextInt();

        //Consume the remaining newline character.
        entrada.nextLine();

        //Obtener el nombre del archivo
        System.out.print("Introduce el nombre del archivo: ");
        nombreArchivo= entrada.nextLine();
        //Abrir el aarchivo
        PrintWriter salidaArchivo=new PrintWriter(nombreArchivo);

        //Obtener los datos y escribirlos en el archivo
        for(int i=1; i<=numAmigos; i++){
            //Obtener el nombre de un amigo
            System.out.print("Introduce el nombre del amigo "+ "número "+i+": ");
            nombreAmigo=entrada.nextLine();
            //Escribe el nombre del archivo
            salidaArchivo.println(nombreAmigo);
        }
        //Cerrar el archivo
        salidaArchivo.close();
        System.out.println("Datos grabados en el archivo. ");
    }
}
