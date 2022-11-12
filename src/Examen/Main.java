package Examen;
import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        ArrayList<Estudiante>listaEstudiantes = new ArrayList<>();
        int numeroLista= 1;
        int valor= numeroLista % 10;
        listaEstudiantes.add(new Estudiante(1,"Luis","Perez",5.7,valor));
        listaEstudiantes.add(new Estudiante(2,"Jose","Garcia",9.7,8.0));
        listaEstudiantes.add(new Estudiante(3, "Maria","Sanchez",4.0,5.0));
        listaEstudiantes.add(new Estudiante(4, "Carolina","Gonzales", 6.0,10.0));
        listaEstudiantes.add(new Estudiante(5,"Rosario","Vazquez",valor, 0.0));

        int numeroM = 0;
        for(Estudiante aux: listaEstudiantes){
            double numeroP=(aux.getCalificacion1()+ aux.getCalificacion2())/2.0;
            if(numeroP >= 6.5 && numeroP <= 8.5){
                numeroM++;
            }
        }
        System.out.println(numeroM);
        System.out.println("______________________");
        for(Estudiante aux : listaEstudiantes){
            if(aux.getCalificacion1()>=6 || aux.getCalificacion2()>=6){
                System.out.println(aux.getNombre());
            }
        }
    }
}
