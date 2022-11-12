package HERENCIAI;

public class Crucero extends Barco {
    private int pasajeros;

    //Constructor
    public Crucero(String nombre, String año, int pasajeros) {
        super(nombre, año);
        this.pasajeros = pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }@Override
    public String toString(){
        return  String.format("Nombre del crucero: "+this.nombre+"\nNumero máximo de pasajeros: "+this.pasajeros);

    }
}
