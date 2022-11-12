package Busqueda;

public class BusquedaDeSeleccion {
    public static void main(String[] args) {
        //Valeria Danae Aguayo Miranda
        int arreglo[]=new int [100];
        for(int i=1; i<99;i++){
            arreglo[i]=(int)(Math.random()*95+5);
        }
        OrdenamientoSeleccionV1 seleccion=new OrdenamientoSeleccionV1(arreglo);
        System.out.println("VALERIA DANAE AGUAYO MIRANDA");
        System.out.println("Arreglo original:");
        seleccion.imprimir();
        seleccion.ordenar();
        System.out.println("Arreglo ordenado:");
        seleccion.imprimir();
    }
}
class OrdenamientoSeleccionV1 {
    private int[]x;
    private int N;

    public OrdenamientoSeleccionV1(int[]x){
        this.x=x;
        N=this.x.length;
    }
    public void ordenar(){
        int aux, k;
        //clasificacion del vector
        for(int i=0; i<=N-2; i++){
            aux=x[i];
            k=i;
            for( int j=i; j<=N-1;j++){
                if(x[j]<aux){
                    aux=x[j];
                    k=j;
                }
            }
            x[k]=x[i];
            x[i]=aux;
        }
    }
    public void imprimir(){
        for(int j=0; j<=N-1; j++){
            System.out.print(" "+x[j]);
        }
        System.out.println();
    }
}