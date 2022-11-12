//Valeria Danae Aguayo Miranda.

package U4_Archivos;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class ArchivoCadenas {
    protected Scanner entradaArchivo;
    protected PrintWriter salidaArchivo;
    protected String nombreArchivo = "";
    protected ArrayList<String> listaRegistros;
    //Constructor
    public ArchivoCadenas(String nombreArchivosEntrada) {
        this.nombreArchivo = nombreArchivosEntrada;
//Asegurarse de crear el archivo si no exite
        crearArchivo();
        listaRegistros = new ArrayList<>();
    }



    protected void escribir() {
        for (String registro : listaRegistros) {
            salidaArchivo.format("%s\n", registro);
        }
    }
    protected void leer() {
        while (entradaArchivo.hasNext()) {
            String linea = entradaArchivo.nextLine();
            listaRegistros.add(linea);
        }// end while
    }
    public void EscribirEnArchivo(ArrayList<String> lista) {
        listaRegistros = lista;
//Abrir el archivo
        try{
            salidaArchivo = new PrintWriter(nombreArchivo);
        } catch (FileNotFoundException fileEx) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
//Escribir en el archivo
        try {
            escribir();
            salidaArchivo.flush();
        }catch (Exception ex){
            ex.printStackTrace();
            System.exit(1);
        }
//cierra el archivo
        if (salidaArchivo != null) {
            salidaArchivo.close();
        }
    }//Fin de escribir archivo
    //permite leer el archivo
    public ArrayList<String> LeerArchivo() {
//abre el archivo
        try {
            File archivo = new File(nombreArchivo);
            entradaArchivo = new Scanner(archivo);
        }catch (FileNotFoundException fileEx) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
//lee el archivo
        try {
            leer();
        }catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
//cierra el archivo
        if (entradaArchivo != null) {
            entradaArchivo.close();
        }
        return listaRegistros;
    }//fin de leerArchivo
    //crear el archivo si no exite
    private void crearArchivo() {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                PrintWriter nuevoArchivo = new PrintWriter(nombreArchivo);
                nuevoArchivo.close();
            }catch (FileNotFoundException fileEx) {
                System.err.println("Error al crear el archivo.");
                System.exit(1);
            }
        }
    }
} //fin de class Archivo
