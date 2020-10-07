import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class laweadejava {
    public static void main(String[] args) {
        String palabras;
        int numero;
        char letra;
        double numero1;

        palabras = JOptionPane.showInputDialog("escribi");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        letra = JOptionPane.showInputDialog("dame una letra").charAt(0);
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Dame un numerote"));

        JOptionPane.showMessageDialog(null,"palabra: "+palabras);
        JOptionPane.showMessageDialog(null,"Numero: "+numero);
        JOptionPane.showMessageDialog(null,"Letra: "+letra);
        JOptionPane.showMessageDialog(null,"Numerote: "+numero1);
    }
}
