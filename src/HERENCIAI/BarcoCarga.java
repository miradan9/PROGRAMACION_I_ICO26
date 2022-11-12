package HERENCIAI;

public class BarcoCarga extends Barco{
    public int tonelaje;
    //Constructor
    public BarcoCarga(String nombre, String año, int tonelaje){
        super(nombre,año);
        this.tonelaje=tonelaje;
    }
    public void setTonelaje(int tonelaje){
        this.tonelaje=tonelaje;
    }
    public int getTonelaje(){
        return tonelaje;
    }@Override
    public String toString(){
        return String.format("Nombre del barco: "+this.nombre+"\nCapacidad de carga: "+this.tonelaje);

    }
}
