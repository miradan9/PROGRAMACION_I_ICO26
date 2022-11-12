package U3_Estructura_de_datos.ListaEnlazadosListaBasica;

public class Lista {
    public static void main(String[] args) {
        Nodo primero=new Nodo(10);
        Nodo segundo=new Nodo(1);
        Nodo tercero=new Nodo(8);
        Nodo cuarto=new Nodo(11);

        //Enlazar
        primero.siguiente=segundo;
        segundo.siguiente=tercero;
        tercero.siguiente=cuarto;

        //Crear una variable auxiliar
        Nodo aux=primero;
        System.out.print("head-->");
        while(aux !=null){
            System.out.print(aux.dato+ "-->");
            aux=aux.siguiente;
        }
        System.out.println("null");
    }
}
