package U3_Estructura_de_datos;

public class Cuentabancaria {
    private double balance; //lo que hay en la cuenta

    public Cuentabancaria() {
        balance = 0.0;
    }

    public Cuentabancaria(double balanceInicial) {
        balance = balanceInicial;

    }

    public void depositar(double cantidad) {
        balance += cantidad;
    }

    public void retirar(double cantidad) {
        balance -= cantidad;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
