package HERENCIAI;

public class PruebaBarco {
    public static void main(String[] args) {
        Barco barco1=new Barco("La niña","2008");
        Crucero crucero1=new Crucero("Celebrity Cruises","",150);
        BarcoCarga barcoCarga1= new BarcoCarga("Pesca","",1370);

        Barco barco2=new Barco("La Santa María","1492");
        Crucero crucero2=new Crucero("Carnival Cruise Line","",200);
        BarcoCarga barcoCarga2= new BarcoCarga("Pasaje","",1460);

        System.out.println(barco1.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(barco2.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(crucero1.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(crucero2.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(barcoCarga1.toString());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(barcoCarga2.toString());
        System.out.println("------------------------------------------------------------------------------");
    }
}
