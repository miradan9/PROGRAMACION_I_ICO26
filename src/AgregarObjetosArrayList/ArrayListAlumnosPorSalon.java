package AgregarObjetosArrayList;
import java.util.ArrayList;

public class ArrayListAlumnosPorSalon {
    public static void main(String[] args) {
        ArrayList<Integer>listaCantidadAlumnos=new ArrayList<>();
        listaCantidadAlumnos.add(34); //primer semestre
        listaCantidadAlumnos.add(34); //quinto semestre
        listaCantidadAlumnos.add(34); //septimo semestre
        listaCantidadAlumnos.add(34); //noveno semestre
    //Imprimir lista de alumnos por grupo
        for(int index=0; index<listaCantidadAlumnos.size(); index++){
            System.out.println("Indice: "+ index+" Cantidad: "+ listaCantidadAlumnos.get(index));
        }
        System.out.println("----------------------------------");
        //Ahora insert<mos un elemento en el indice 1, donde va el tercer semestre
        listaCantidadAlumnos.add(1,45);

        //Volvemos a imprimir la lista
        for(int index=0; index<listaCantidadAlumnos.size(); index++){
            System.out.println("Indice: "+index+" Cantidad: "+ listaCantidadAlumnos.get(index));
        }
    }
}

