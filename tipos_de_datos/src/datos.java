import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        final String dato = "hola que tal bro"; //con "Final" declaramos una constante

        System.out.println(dato);
        //...... Entrada de numeros

        Scanner entrada = new Scanner(System.in);
        int numero;
        float numero1;
        String palabra;
        char letra;

        System.out.print("mete unas palabritas: ");
        palabra = entrada.nextLine();
        System.out.print("mete una letra gil: ");
        letra = entrada.next().charAt(0);
        System.out.print("mete un numero entero rey: ");
        numero = entrada.nextInt();
        System.out.print("mete otro numero flotante rey: ");
        numero1 = entrada.nextFloat();

        System.out.println("tu numeros son: "+numero+" "+numero1);
        System.out.println("tu palabra es: "+palabra);
        System.out.println("tu letra es: "+letra);
    }
}
