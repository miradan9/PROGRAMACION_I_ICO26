package PilasYColas;
import java.util.EmptyStackException;
public class Jugador {
    private int numero;
    private String nombre;
    private String posicion;
    private int goles;

    public Jugador(int numero, String nombre, String posicion,int goles){
        this.numero=numero;
        this.nombre=nombre;
        this.posicion=posicion;
        this.goles=goles;
    }
    @Override
    public String toString(){
        return "\nJugador{"+
                "numero="+numero+", nombre="+nombre+", posicion="+posicion+", goles="+goles+"}";
    }
}
