package Busqueda;

public class BusquedaSecuencial1 {
    String[] listaPalabras;

    public BusquedaSecuencial1(String[]arreglo) {
        this.listaPalabras = arreglo;
    }
    public int buscar(String valorABuscar) {
        for (int i = 0; i < listaPalabras.length; i++) {
            if (listaPalabras[i]==valorABuscar) {
                return i;
            }
        }
        return -1;
    }
}