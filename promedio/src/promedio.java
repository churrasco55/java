import javax.swing.*;
import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float horas,Shora,tot,dias=7;

        horas = Float.parseFloat(JOptionPane.showInputDialog("ingrese horas"));
        Shora = Float.parseFloat(JOptionPane.showInputDialog("ingrese horas"));

        tot=horas*Shora;

        JOptionPane.showMessageDialog(null,"por semana cobra "+tot+" pesos");
        //                          
    }
}
