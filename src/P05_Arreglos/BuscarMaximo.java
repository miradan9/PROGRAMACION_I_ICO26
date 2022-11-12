package P05_Arreglos;

public class BuscarMaximo {
    public static void main(String[] args) {
        int[] numeros={87,65,45,100,34,23};
        //mostrar en pantalla
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+" ");
        }
        System.out.println();
        //Encontrar el mayor de los números
        int mayor=numeros[0];//Inicio
        int indiceDelMayor=0;
        for(int i=1;i< numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
                indiceDelMayor=i;
            }
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El índice del número mayor es: "+indiceDelMayor);
    }
}
