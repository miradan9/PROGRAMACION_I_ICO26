package U4_Archivos;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivoDemo4Amigos {
    public static void main(String []args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        //Obtener nombre del archivo
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();
        //Abrir archivo
        File archivo = new File(nombreArchivo);
        Scanner entradaArchivo = new Scanner(archivo);
        //Lee cada linea al final
        while (entradaArchivo.hasNext()){
            //lee el siguiente nombre
            String nombreAmigo = entradaArchivo.nextLine();
            //Despliega el ultimo nombre leído
            System.out.println(nombreAmigo);
        }
        //cerrar el archivo
        entradaArchivo.close();
    }
}
