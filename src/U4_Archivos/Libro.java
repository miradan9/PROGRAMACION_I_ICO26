package U4_Archivos;

public class Libro {
    private int clave;
    private String titulo;
    private String autor;
    private String editorial;
    private double precio;
    private int cantidad;

    public Libro(int clave, String titulo, String autor, String editorial, double precio,  int cantidad){
        this.clave=clave;
        this.titulo=titulo;
        this.autor= autor;
        this.editorial=editorial;
        this.cantidad=cantidad;
        this.precio=precio;
    }
    public int getClave(){
        return clave;
    }
    public void setClave(int clave){
        this.clave=clave;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial=editorial;
    }
    public double getPrecio(){ return precio; }
    public void setPrecio(double precio){ this.precio=precio; }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){ this.cantidad=cantidad;}

    public String formatoArchivoLibros(){
        return clave+"|"+titulo+"|"+autor+"|"+editorial+"|"+precio+"|"+cantidad;
    }
    @Override
    public String toString(){
        return "Libro{"+
                "clave="+clave+
                ", titulo='"+titulo+'\''+
                ", autor="+autor+'\''+
                ", editorial='"+editorial+'\''+
                ", cantidad='"+cantidad+'\''+
                ", precio="+precio+
                "}";
    }
}
