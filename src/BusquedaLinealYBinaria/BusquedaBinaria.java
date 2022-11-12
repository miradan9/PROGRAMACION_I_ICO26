package BusquedaLinealYBinaria;

public class BusquedaBinaria {

    //"VALERIA DANAE AGUAYO MIRANDA"
    private final String[] Arreglo;

    public BusquedaBinaria(String[] ArregloPalabras) {
        Arreglo = ArregloPalabras;
    }
    public int buscar(String ValorBuscado) {
        int bajo = 0;
        int alto = Arreglo.length - 1;
        while (bajo <= alto) {
            int mitad = (bajo + alto) / 2;
            String elementoEnBusqueda = Arreglo[mitad];
            int comparacionDeCadenas = ValorBuscado.compareTo(elementoEnBusqueda);
            if (comparacionDeCadenas == 0) {
                return mitad;
            } else if (comparacionDeCadenas < 0) {
                alto = mitad - 1;
            } else {
                bajo = mitad + 1;
            }
        }
        return -1;
    }
}

