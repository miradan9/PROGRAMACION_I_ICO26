package U3_Estructura_de_datos;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    //Importante crear la clase Node (es una clase interna)

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    //Crear la cabeza y el final
    public LinkedList(int value){
        Node newNode=new Node (value);
        head=newNode;
        tail=newNode;
    }
    //Se crea una variable temp que apuntara hacia head
    public void printList(){
        Node temp=head;
        while ( temp !=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    //Agregamos métodos para ver el contenido head,tail,length
    public void getHead(){
        System.out.println("Head: "+ head.value);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }
    public void getLength(){
        System.out.println("Length: "+length);
    }

    //Creamos una instancia de la lista enlazada y ejecutamos sus operaciones
    public class Main{
        public static void main(String[] args) {
            LinkedList myLinkedList=new LinkedList(4);
            myLinkedList.getHead();
            myLinkedList.getTail();
            myLinkedList.getLength();
            System.out.println("-----------------------------");
            myLinkedList.printList();
        }
    }

    //Se crea un nuevo Nodo
    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
        length++; //Aumentamos la longitud de la lista
    }
    public class main {
        public static void main(String[] args) {
            LinkedList myLinkedList=new LinkedList(1);
            myLinkedList.append(2);
            myLinkedList.printList();
        }
    }
}
