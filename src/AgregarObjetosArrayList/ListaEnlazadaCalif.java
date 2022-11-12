package AgregarObjetosArrayList;

public class ListaEnlazadaCalif {

    private NodoLista P;
    private class NodoLista {
        private String puntaje;
        private NodoLista sig; //Referencia al siguiente Nodo en la lista
        private NodoC head;

        public NodoLista(String puntajeX) {
            this.puntaje = puntajeX;
            this.sig = null;

        }
    }

    public void mostrarLista() {
        NodoLista nodoAuxiliar = P;

        System.out.print("P--> ");
        while (nodoAuxiliar != null) {
            System.out.print(nodoAuxiliar.puntaje + "--> ");
            nodoAuxiliar = nodoAuxiliar.sig;
        }
        System.out.println("null");
    }

    public void insertarInicio(String valor) {
        NodoLista nodoNuevo = new NodoLista(valor);
        nodoNuevo.sig = P;
        P = nodoNuevo;
    }
        public void suma () {
                NodoLista nodoTemp =P;
                NodoC temp=P.head;
            double total = 0;
            while (temp != null) {
                System.out.println(temp.calf);
                total = total + temp.calf;
                temp = temp.siguiente;
            }
            System.out.println("La suma es: " + total);
                double promedio = total/10;
                System.out.println("El promedio es: " + promedio);
                }
}