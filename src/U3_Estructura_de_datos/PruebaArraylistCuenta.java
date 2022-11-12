package U3_Estructura_de_datos;
import java.util.ArrayList;

public class PruebaArraylistCuenta {
    public static void main(String[] args) {
        //crear un ArryListCuenta para guardar objetos CuentaBancaria
        ArrayList<Cuentabancaria> listacunetas = new ArrayList<>();
        //Añadir 3 objtos cuentaBnacaria al ArrayList.
        listacunetas.add(new Cuentabancaria(100.0));
        listacunetas.add(new Cuentabancaria(500.0));
        listacunetas.add(new Cuentabancaria(1500.0));
        //Mostrar cada elemento.
        for (int index = 0; index < listacunetas.size(); index++){
            Cuentabancaria cuenta = listacunetas.get(index);
            System.out.println("Cuenta en el índice " + index + "\nBalance: " + cuenta.getBalance());
        }

    }

}
