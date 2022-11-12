package P05_Arreglos;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        int[] numerospn={87,-65,45,-100,-34,-23};
        //positivos:2
        // negativos:4
        int contadorP=0;
        int contadorN=0;

        //se inicializan los contadores en cero
        //se recorre el arreglo de tal manera que por cada elementos se preguntará
        //si dicho elemento es mayor o igual que cero, si lo es, contador de positivoss
        //incrementa en 1
        for(int i=0;i< numerospn.length;i++){
            if(numerospn[i]>=0){
                contadorP++;
            }
            else if(numerospn[i]<=0){
                contadorN++;
            }
        }
        System.out.println("Positivos: "+contadorP);
        System.out.println("Negativos: "+contadorN);

    }
}