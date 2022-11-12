package HERENCIAI;

public class Barco {
    protected String nombre;
    protected String año;
    public Barco(String nombre, String año){
        this.nombre=nombre;
        this.año=año;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAño(String año){
        this.nombre=año;
    }
    public String getAño(){
        return año;
    }@Override
    public String toString(){
        return String.format("Nombre del barco: "+this.nombre+"\nAño en el que se construyó: "+this.año);

    }
}
