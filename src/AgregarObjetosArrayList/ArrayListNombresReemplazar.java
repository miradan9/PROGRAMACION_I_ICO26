package AgregarObjetosArrayList;
import java.util.ArrayList;

public class ArrayListNombresReemplazar {
    public static void main(String[] args) {
        // Crear un arrayList< para contener algunos nombres.
        ArrayList<String> nameList = new ArrayList<String>();
        //Agregar algunos nombres al ArrayList.
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");
        //Mostrar los elemetos en nameList y sus indeces
        for (int index = 0; index < nameList.size(); index++){
            System.out.println("index: " + index + "Name: " + nameList.get(index));
        }
        //Ahora reemplazar el elemento en el índice 1
        nameList.set(1, "Becky");

        System.out.println("Catherine fue reemplaza con Becky. " + "Asi quedaron los elemntos. ");
        //Mostrar los elementos en nameList y sus índices.
        for(int index=0;  index<nameList.size(); index++){
            System.out.println("Index: " + "Name: " + nameList.get(index));

        }
    }
}
