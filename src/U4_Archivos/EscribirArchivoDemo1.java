package U4_Archivos;
import java.io.*;
public class EscribirArchivoDemo1 {
    public static void main(String[] args) throws IOException{
        //Abrir el archivo
        PrintWriter salidaArchivo=new PrintWriter("salida.txt");
        //Escribir sobre el archivo
        salidaArchivo.println("Hola, mundo");
        //  Cerrar el archivo
        salidaArchivo.checkError();
        System.out.println("Datos grabados en el archivo");
    }
}
