package Computadora;

public class Computadora {
    int clave;
    String marca;
    String modelo;
    int nucleos;
    double precio;
    int cantidad;
    boolean disponibilidad;

    public Computadora(int clave, String marca, String modelo, int nucleos, double precio, int cantidad,boolean disponibilidad) {
        this.clave = clave;
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.precio = precio;
        this.cantidad=cantidad;
        this.disponibilidad = disponibilidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String formatoArchivo() {
        return clave + "|" + marca + "|" + modelo + "|" + nucleos + "|" + precio + "|"+ disponibilidad + "|";
    }

    @Override
    public String toString() {
        return "libro{" + "clave = " + clave + ", marca = " + marca + '\'' + ", modelo = " + modelo +'\''
                + ", nucleo = " + nucleos + '\'' + ", precio = " + precio + ", disponibilidad = "+disponibilidad+'}';
    }
}
