package on.com.fiap.view;

import javax.swing.*;

public class ExemploCondicao {

    public static void main(String[] args) {


        String alunos = JOptionPane.showInputDialog("Digite o número de alunos");
        int alint = Integer.parseInt(alunos);

        if (alint % 2 == 0) {
            JOptionPane.showMessageDialog(null, "É possível realizar a prova em dupla");

        }
        else{
            JOptionPane.showMessageDialog(null, "Não é possível realizar a prova em dupla");

        }

    }



}
