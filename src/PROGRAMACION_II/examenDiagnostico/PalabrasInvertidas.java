package PROGRAMACION_II.examenDiagnostico;

public class PalabrasInvertidas {
    public static void main(String[] args) {

        System.out.println("Cadena inicial: ");
        String cadena[]= {"Casa", "Perro", "Gato", "Computadora", "Libro"};

        for (int i=0;i<5;i++){
            System.out.print(" -"+cadena[i]+" ");
        }
        System.out.println();
        System.out.println("Cadena inversa: ");

        int j=4;
        while (j>0){
            System.out.print(" -"+cadena[j]+" ");
            j--;

        }

    }
}

