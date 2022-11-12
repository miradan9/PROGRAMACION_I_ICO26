package AgregarObjetosArrayList;
import java.util.ArrayList;

public class ArrayListAsignaturas {
    public static void main(String[] args){
        ArrayList<String> listaAsignaturas = new ArrayList<String>();
        listaAsignaturas.add("Calculo");
        listaAsignaturas.add("Programacion II");
        listaAsignaturas.add("Algebra");
        listaAsignaturas.add("Elecronica");
        //Usar un for mejorado para imprimir la lista
        System.out.println("Lista de asignaturas: ");
        for (String asignatura : listaAsignaturas){
            System.out.println(asignatura);
        }
        System.out.println("---------------");
//Usar el método toString de ArrayList
        System.out.println(listaAsignaturas.toString());
    }

}
