package Busqueda;
public class BusquedaDeInsercion {
    public static void main(String[] args) {
        //Valeria Danae Aguayo Miranda
        int[] arreglo={10,9,7,4,6,5,3,8,2,1, 16,17,18,19,20,15,14,13,12,11,21,22,23,30,29,28,27,26,25,24,34,33,32,31,35,37,38,39, 66,
                50,49,48,47,46,45,44,43,42,41,40,56,57,58,59,60,55,54,53,52,51,61,63,65,67,69,62,64,68,70,76,77,78,79,80,75,74,73,72,
                71,85,84,83,82,81,86,90,89,88,87,97,98,99,100,96,95,94,93,92,91};

        OrdenamientoSeleccionV1 insercion=new OrdenamientoSeleccionV1(arreglo);
        System.out.println("VALERIA DANAE AGUAYO MIRANDA");
        System.out.println("Arreglo original:");
        insercion.imprimir();
        insercion.ordenar();
        System.out.println("Arreglo ordenado:");
        insercion.imprimir();
    }
}
 class OrdenamientoInsercionV1 {
    private int[]x;
    private int N;

    public OrdenamientoInsercionV1(int[]x){
        this.x=x;
        N=this.x.length;
    }
    public void ordenar(){
        int aux, k;
        boolean sw;
        //clasificacion del vector
        for(int i=1; i<=N-1; i++){
            aux=x[i];
            k=i-1;
            sw=false;
            while(!sw && k>=0){
                if(aux<x[k]) {
                    x[k + 1] = x[k];
                    k = k - 1;
                }
                    else{
                        sw=true;
                }
            }
            x[k+1]=aux;
        }
    }
    public void imprimir(){
        for(int j=0; j<=N-1; j++){
            System.out.print(" "+x[j]);
        }
        System.out.println();
    }
}
