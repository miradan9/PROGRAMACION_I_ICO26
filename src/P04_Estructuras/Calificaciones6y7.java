package P04_Estructuras;
import java.util.Scanner;
public class Calificaciones6y7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int coincidiencias=0;
        float calificacion;
        int contador=1;
        while(contador<7){
            System.out.println("Dame la calificación N° "+ contador+":");
            calificacion=entrada.nextFloat();
            if (calificacion>=6 && calificacion<=7){
    coincidiencias++;
            }
            contador++;
        }
        System.out.println("Cantidad de alumnos que tienen calificaciones entre 6 y 7: "+coincidiencias);
    }
}
