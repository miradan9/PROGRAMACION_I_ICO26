public class Examen {
    public static void main(String[] args) {
        String str1="Hola";
        String str2="ola";
        boolean status= str1.equals(str2);
        System.out.println("El valor booleano actual es: "+ status);

        if(str1.equals(str2)){
            System.out.println(str1);
            System.out.println(str2);
        }
    }
}
