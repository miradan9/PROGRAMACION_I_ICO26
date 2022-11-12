package U4_Archivos;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class EscribirArchivoDemo3 {
    public static void main(String[] args) throws IOException {
        String nombreArchivo; //Nombre del archivo
        String nombreAmigo; //Nombre del amigo
        int numAmigos;  //Número de amigos

        Scanner entrada=new Scanner(System.in);

        //Obtener el numero de amigos
        System.out.print("¿Cuántos amigos tienes?");
        numAmigos=entrada.nextInt();
        //Consume the remaining newline character
        entrada.nextLine();
        //Obtener el nombre del archivo
        System.out.print("Introduce el nombre del archivo: ");
        nombreArchivo=entrada.nextLine();
        //Asaegursrse que el asrchivo no exista.
        File archivo=new File(nombreArchivo);
        if(archivo.exists()){
            System.out.println("El archivo "+ nombreArchivo+" ya existe.");
            System.exit(0);
        }
        //Abrir el archivo
        PrintWriter salidaArchivo= new PrintWriter(nombreArchivo);
        //Obetener los datos y escribirlos en el archivo.
        for(int i=1;i<=numAmigos; i++){
            //Obtener el nombre de un amigo
            System.out.print("Introduce el nombre del amigo "+ "número "+i+": ");
            nombreAmigo=entrada.nextLine();
            //Escribe el nombre al archivo
            salidaArchivo.println(nombreAmigo);
        }
        //Cerrar el archivp
        salidaArchivo.close();
        System.out.println("Datos grabados ejn el archivo.");
    }
}
