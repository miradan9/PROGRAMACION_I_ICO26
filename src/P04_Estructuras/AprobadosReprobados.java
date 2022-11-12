package P04_Estructuras;
import java.util.Scanner;
public class AprobadosReprobados {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int reprobados=0, aprobados=0;
        float calificación;
        int i=1;
        while(i<6){
            System.out.println("Dame la calificación N° "+i+": ");
            calificación= entrada.nextFloat();
            if(calificación>=6){
                aprobados++;
            }
            if(calificación<6){
                reprobados++;
            }
            i++;
        }
        System.out.println("Cantidad de alumnos aprobados: "+ aprobados);
        System.out.println("Cantidad de alumnos reprobados: "+reprobados);
    }
}
