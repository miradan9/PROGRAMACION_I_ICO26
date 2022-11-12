package P05_Arreglos;

public class Ejercicio_09 {
    public static void main(String[] args) {
        //tabulacion de arreglos dados desde la entrada
        double voltios[]={11.95,16.32,12.15,8.22,15.98,36.22,13.54,6.45,17.59};

        for(int i=0;i<9;i++){
            System.out.print("\t\t"+voltios[i]);
            if((i+1) % 3 ==0){
                System.out.println();
            }
        }
    }
}