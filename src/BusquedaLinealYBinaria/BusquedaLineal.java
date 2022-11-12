package BusquedaLinealYBinaria;

public class BusquedaLineal {
    //"VALERIA DANAE AGUAYO MIRANDA"
    private String[] Arreglo;

    public BusquedaLineal(String[] Palabras) {
        Arreglo = Palabras;
    }
    public int busqueda(String valorBuscado) {
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo[i].equals(valorBuscado)) {
                return i;
            }
        }
        return -1;
    }
}
