package AgregarObjetosArrayList;

public class Calificaciones {
    public static void main(String[]args){
        NodoC primeraCalf= new NodoC((double) 3.2);
        NodoC segundaCalf= new NodoC((double) 10.0);
        NodoC terceraCalf= new NodoC((double) 6.7);
        NodoC cuartaCalf= new NodoC((double) 5.1);
        NodoC quintaCalf= new NodoC((double) 4.6);
        NodoC sextaCalf= new NodoC((double) 7.8);
        NodoC septimaCalf= new NodoC((double) 8.2);
        NodoC octabaCalf= new NodoC((double) 7.5);
        NodoC novenaCalf= new NodoC((double) 5.8);
        NodoC decimaCalf= new NodoC((double) 8.7);

        //enlazar
        primeraCalf.siguiente=segundaCalf;
        segundaCalf.siguiente=terceraCalf;
        terceraCalf.siguiente=cuartaCalf;
        cuartaCalf.siguiente=quintaCalf;
        quintaCalf.siguiente=sextaCalf;
        sextaCalf.siguiente=septimaCalf;
        septimaCalf.siguiente=octabaCalf;
        octabaCalf.siguiente=novenaCalf;
        novenaCalf.siguiente=decimaCalf;

        //crear una variable auxiliar
        NodoC aux=primeraCalf;
        while (aux != null){
            System.out.print(aux.calf+", ");
            aux= aux.siguiente;
        }
    }
}
