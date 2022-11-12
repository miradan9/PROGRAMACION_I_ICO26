package AgregarObjetosArrayList;
import java.util.ArrayList;

public class ArrayListCalificaciones {
    public static void main(String[] args) {
        ArrayList<Double> listacalificaciones = new ArrayList<>();
        listacalificaciones.add(10.0);
        listacalificaciones.add(9.5);
        listacalificaciones.add(6.2);
        listacalificaciones.add(8.1);
        listacalificaciones.add(7.0);
        listacalificaciones.add(5.5);
        //imprimir las calificaciones
        System.out.println("Lista de calificaciones: ");
        for (Double calificacion : listacalificaciones){
            System.out.println(calificacion + "\t\t");
        }
        System.out.println("-------------");
        //Imprimir las calificaciones
        System.out.println("Lista de calificaciones despues de romever el elemento [1]: ");
        for (Double calificacion : listacalificaciones) {
            System.out.println(calificacion + "\t\t");
        }
        System.out.println();
    }
}

