package P04_Estructuras;

public class Sumatoria {
    public static void main(String[] args) {
        //Se quiere sumar los primeros 10 numeros (1+2+3+4+5...+10)=55
        //Acumulador: sirve para ir sumando valores en un ciclo
        //1,3,6,10,15,21,28,36,45,55
        //Cuando se hacen sumatorias rel acumulador debe de empezar en cero,}
        //a menos que se indique lo contrario
        int suma=0;// acumulador
        int numero=1;
        while(numero<=10){
            suma=suma+numero;
            numero++;
        }
        System.out.println("La suma sde los numeros del 1 al 10 es: "+suma);
    }
}
