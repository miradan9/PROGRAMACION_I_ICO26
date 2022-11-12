package P05_Arreglos;

public class SubIndice_Invalido {
    public static void main(String[] args) {
        int[] valores=new int[3];
        System.out.println("Intento de guardar 4 numero en un arreglo de 3 elementos");
        for(int index=0; index<4; index++){
            System.out.println("Procesando el elemento "+ index);
            valores[index]=10;
        }
    }
}
