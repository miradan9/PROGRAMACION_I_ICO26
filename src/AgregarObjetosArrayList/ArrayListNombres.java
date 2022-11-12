package AgregarObjetosArrayList;
import java.util.ArrayList;

public class ArrayListNombres {
    public static void main(String[] args){
        ArrayList<String> listaNombres = new ArrayList<String>();
        listaNombres.add("James");
        listaNombres.add("Catherne");
        listaNombres.add("Bill");
        System.out.println("El ArrayList tiene" + listaNombres.size() + "objetos almacenados en él. ");
        System.out.println("----------------------");
        System.out.println("Elemento en la posicion 1: ");
        System.out.println(listaNombres.get(1));
        // Desplegar los elementos en listaNombres
        System.out.println("--------------");
        System.out.println("Elementos almacenados en lista: ");
        for (int index = 0; index < listaNombres.size(); index++){
            System.out.println(listaNombres.get(index));
        }
    }

}
