package P04_Estructuras.EjercicioConvertidorVelocidad;

public class ConvertidorVelocidadPrueba {
    public static void main(String[] args) {
        final int KPH_INICIAL = 60;  // vELOCIDAD INICIAL
        final int MAX_KPH = 130; // Velocidad final
        final int INCREMENTO = 10; // incrementos en la velocidad
        ConvertidorVelocidad convertidor = new ConvertidorVelocidad();


        System.out.println("KPH\t\tMPH");
        System.out.println("-------------------------------");
        for (int kph = KPH_INICIAL; kph <= MAX_KPH; kph += INCREMENTO) {
            double mph = convertidor.obtenerMHP(kph);
            System.out.printf("%d\t\t%.1f\n", kph, mph);
        }
    }
}