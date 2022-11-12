package P04_Estructuras;

import java.util.Scanner;
//En este programa -1,80 es nuestro valor centinela
public class PromedioClase {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        //Para la suma de las calificaciones
        int total=0; //Inicializa el acumjulador de las calificaciones
        //Contador para saber cuantas calificaciones se han ingresado
        int contadorCalificaciones=0;//Inicializa el contador
        double promedio = 0;
        System.out.print("Escriba la calificación(Introduzca -1 para terminar): ");
        int calificacion=entrada.nextInt();
        while(calificacion!=-1){ //Mientras calificacion sea diferente de -1 repite{pedir calificacion}
            total=total+calificacion;
            contadorCalificaciones=contadorCalificaciones+1;
            System.out.print("Escriba la calificación(Introduzca -1 para terminar): ");
            calificacion=entrada.nextInt();
        }
        if(contadorCalificaciones!=0){
           promedio=(double)total/contadorCalificaciones;
        }
        else{
            System.out.println("No se introdujeron calificaciones");
        }
        System.out.println("Suma Total: "+total);
        System.out.println("Numero de calificaciones: "+contadorCalificaciones);
        System.out.printf("El promedio de la clase es %.1f%n", promedio);
        //Sacar el promedio solo si contadorCalificaciones !=0
    }
}
