package PROGRAMACION_II.examenDiagnostico;
import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double calificacion[] =new double[5];
        for (int i=0; i<5;i++){
            System.out.print((i+1)+". Digita tus calificaciones: ");
            calificacion[i]= entrada.nextDouble();
        }
        System.out.println("Tus calificaciones obtenidas son: "  );
        for(int i=0; i <5 ;i++){
            System.out.println(calificacion[i]  );
        }
        //Calculamos el promedio
        System.out.println("Tu promedio es de: ");
        double suma =0.0, promedio=0.0;
        for(int i=0; i < calificacion.length ;i++){

            suma = suma +calificacion[i];
        }
        promedio= suma/5;
        System.out.println( promedio );

        //Mayor y menos calificacion
        double cmayor, cmenor;
        cmayor = cmenor = calificacion [0];

        for (int i = 0; i < 5; i++) {
            if(calificacion [i] > cmayor) {
                cmayor = calificacion[i];
            }
            if(calificacion[i]<cmenor) {
                cmenor = calificacion[i];
            }
        }
        System.out.println("Calificación alta : "+cmayor);
        System.out.println("Calificación baja : "+cmenor);
    }
}
