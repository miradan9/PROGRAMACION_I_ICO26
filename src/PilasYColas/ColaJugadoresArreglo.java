package PilasYColas;
import java.util.NoSuchElementException;
public class ColaJugadoresArreglo {
    private Jugador[] colaE;
    private int frenteC;
    private int finalC;

    public ColaJugadoresArreglo(int capacidad){
        colaE=new Jugador[capacidad];
        frenteC=finalC=0;
    }
    public void meter(Jugador jugador){
        if (finalC== colaE.length){
            Jugador[] newArray=new Jugador[2*colaE.length];
            System.arraycopy(colaE,0,newArray,0, colaE.length);
            colaE=newArray;
        }
        colaE[finalC]=jugador;
        finalC++;
    }
    public  Jugador sacar(){
        if(numElementosEnCola()==0){
            throw new NoSuchElementException();
        }
        Jugador jugador =colaE[frenteC];
        colaE[frenteC]=null;
        frenteC++;
        if(numElementosEnCola()==0){
            frenteC=0;
            finalC=0;
        }
        return jugador;
    }
    public int numElementosEnCola(){
        return finalC-frenteC;
    }
    public Jugador consultarFrente(){
        if(numElementosEnCola()==0){
            throw new NoSuchElementException();
        }
        return colaE[frenteC];
    }
    public void imprimirCola(){
        System.out.println("--------------------------------");
        for(int i=frenteC; i<finalC;i++){
            System.out.println(colaE[i]);
        }
    }

}
