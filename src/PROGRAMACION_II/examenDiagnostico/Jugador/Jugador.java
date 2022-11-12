package PROGRAMACION_II.examenDiagnostico.Jugador;

public class Jugador {
    private String nombre;
    private String equipo;
    private String posicion;
    private int goles;


    public Jugador(String nombre, String equipo, String posicion, int goles){
        this.nombre=nombre;
        this.equipo=equipo;
        this.posicion=posicion;
        this.goles=goles;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public String getEquipo() {
        return this.equipo;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public String getPosicion() {
        return this.posicion;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getGoles() {
        return this.goles;
    }

}
