package P05_Arreglos.EjerciciosTarea;

public class Introduccion {
    public static void main(String[] args) {
        //Pimera forma
        int[]numeros=new int [3];
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;

            for(int i=0;i<3;i++){
                System.out.println(numeros[i]);
        }
            //Segunda Forma
        int[] numero={5,7,9,10};
            for(int i=0;i<4;i++){
                System.out.println(numero[i]);
            }
    }
}
