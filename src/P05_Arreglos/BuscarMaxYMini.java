package P05_Arreglos;

public class BuscarMaxYMini {
        public static void main(String[] args) {
            System.out.println("LISTA DE NÚMEROS PROPUESTOS");
            double[] pendientes={17.24,25.63,5.94,33.92,3.71,32.84,35.93,18.24,6.92};
            //mostrar en pantalla
            for(int i=0;i<pendientes.length;i++){
                System.out.print(pendientes[i]+", ");
            }
            System.out.println();
            //Encontrar el mayor de los números
            double mayor=pendientes[0];//Inicio
            double menor=pendientes[0];//Inicio

            int indiceDelMayor=0;
            for(int i=1;i< pendientes.length;i++){
                if(pendientes[i]>mayor){
                    mayor=pendientes[i];
                }
                if(pendientes[i]<menor){
                    menor=pendientes[i];
                }
            }
            System.out.println("----------------------------------------------");
            System.out.println("El mayor es: "+mayor);
            System.out.println("El menor es: "+menor);
        }
    }
