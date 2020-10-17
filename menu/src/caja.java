import jdk.nashorn.internal.scripts.JO;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;

public class caja {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float in,saldoAc,saldoRes;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("cajero\n 1. Ingresar deposito\n 2. Retirar deposito\n 3. Salir"));
        switch (opcion){
            case 1: in = Integer.parseInt(JOptionPane.showInputDialog("cuanto ingresara"));
                    saldoAc=saldo_inicial+in;
                    JOptionPane.showMessageDialog(null,"este dinero tiene en cuenta "+saldoAc);
            break;
            case 2: in = Integer.parseInt(JOptionPane.showInputDialog("cuanto Sacara"));
                    if (in>saldo_inicial){
                        JOptionPane.showMessageDialog(null,"no cuenta con el salgo suficiente");
                    }
                    else {
                        saldoRes=saldo_inicial-in;
                        JOptionPane.showMessageDialog(null,"estud retiro "+in+", Le quedan "+saldoRes+" en la cuenta");
                    }
                    break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null,"esa opcion no existe");
        }
    }
}
