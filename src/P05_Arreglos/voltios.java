package P05_Arreglos;

public class voltios {
    public static void main(String[] args) {
        double voltios[]={11.95,16.32,12.15,8.22,15.98,36.22,13.54,6.45,17.59};
        System.out.println("Número de elementos: "+voltios.length);
        for(int i=0;i<9;i++){
            System.out.println((i+1)+". Número de voltios: "+voltios[i]);
        }
    }
}
