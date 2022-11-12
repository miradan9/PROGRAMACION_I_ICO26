package P04_Estructuras.Tienda;
import java.util.Scanner;
/*Programa de una tienda.
*Nos pide cuantos productos vamos a pagar
* Nos va pidiendo el precio de cada producto , lo va sumando
* Y nos muestra el total de la venta
* 5 productos: 120,80,300,10,40:550
 */
public class Tienda {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        double total=0;
        int numeroProductos;
        System.out.println("TIENDITA DE LA ESQUINA");
        System.out.println("Dame el número de productos a comprar: ");
        numeroProductos=entrada.nextInt();
        int contador=1;
        while(contador<=numeroProductos){
            System.out.println("Dame el precio del producto "+ contador+": ");
            double precio=entrada.nextDouble();
            total=total+precio;
            contador++;
        }
        System.out.println("Total: "+total);
    }
}

