package U4_Archivos;
import java.util.ArrayList;
import java.util.Iterator;
public class Biblioteca {
    private ArrayList<Libro> listaLibros;

    public Biblioteca() {
        listaLibros = new ArrayList<>();
    }

    public void setListaLibros(ArrayList<Libro> lista) {
        this.listaLibros = lista;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void insertarLibro(Libro librox) {
        listaLibros.add(librox);
    }

    public void mostrarLibro(int indice) {
        Libro aux = listaLibros.get(indice);
        System.out.printf("%-8s|%-30s|%-8s\n",
                "Clave", "Título", "Autor", "Editorial", "Precio", "Cantidad");
        System.out.println("--------|-----------------------------|" +
                "-----------------------------------------|---------");
        System.out.printf("%-8d|%-30s|%-30s|$%-6.2f\n",
                aux.getClave(), aux.getTitulo(), aux.getAutor(),aux.getEditorial(), aux.getPrecio(), aux.getCantidad());
    }

    public int buscarLibroPorClaveSecuencial(int claveABuscar) {// Búsqueda secuencial
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getClave() == claveABuscar) {
                return i;
            }
        }
        return -1;
    }
    public void borrarLibro(int clave){
        Iterator<Libro>libroIterator=listaLibros.iterator();
        while(libroIterator.hasNext()){
            Libro librox=libroIterator.next();
            if(clave==librox.getClave()){
                libroIterator.remove();
            }
        }
    } //fin de borrarLibro
    public void cambiarTituloLibro(int indice, String nuevoNombre){
        Libro libroAux=listaLibros.get(indice);
        libroAux.setTitulo(nuevoNombre);
    }// fin de cambiarTitulo del Libro
    public int buscarLibroPorClave(int claveABuscar){ //Búsqueda secuencial
        for (int i=0; i<listaLibros.size();i++){
            if(listaLibros.get(i).getTitulo().equals(claveABuscar)){
                return i;
            }
        }
        return -1;
    }
    public int buscarCancionPorClaveBinaria(int claveABuscar){ //Búsqueda binaria
        int bajo=0;
        int alto=listaLibros.size()-1;
        int buscando;
        while(bajo<=alto){
            int mitad=(bajo+alto)/2;
            buscando=listaLibros.get(mitad).getClave();
            if(buscando==claveABuscar){
                return mitad;
            } else if(buscando> claveABuscar){
                alto=mitad-1;
            }else if(buscando<claveABuscar){
                bajo=mitad+1;
            }
        }
        return -1;
    }
    public void ordenarPrecios(){ //Ordena por método de burbuja
        Libro aux;
        int N=listaLibros.size();
        for(int i=0;i<=N-2;i++){
            for(int j=0;j<=N-2;j++){
                if(listaLibros.get(j).getClave()>listaLibros.get(j+1).getClave()){
                    aux=listaLibros.get(j);
                    listaLibros.set(j, listaLibros.get(j+1));
                    listaLibros.set(j+1,aux);
                }
            }
        }
    }
    public void verCatalogoLibro(){
        System.out.printf("%-8s|%-30s|%-30s|%-8s\n",
                "Clave,","Título", "Autor,","Editorial","Precio", "Cantidad");
        System.out.println("--------|------------------------------|" +
                "------------------------------|---------");
        for(Libro aux : listaLibros){
            //aqui si lleva el % segun el tipo
            System.out.printf("%-8d|%-30s|-30s|$%-6.0f\n",
                    aux.getClave(),aux.getTitulo(),
                    aux.getAutor(),aux.getPrecio());
        }
    }

}
