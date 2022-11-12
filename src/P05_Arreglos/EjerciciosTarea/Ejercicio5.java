package P05_Arreglos.EjerciciosTarea;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int a[], b[], c[];

            a = new int[10]; //Arreglo a con 10 elementos
            b = new int[10]; //Arreglo b con 10 elementos
            c = new int[10]; //Arreglo c contendra al arreglo a y b

            //Pedimos el arrelgo a
            System.out.println("Digite el primer arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un número: ");
                a[i] = entrada.nextInt();
            }
            //Pedimos el arreglo b
            System.out.println("\nDigite el segundo arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un número: ");
                b[i] = entrada.nextInt();
            }
            //Se mezclan los dos arreglos en el arreglo c
            //Vamos a utilizar el iterador i para a y b
            // y el iterador j para el arreglo c
            int j=0;
            for(int i=0;i<10;i++){
                c[j]=a[i]; //1°A,2°A
                j++;
                c[j]=b[i];//1°B,
                j++;
            }
            System.out.print("\nEl tercer arreglo es: ");
            for(int i=0;i<20;i++){
                System.out.print(c[i]+" ");
            }
        }
    }
