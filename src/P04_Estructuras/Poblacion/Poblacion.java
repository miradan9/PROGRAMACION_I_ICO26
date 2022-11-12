package P04_Estructuras.Poblacion;

public class Poblacion {
    static int orgIniciales=0, diasPrueba=0;
    static double porcentjeCrecimiento=0;

    public Poblacion(int OrganismosIni,double porcentaje, int dias) {
    orgIniciales=OrganismosIni;
    diasPrueba=dias;
    porcentjeCrecimiento=porcentaje;
    }

    public static int getOrgIniciales() {
        return orgIniciales;
    }

    public static void setOrgIniciales(int orgIniciales) {
        Poblacion.orgIniciales = orgIniciales;
    }

    public static double getPorcentjeCrecimiento() {
        return porcentjeCrecimiento;
    }

    public static void setPorcentjeCrecimiento(double porcentjeCrecimiento) {
        Poblacion.porcentjeCrecimiento = porcentjeCrecimiento;
    }

    public static int getDiasPrueba() {
        return diasPrueba;
    }

    public static void setDiasPrueba(int diasPrueba) {
        Poblacion.diasPrueba = diasPrueba;
    }
    public void mostarCrecimiento(int diasPrueba){
        //Mostramos bacterias iniciales
        double acumulador=0;
        System.out.println("Bacteriales iniciales"+getOrgIniciales());
        for(int i=1;i<=diasPrueba;i++);
            //Obtenemos el porcentaje de crecimiento
            double porcentajeIncrement=((float)getOrgIniciales()/(float)getPorcentjeCrecimiento()/100);
        System.out.println("Alerta de prueba/ resultPercentege= "+ porcentajeIncrement);
            double calculo=getOrgIniciales()+porcentajeIncrement;
        }
    }


