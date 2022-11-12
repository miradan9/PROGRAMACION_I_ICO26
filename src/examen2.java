public class examen2 {
    public static void main(String[] args) {
        //Condicionales
        String[] letras=new String[50];

        for(int i=0; i<= letras.length; i++){
            int modulo=i%2;

            if(modulo !=0){
                letras[i]="a";
            } else {
                letras[i] = "b";
            }
        }

        for (String valor : letras) {
            System.out.println(valor);
        }
    }
}
