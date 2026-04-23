package on.com.fiap.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {

    public static void main(String[] args) {

        String mediaStg = JOptionPane.showInputDialog("Digite a média do aluno");
        double media = Double.parseDouble(mediaStg);


        if (media >10 || media <0){
            JOptionPane.showMessageDialog(null, "Nota inválida");

        }
        else if (media >= 6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (media >= 4 && media <= 5.9) {
            JOptionPane.showMessageDialog(null, "Exame");
        } else if (media < 4) {
            JOptionPane.showMessageDialog(null, "Reprovado");
        } else if (media >10 || media <0){
            JOptionPane.showMessageDialog(null, "Nota inválida");

        }
    }
}
