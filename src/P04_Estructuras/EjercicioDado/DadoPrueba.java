package P04_Estructuras.EjercicioDado;

public class DadoPrueba {
    public static void main(String[] args) {
        Dado dado1=new Dado(6);
        dado1.lanzar();
        System.out.println(dado1.obtenerValor());

        Dado dado2= new Dado(20);
        dado2.lanzar();
        System.out.println(dado2.obtenerLados());
    }
}
