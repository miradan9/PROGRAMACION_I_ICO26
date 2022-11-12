package AgregarObjetosArrayList;

import java.sql.SQLOutput;

public class ListaEnlazadaTrabajadores {
    private Trabajador head;
    private Trabajador tail;
    private int length;

    class Trabajador {
        String nombre;
        String puesto;
        double salario;
        Trabajador next;

        Trabajador(String n, String p, double s) {
            this.nombre = n;
            this.puesto = p;
            this.salario = s;
        }
    }

    public ListaEnlazadaTrabajadores(String nombre, String puesto, double salario) {
        Trabajador newtrabajador = new Trabajador(nombre, puesto, salario);
        head = newtrabajador;
        tail = newtrabajador;
        length = 1;
    }

    public void printList() {
        System.out.println("La lista es: ");
        if (isEmpty()) {
            System.out.println("La lista está vacía");
            return; // y se sale
        }
        System.out.printf("%-20s%-20s%8s%n", "Nombre", "Puesto", "Salario");
        Trabajador temp = head;
        while (temp != null) {
            System.out.printf("%-20s%-20s%8.2f%n", temp.nombre, temp.puesto, temp.salario);
            temp = temp.next;
        }
        System.out.println();
    }

    public void sumar() {
        Trabajador temp = head;
        double total = 0;
        while (temp != null) {
            total = total + temp.salario;
            temp = temp.next;
        }
        System.out.printf("La suma de los salarios es $%.2f%n", total);
    }

    public void append(String nombre, String puesto, double salario) {
        Trabajador newNode = new Trabajador(nombre, puesto, salario);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public boolean isEmpty() {
        if (length == 0) return true;
        else return false;
    }

}
