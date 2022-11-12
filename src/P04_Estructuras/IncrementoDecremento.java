package P04_Estructuras;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int numero = 4;
        System.out.println("Numero: " + numero);//4
        //Incrementar el numero
        System.out.println("Incrementando numero...");
        numero++;
        System.out.println("Numero: " + numero);//5
        numero = numero + 1;
        System.out.println("Numero: " + numero);//6
        numero =numero+ 10;
        System.out.println("Numero: " + numero);//16
        numero += 10;
        System.out.println("Numero: " + numero);//26
        //Decrementar el numero
        System.out.println("Decrementando numero...");
        numero--;
        System.out.println("Numero: " + numero);//25
        numero = numero - 5;
        System.out.println("Numero: " + numero);//20
        numero -= 5;
        System.out.println("Numero: " + numero);//15
    }}