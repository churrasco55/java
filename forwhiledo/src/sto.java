import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;

public class sto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0,b,c,d,e,aleatorio,aleatorio2 = 0,cont = 0;

        /*System.out.println("Numeros: ");
        b = entrada.nextInt();
        do {
            System.out.println(i);
            i++;
        }
        while (i<=b);
        for (int a=0;a<=b;a++){
            System.out.println("a"+a);
        }*/
        c= Integer.parseInt(JOptionPane.showInputDialog("Intrese un numero: "));
        while (c != 0){
            if (c > 0){
                JOptionPane.showMessageDialog(null,"mayor y funciona");
                c= Integer.parseInt(JOptionPane.showInputDialog("Intrese otro numero: "));
            }
            else{
                JOptionPane.showMessageDialog(null,"es menor y funcina");
                c= Integer.parseInt(JOptionPane.showInputDialog("Intrese otro numero: "));
            }
        }
        aleatorio = (int)(Math.random()*100);//genera numero aleatorio 0-100
        do {
            d = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numeroa"));

            if (aleatorio > d){
                System.out.println("dame un numero mayor");
            }
            else{
                System.out.println("dame un numero menor");
            }
            cont++;
        }
        while (d != aleatorio);
        System.out.println("adivinaste el numero en "+cont+" intentos");


        e = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        while(e != 0){
            aleatorio2+=e;
            e = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        }
        JOptionPane.showMessageDialog(null,"termino, la suma es "+aleatorio2);
    }
}
