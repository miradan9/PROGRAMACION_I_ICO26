package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;
        a = new int[10];
        b = new int[10];
        c = new int[20];
        System.out.println("Digite el primer arreglo: ");
        do {
            for(int i = 0; i < 10; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                a[i] = entrada.nextInt();
            }
            //Comprobamos sie le programa esta ordenado crecientemente
            for(int i = 0; i < 9; i++) {
                if(a[i]<a[i+1]){//Creciente
                    creciente = true;
                }
                if(a[i]>a[i+1]){//Decreciente
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar");
            }
        }while(creciente == false);


        System.out.println("Digite el segundo arreglo: ");
        do {
            for(int i = 0; i < 10; i++) {
                System.out.print((i+1)+". Digite un numero: ");
                b[i] = entrada.nextInt();
            }
            for(int i = 0; i < 9; i++) {
                if(b[i]<b[i+1]){
                    creciente = true;
                }
                if(b[i]>b[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar");
            }
        }while(creciente == false);

        int i=0;// i Sera para el arreglo a
        int j=0;//j Sera para el arreglo a
        int k=0;//k Sera para el arreglo c

        while(i<10 && j<10){
            if(a[i]<b[j]){//Si el elemento de a es menor a b
                c[k]=a[i];//Copiamos el elemento a
                i++;//avanzamos una posicion en a
            }
            else{
                c[k]= b[j];//copiamos el elemento de b
                j++;//avanzamos una posicion en b
            }
            k++;//avanzamos una posicion en c
        }
        //Cuando salimos del while es porque un arreglo a o b se a copiado completamente
        if(i==10){//significa que ya copiamos el arreglo a
            while(j<10){//mientras ek iterador sea menor a 10
                c[k]=b[j];//copiamos una posicion de b en c
                j++;//avanzamos una posicion en b
                k++;//avanzamos una posicion en c
            }
        }
        else{//significa que ya copiamos el arreglo b falta el a
            while(i<10){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        System.out.println("\nEl arreglo C completo es: ");
        for(k=0;k<20;k++){
            System.out.print(c[k]+" ");
        }
        System.out.println("");
    }
}
