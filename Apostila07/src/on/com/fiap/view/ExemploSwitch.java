package on.com.fiap.view;

import javax.swing.*;

public class ExemploSwitch {
    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Digite um número");
        double n1 = Double.parseDouble(numero1);
        String numero2 = JOptionPane.showInputDialog("Digite outro número");
        double n2 = Double.parseDouble(numero2);

        String operador = JOptionPane.showInputDialog("Digite uma operação" +
                "\n1. +" +
                "\n2. -" +
                "\n3. /" +
                "\n4. *");
        int op = Integer.parseInt(operador);


        switch (op){
            case 1:
                JOptionPane.showMessageDialog(null, "A soma é " + (n1 + n2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "A subtração é " + (n1 - n2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "A divisão é " + (n1 / n2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "A multiplicação é " + (n1 * n2));
                break;







        }
    }
}
