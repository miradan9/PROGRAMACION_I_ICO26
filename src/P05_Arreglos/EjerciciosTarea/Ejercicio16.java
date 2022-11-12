package P05_Arreglos.EjerciciosTarea;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner entradas = new Scanner(System.in);
        float primer[],segundo[],tercer[];
        float sumaPrimer=0,sumaSegundo=0,sumaTercer=0,sumaAlumno=0;
        float promedioPrimer,promedioSegundo, promedioTercero, promedioAlumno;
        int posicion;
        //creamos los arreglos de 5 elementos
        primer = new float[5];
        segundo = new float[5];
        tercer = new float[5];
        System.out.println("Digite la nota del primer trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            primer[i] = entradas.nextFloat();

            sumaPrimer += primer[i];//Sumanos todas las notas del primer trimestre
        }
        System.out.println("Digite la nota del segundo trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            segundo[i] = entradas.nextFloat();

            sumaSegundo += segundo[i];
        }
        System.out.println("Digite la nota del tercer trimestre: ");
        for(int i=0;i<5;i++){
            System.out.print("Alumno ["+i+"]: ");
            tercer[i] = entradas.nextFloat();

            sumaTercer += tercer[i];
        }

        //sacamos el promedio de cada uno de los trimestres
        promedioPrimer = sumaPrimer/5;
        promedioSegundo = sumaSegundo/5;
        promedioTercero = sumaTercer/5;

        //Ahora pedimos la posición del alumno n para sacar su promedio
        //el do while se ocupa para que el usuario no confunda las posiciones
        do{
            System.out.print("\nDigite la posición del alumno(0-4), para sacar el promedio");
                    posicion = entradas.nextInt();
        }while(posicion<0 || posicion>4);

        //Sacamos la suma de las notas del alumno
        sumaAlumno = primer[posicion]+segundo[posicion]+tercer[posicion];
        promedioAlumno = sumaAlumno/3;

        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio primer trimestre: "+promedioPrimer);
        System.out.println("Promedio segundo trimestre: "+promedioSegundo);
        System.out.println("Promedio tercer trimestre: "+promedioTercero);
        System.out.println("Promedio del Alumno: "+promedioAlumno);
    }
}
