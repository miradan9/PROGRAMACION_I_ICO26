package P05_Arreglos;

public class APuntuaciones {
    public static void main(String[] args) {

        double[] primerArreglo={23,25,26,21,1};
        double[] segundoArreglo={15,8,13,1,20};
        double[] tercerArreglo={18,22,1,15,30};

        double[] valores= new double[5];
        for(int i=0; i< valores.length; i++){
            valores[i]=primerArreglo[i]+segundoArreglo[i]+tercerArreglo[i];
        }
        double[] nuevosValores = new double[5];
        for (int i=0; i<valores.length; i++){
            nuevosValores[i]= valores[i]/3;
        }
        double resultado=nuevosValores[0];
        int salida=0;
        for (int i=1; i< nuevosValores.length; i++){
            if(nuevosValores[i]> resultado){
                resultado=nuevosValores[i];
                salida=i;
            }
        }
        salida++;
        System.out.println(salida);
        System.out.println(resultado);
    }
}
