package P04_Estructuras;

public class ConversionGrados {
    public static void main(String[] args) {
        System.out.println("Programa para convertir °C a °F");
        System.out.printf("%10s %8s\n", "°C","°F");
        for(int c=0; c<=20; c++){
            double f=(9.0/5)*c+32;
            System.out.printf("%10d %8.2f\n",c,f);
        }
    }
}