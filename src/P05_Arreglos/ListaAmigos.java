package P05_Arreglos;

public class ListaAmigos {
    public static void main(String[] args) {
        //Inicializar arreglo
        String [] nombres={"Juan", "Luis", "Angel","Alexis"};
        String[] numeros={"primer","segundo","tercer","cuarto"};
        for (int i=0; i<4; i++ ){
            System.out.println(nombres[i] +" es mi "+numeros[i]+ " amigo");
        }
    }
}
