package P04_Estructuras.EjercicioDado;
import java.util.Random;
public class Dado {
    private int lados;
    private int valor;

    public Dado(int numLados) {
        this.lados = numLados;
    }

    public void lanzar() {
        Random rand = new Random();
        //Generar un valor aleatorio de acuerdo al
        // número de lados
        this.valor = rand.nextInt(lados) + 1;
    }
    public int obtenerLados(){
        return lados;
    }
    public int obtenerValor(){
        return valor;
    }
}
