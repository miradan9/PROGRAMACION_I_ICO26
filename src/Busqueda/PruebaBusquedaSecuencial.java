package Busqueda;

public class PruebaBusquedaSecuencial {
    public static void main(String[] args) {
        System.out.println("Valeria Danae Aguayo Miranda");
        String[] listaPalabras=Vocabulario.listaDesordenada;
        String palabra="mexican";
        BusquedaSecuencial1 bs=new BusquedaSecuencial1(listaPalabras);
        int indice=bs.buscar(palabra);
        if(indice==-1){
            System.out.println("No se encontró la palabra: "+palabra);
        } else{
            System.out.println("La palabra "+palabra+" se ha encontrado en la posición: "+ indice);
        }
    }
}
