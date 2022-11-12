package AgregarObjetosArrayList;

public class ListaEnlazadaCalificaciones {
    public static void main(String[] args) {

        System.out.println("Las calificaciones son: ");
        Nodo PrimeraCalificacion= new Nodo(3.2);
        Nodo SegundaCalificacion= new Nodo(10.0);
        Nodo TerceraCalificacion= new Nodo(6.7);
        Nodo CuartaCalificacion = new Nodo(5.1);
        Nodo QuintaCalificacion = new Nodo(4.6);
        Nodo SextaCalificacion= new Nodo(7.8);
        Nodo SeptimaCalificacion= new Nodo(8.2);
        Nodo OctavaCalificacion= new Nodo(7.5);
        Nodo NovenaCalificacion = new Nodo(5.8);
        Nodo DecimaCalificacion= new Nodo(8.7);

        PrimeraCalificacion.siguiente=SegundaCalificacion;
        SegundaCalificacion.siguiente=TerceraCalificacion;
        TerceraCalificacion.siguiente=CuartaCalificacion;
        CuartaCalificacion.siguiente=QuintaCalificacion;
        QuintaCalificacion.siguiente=SextaCalificacion;
        SextaCalificacion.siguiente=SeptimaCalificacion;
        SeptimaCalificacion.siguiente=OctavaCalificacion;
        OctavaCalificacion.siguiente=NovenaCalificacion;
        NovenaCalificacion.siguiente=DecimaCalificacion;

        Nodo aux= PrimeraCalificacion;
        System.out.print("head --> ");
        while(aux != null){
            System.out.print(aux.dato+"--->");
            aux=aux.siguiente;
        }
        System.out.println("null");
        System.out.println();
        System.out.println("La suma de las calificaciones es: ");
        double suma =PrimeraCalificacion.dato + SegundaCalificacion.dato + TerceraCalificacion.dato
                + CuartaCalificacion.dato + QuintaCalificacion.dato +
                SextaCalificacion.dato + SeptimaCalificacion.dato
                + OctavaCalificacion.dato + NovenaCalificacion.dato + DecimaCalificacion.dato;
        System.out.println(suma);
        System.out.println("El promedio es de: ");
        double promedio = suma/10;
        System.out.println(promedio);
    }
}
