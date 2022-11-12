package Computadora;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo {
    private ArrayList<Computadora> listaComputadora;

    public Catalogo() {
        //Modificacion pendiente sobre lectura de fichero de texto
        listaComputadora = new ArrayList<>();
    }


    public void setListaComputadora(ArrayList<Computadora> lista) {
        this.listaComputadora = lista;
    }

    public ArrayList<Computadora> getlistaComputadora() {
        return listaComputadora;
    }

    public boolean validarDisponiblidad(int clavex){
        for (int i = 0; i < listaComputadora.size(); i++) {
            if (listaComputadora.get(i).getClave() == clavex && listaComputadora.get(i).getDisponibilidad()==true) {
                return true;
            }
        }
        return false;
    }
    public int validarExistencia(int clavex){
        for (int i = 0; i < listaComputadora.size(); i++) {
            if (listaComputadora.get(i).getClave() == clavex) {
                return i;
            }
        }
        return -1;
    }
    public void insertarComputadora(Computadora computadorax) {
        listaComputadora.add(computadorax);
    }

    public void mostrarComputadora(int indice) {
        Computadora aux = listaComputadora.get(indice);
        /*System.out.printf("%-8s|%-30s|%-30s|%-30s|%-8s|%-8s\n",
                "Clave", "Titulo", "Autor", "Editorial", "Precio", "Cantidad");
         */
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|%-10s|%-10s\n",
                "Clave", "Marca", "Modelo", "Cantidad", "Nucleos", "Precio", "Disponibilidad");
        System.out.println("--------|------------------------------|--------------------|----------|--------------------|----------|--------------");
        //System.out.println("--------|------------------------------|------------------------------|------------------------------|--------|---------");
        /*System.out.printf("%-8s|%-30s|%-30s|%-30s|$%7.2s\n", aux.getClave(), aux.getMarca(), aux.getModelo(),
                aux.getNucleos(), aux.getPrecio());
         */
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|$%9.2f|%-9s\n", aux.getClave(), aux.getMarca(), aux.getModelo(), aux.getCantidad(),
                aux.getNucleos(), aux.getPrecio(), aux.getDisponibilidad());
    }


    public int buscarComputadoraPorClaveSecuencial(int claveABuscar) {
        for (int i = 0; i < listaComputadora.size(); i++) {
            if (listaComputadora.get(i).getClave() == claveABuscar) {
                return i;
            }
        }
        return -1;
    }

    public void borrarComputadora(int clave) {
        Iterator<Computadora> compIterator = listaComputadora.iterator();
        while (compIterator.hasNext()) {
            Computadora computadorax = compIterator.next();
            if (clave == computadorax.getClave()) {
                compIterator.remove();
            }
        }
    }

    public void cambiarModelo(int indice, String nuevoModelo) {
        Computadora computadoraAux = listaComputadora.get(indice);
        computadoraAux.setModelo(nuevoModelo);
    }


    public int buscarComputadoraPorClaveBinaria(int claveABuscar) {
        int bajo = 0;
        int alto = listaComputadora.size() - 1;
        int buscando;
        while (bajo <= alto) {
            int mitad = (bajo + alto) / 2;
            buscando = listaComputadora.get(mitad).getClave();
            if (buscando == claveABuscar) {
                return mitad;
            } else if (buscando > claveABuscar) {
                alto = mitad - 1;
            } else if (buscando < claveABuscar) {
                bajo = mitad + 1;
            }
        }
        return -1;
    }

    public void ordenarClaves() {
// Ordena por método de burbuja
        Computadora aux;
        int N = listaComputadora.size();
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (listaComputadora.get(j).getClave() > listaComputadora.get(j + 1).getClave()) {
                    aux = listaComputadora.get(j);
                    listaComputadora.set(j, listaComputadora.get(j + 1));
                    listaComputadora.set(j + 1, aux);
                }
            }
        }
    }

    public void MostrarPrecioMayor() {
        Computadora aux;
        int N = listaComputadora.size();
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (listaComputadora.get(j).getClave() > listaComputadora.get(j + 1).getClave()) {
                    aux = listaComputadora.get(j);
                    listaComputadora.set(j, listaComputadora.get(j + 1));
                    listaComputadora.set(j + 1, aux);
                }
            }
        }
        Computadora aux2 = listaComputadora.get(listaComputadora.size()-1);
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|%-10s|%-10s\n",
                "Clave", "Marca", "Modelo", "Cantidad", "Nucleos", "Precio", "Disponibilidad");
        System.out.println("--------|------------------------------|--------------------|----------|--------------------|----------|--------------");
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|$%9.2f|%-9s\n", aux2.getClave(), aux2.getMarca(), aux2.getModelo(), aux2.getCantidad(),
                aux2.getNucleos(), aux2.getPrecio(), aux2.getDisponibilidad());




    }
    public void ordenarPorNucleos() {
        Computadora aux;
        int N = listaComputadora.size();
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (listaComputadora.get(j).getNucleos() > listaComputadora.get(j + 1).getNucleos()) {
                    aux = listaComputadora.get(j);
                    listaComputadora.set(j, listaComputadora.get(j + 1));
                    listaComputadora.set(j + 1, aux);
                }
            }
        }
    }
    public void ordenarPrecios() {
        Computadora aux;
        int N = listaComputadora.size();
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (listaComputadora.get(j).getPrecio() > listaComputadora.get(j + 1).getPrecio()) {
                    aux = listaComputadora.get(j);
                    listaComputadora.set(j, listaComputadora.get(j + 1));
                    listaComputadora.set(j + 1, aux);
                }
            }
        }
    }


    public void ordenarNucleos() {
        Computadora aux;
        int N = listaComputadora.size();
        for (int i = 0; i <= N - 2; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (listaComputadora.get(j).getNucleos() > listaComputadora.get(j + 1).getNucleos()) {
                    aux = listaComputadora.get(j);
                    listaComputadora.set(j, listaComputadora.get(j + 1));
                    listaComputadora.set(j + 1, aux);
                }
            }
        }
    }

    public void disponibildad() {

    }

    public void verCatalogo() {
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|%-10s|%-10s\n",
                "Clave", "Marca", "Modelo", "Cantidad", "Nucleos","Precio", "Disponibilidad");

        System.out.println("--------|------------------------------|--------------------|----------|--------------------|----------|--------------");
        for (Computadora aux : listaComputadora) {

            System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|$%9.2f|%-9s\n", aux.getClave(), aux.getMarca(), aux.getModelo(), aux.getCantidad(),
                    aux.getNucleos(), aux.getPrecio(), aux.getDisponibilidad());
        }
    }

    public void verCatalogoDisponible() {
        System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|%-10s|%-10s\n",
                "Clave", "Marca", "Modelo", "Cantidad", "Nucleos","Precio", "Disponibilidad");

        System.out.println("--------|------------------------------|--------------------|----------|--------------------|----------|--------------");
        for (Computadora aux : listaComputadora) {
            if (aux.getDisponibilidad()) {
                System.out.printf("%-8s|%-30s|%-20s|%-10s|%-20s|$%9.2f|%-9s\n", aux.getClave(), aux.getMarca(), aux.getModelo(), aux.getCantidad(),
                        aux.getNucleos(), aux.getPrecio(), aux.getDisponibilidad());
            }
        }
    }


    public void imprimirCatalogo() {

        String nombreCatalogo = "CatalogoImpreso.txt";

        try {
            PrintWriter escritor = new PrintWriter(nombreCatalogo);

            escritor.printf("%-8s|%-30s|%-30s|%-30s|%-8s|%-8s\n",
                    "Clave", "Titulo", "Autor", "Editorial", "Precio", "Cantidad");
            for (Computadora aux : listaComputadora) {
                escritor.printf("%-8s|%-30s|%-30s|%-30s|$%7.2f|%-9s\n", aux.getClave(), aux.getMarca(), aux.getModelo(),
                        aux.getNucleos(), aux.getPrecio(), aux.getDisponibilidad());
            }

            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al generar catalogo");
            e.printStackTrace();
        }
    }

}
