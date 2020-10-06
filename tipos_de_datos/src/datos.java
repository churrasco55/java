import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        final String dato = "hola que tal bro"; //con "Final" declaramos una constante

        System.out.println(dato);
        //......
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("mete un numero rey: ");
        numero = entrada.nextInt();

        System.out.println("tu numero es: "+numero);
    }
}
