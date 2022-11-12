package Busqueda;
public class Ordenamiento {
    public static void main(String[] args) {
        //Valeria Danae Aguayo Miranda
        int arreglo[]=new int [100];
        for(int i=1; i<99;i++){
            arreglo[i]=(int)(Math.random()*95+5);
        }
        OrdenamientoBurbujaV1 burbuja=new OrdenamientoBurbujaV1(arreglo);
        System.out.println("VALERIA DANAE AGUAYO MIRANDA");
        System.out.println("Arreglo original:");
        burbuja.imprimir();
        burbuja.ordenar();
        System.out.println("Arreglo ordenado:");
        burbuja.imprimir();
    }
}
class OrdenamientoBurbujaV1{
    private int[]x;
    private int N;

    public OrdenamientoBurbujaV1(int[]x){
        this.x=x;
        N=this.x.length;
    }
    public void ordenar(){
        //algoritmo de la burbuja2 mejorado
        int aux;
        //clasificacion del vector
        for(int i=0; i<=N-2; i++){
            for(int j=0; j<=N-i-2;j++){
                if(x[j]>x[j+1]){
                    //intercambiar x[j] y x[j+1]
                    aux=x[j];
                    x[j]=x[j+1];
                    x[j+1]=aux;
                }
            }
        }
    }

    public void imprimir(){
        for(int j=0; j<=N-1; j++){
            System.out.print(" "+x[j]);
        }
        System.out.println();
    }
}


