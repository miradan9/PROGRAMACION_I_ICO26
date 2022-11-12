package U4_Archivos;
import java.util.ArrayList;
import java.util.Iterator;
public class Catalogo {
    private ArrayList<Cancion> listaCanciones;

    public Catalogo() {
        listaCanciones = new ArrayList<>();
    }

    public void setListaCanciones(ArrayList<Cancion> lista) {
        this.listaCanciones = lista;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void insertarCancion(Cancion cancionx) {
        listaCanciones.add(cancionx);
    }

    public void mostrarCancion(int indice) {
        Cancion aux = listaCanciones.get(indice);
        System.out.printf("%-8s|%-30s|%-8s\n",
                "Clave", "Nombre Canción", "Artista", "Precio");
        System.out.println("--------|-----------------------------|" +
                "-----------------------------------------|---------");
        System.out.printf("%-8d|%-30s|%-30s|$%-6.2f\n",
                aux.getClave(), aux.getNombreCancion(), aux.getNombreCantante(), aux.getPrecio());
    }

    public int buscarCancionPorClaveSecuencial(int claveABuscar) {// Búsqueda secuencial
        for (int i = 0; i < listaCanciones.size(); i++) {
            if (listaCanciones.get(i).getClave() == claveABuscar) {
                return i;
            }
        }
        return -1;
    }
    public void borrarCancion(int clave){
        Iterator<Cancion>cancionIterator=listaCanciones.iterator();
        while(cancionIterator.hasNext()){
            Cancion cancionx=cancionIterator.next();
            if(clave==cancionx.getClave()){
                cancionIterator.remove();
            }
        }
    } //fin de borrarCancion
    public void cambiarNombreCancion(int indice, String nuevoNombre){
        Cancion cancionAux=listaCanciones.get(indice);
        cancionAux.setNombreCancion(nuevoNombre);
    }// fin de cambiarNombre
    public int buscarCancionPorNombre(String nombreABuscar){ //Búsqueda secuencial
        for (int i=0; i<listaCanciones.size();i++){
            if(listaCanciones.get(i).getNombreCancion().equals(nombreABuscar)){
                return i;
            }
        }
        return -1;
    }
    public int buscarCancionPorClaveBinaria(int claveABuscar){ //Búsqueda binaria
        int bajo=0;
        int alto=listaCanciones.size()-1;
        int buscando;
        while(bajo<=alto){
            int mitad=(bajo+alto)/2;
            buscando=listaCanciones.get(mitad).getClave();
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
    public void ordenarClaves(){ //Ordena por método de burbuja
        Cancion aux;
        int N=listaCanciones.size();
        for(int i=0;i<=N-2;i++){
            for(int j=0;j<=N-2;j++){
                if(listaCanciones.get(j).getClave()>listaCanciones.get(j+1).getClave()){
                    aux=listaCanciones.get(j);
                    listaCanciones.set(j, listaCanciones.get(j+1));
                    listaCanciones.set(j+1,aux);
                }
            }
        }
    }
    public void verCatalogo(){
        System.out.printf("%-8s|%-30s|%-30s|%-8s\n",
                "Clave,","Nombre Canción", "Artista,", "Precio");
        System.out.println("--------|------------------------------|" +
                "------------------------------|---------");
    for(Cancion aux : listaCanciones){
        //aqui si lleva el % segun el tipo
        System.out.printf("%-8d|%-30s|-30s|$%-6.0f\n",
                aux.getClave(),aux.getNombreCancion(),
                aux.getNombreCantante(),aux.getPrecio());
        }
    }
}

