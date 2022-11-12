package P05_Arreglos;

public class EjemploMeses {
    public static void main(String[] args) {
        //Inicializar un arreglo
        int[]dias={31,28,31,30,31,30,31,31,30,31,30,31};
        int cantidadDias=0;
        for(int i=0; i<12;i++){
            System.out.println("Mes "+ (i+1)+" tiene "+ dias[i]+ " dias" );
            cantidadDias=cantidadDias+dias[i];
        }
        System.out.println("Cantidad de días acumulados: "+ cantidadDias);
    }
}
//la linea 7,10 y 12 nos habla del ejercicio de tarea