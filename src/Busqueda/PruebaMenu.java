package Busqueda;
import java.util.Arrays;
import java.util.Scanner;
public class PruebaMenu {

    public static void main (String[]args){
            Scanner entrada =new Scanner (System.in);
            String []arreglos={"Diego", "Janeth ", "Luis"};
            System.out.println("Ingresa palabra");
            String encuentrame=entrada.next();

            String resultado= Arrays.stream(arreglos).filter(s -> s.equals(encuentrame)).findFirst().orElse(null);

            BusquedaSecuencial1 bs=new BusquedaSecuencial1(arreglos);
            int indice = bs.buscar(encuentrame);



            if(resultado !=null){
                System.out.println("Encontrado en la posicion: "+indice);


            }else{
                System.out.println("No encontrado ");
            }
        }
    }
    class BusquedaSecuencial {
        String[] listaPalabras;

        public BusquedaSecuencial(String[]arreglo) {
            this.listaPalabras = arreglo;
        }
        public int buscar(String valorABuscar) {
            int i;
            for ( i = 0; i < listaPalabras.length; i++) {
                if (listaPalabras[i]==valorABuscar) {
                    return i;
                }
            }
            return i;
        }
    }
