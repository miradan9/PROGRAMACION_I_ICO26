package P05_Arreglos;

import java.util.Scanner;

public class voltios2 {
    public static void main(String[] args) {
        Scanner entreda=new Scanner((System.in));
        double voltio[]=new double[9];
        System.out.println("Guardamos los datos del arreglo");
        for(int i=0;i<9;i++){
            System.out.print((i+1)+". Digite el número de voltios:");
            voltio[i]= entreda.nextDouble();
        }
        for(double i:voltio){
            System.out.println("Número de voltios: "+i);
        }
    }
}
