import javax.swing.*;
import java.util.Scanner;

public class op {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1,num2,suma,resta,mult,div,resto;
        double raiz,raiz2;//Muestra raices

        raiz = Double.parseDouble(JOptionPane.showInputDialog("raiz"));
        raiz2 = Math.sqrt(raiz);
        JOptionPane.showMessageDialog(null,+raiz2);
        num1 = Float.parseFloat(JOptionPane.showInputDialog("mete un numero"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("mete otro numero"));


        suma =num1+num2;
        resta =num1-num2;
        mult =num1*num2;
        div =num1/num2;
        resto = num1%num2;

        JOptionPane.showMessageDialog(null, "la suma es "+suma+"\nLa resta es "+resta+"\n La multiplicaciones es "+mult+"\nLa division es "+div);
    }
}
