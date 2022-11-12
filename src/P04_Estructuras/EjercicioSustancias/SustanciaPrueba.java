package P04_Estructuras.EjercicioSustancias;

public class SustanciaPrueba {
    public static void main(String[] args) {
        Sustancia sustanciaX=new Sustancia(200);
        System.out.println("¿Está alcohol etílico congelado?"+sustanciaX.estaEtilCongelado());
        System.out.println("¿Está alcohol etílico hirviendo?"+sustanciaX.estaEtilHirviendo());
        if (sustanciaX.estaEtilCongelado()){
            System.out.println("Etil congelado");
        }
        if(sustanciaX.estaEtilHirviendo()){
            System.out.println("Etíl hirviendo");
        }
    }
}
