package P04_Estructuras;
import javax.swing.*;
import java.sql.SQLOutput;

public class Numeros1aN {
    public static void main(String[] args) {
        int numero, i;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        i=1;
                while(i<=numero){
                    System.out.println(i);
                    i++;
                }
    }
}
