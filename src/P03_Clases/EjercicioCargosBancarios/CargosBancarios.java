package P03_Clases.EjercicioCargosBancarios;

public class CargosBancarios {

    private double saldoCuenta;
    private int cantidadChequesEmitidos;

    public CargosBancarios(double saldo, int cheques){
        this.saldoCuenta=saldo;
        this.cantidadChequesEmitidos=cheques;
}
    public double obtenerCobroTotal() {
        double comisionBase, cargoAdicional, comisionPorCheques, cobroTotal;
        //cobro por comision base
        comisionBase = 10;
        saldoCuenta = saldoCuenta - comisionBase;
        //cobro por cargo adicional
        cargoAdicional=0;
        if (saldoCuenta < 400) {
            cargoAdicional = 15;
        }
        saldoCuenta = saldoCuenta - cargoAdicional;
        //cobro por comisión de cheques
        comisionPorCheques = 0;
        if (cantidadChequesEmitidos < 20) {
            comisionPorCheques = cantidadChequesEmitidos * 0.10;
        } else if (cantidadChequesEmitidos >= 20 && cantidadChequesEmitidos <= 39) {
            comisionPorCheques = cantidadChequesEmitidos * 0.08;
        } else if (cantidadChequesEmitidos>=40 && cantidadChequesEmitidos<=59){
            comisionPorCheques=cantidadChequesEmitidos*0.06;
        } else if (cantidadChequesEmitidos>=60){
            comisionPorCheques=cantidadChequesEmitidos*0.04;
        }
        //Saldo final y cobro total
        saldoCuenta=saldoCuenta-comisionPorCheques;
        cobroTotal=comisionBase+cargoAdicional+comisionPorCheques;
        return cobroTotal;
    }// Fin de obtenerCobroTotal
    public double obtenerSaldoActual(){
        return saldoCuenta;
    }
}// Fin de la clase
