package U4_Archivos;
import java.io.IOException;
import java.io.PrintWriter;
public class EscribirArchivos4Nombres {
    public static void main(String[] args) throws IOException {
        //Abrir el archivo
        PrintWriter salidaArchivo=new PrintWriter("nombres4.txt");
        salidaArchivo.println("Esteban");
        salidaArchivo.println("Rocio");
        salidaArchivo.println("Rouss");
        salidaArchivo.println("Luis");
        //Cerrar el archivo
        salidaArchivo.close();
        System.out.println("Datos grabados en el archivo");
    }
}
