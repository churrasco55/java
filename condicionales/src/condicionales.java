import javax.swing.*;
import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double a,b;
        String c;
        a=Double.parseDouble(JOptionPane.showInputDialog("dato1"));
        b=Double.parseDouble(JOptionPane.showInputDialog("dato2"));
        if (a>b){
            System.out.println("dato1 es mayor");
        }
        else if (a==b){
            System.out.println("iguales");
        }
        else {
            System.out.println("dato2 es mayor");
        }
        c=JOptionPane.showInputDialog("palabras");
        switch (c){
            case "a":JOptionPane.showMessageDialog(null,"elpepe");
                break;
            case "b":JOptionPane.showMessageDialog(null,"mamahuevazo");
                break;
            default:JOptionPane.showMessageDialog(null,"elpepe murio");
        }
    }
}
