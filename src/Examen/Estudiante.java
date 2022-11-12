package Examen;

public class Estudiante {
    private int clave;
    private String nombre;
    private String apellido;
    private double calificacion1;
    private double calificacion2;


    public Estudiante(int clave, String nombre, String apellido, double calificacion1, double calificacion2){
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
    }
    public int getClave(){return clave;}
    public void setClave(int clave){this.clave = clave;}

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public String getApellido(){return apellido;}
    public void setApellido(String apellido){this.apellido= apellido;}

    public double getCalificacion1(){return calificacion1;}
    public void setCalificacion1(double calificacion1){this.calificacion1= calificacion1;}

    public double getCalificacion2(){return calificacion2;}
    public void setCalificacion2(double calificacion2){this.calificacion2= calificacion2;}
}
