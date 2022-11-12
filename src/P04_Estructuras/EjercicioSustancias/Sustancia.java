package P04_Estructuras.EjercicioSustancias;

public class Sustancia{
private double temperatura;
public Sustancia (double temp){
    this.temperatura=temp;
}
    public boolean estaEtilCongelado(){
    if (temperatura<=-173) {
        return true;
    } else return false;
}
    public boolean estaEtilHirviendo(){
        if(temperatura>=172)
        return true;
        else return false;
}}

