package br.com.fiap.apostila08.view;

import javax.swing.*;


public class TesteString2 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Digite seu e-mail");
        int posicao = email.indexOf("@");

        if (posicao != -1) {
            String dominio = email.substring(posicao + 1);
            String usuario = email.substring(0, posicao);

            JOptionPane.showMessageDialog(
                    null,
                    String.format("Email validado!\nDomínio: %s\nUsuário: %s", dominio, usuario)
            );
        }else{
            JOptionPane.showMessageDialog(null, "email inválido: " + email);

        }
    }
}

