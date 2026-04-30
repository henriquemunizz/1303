package br.com.fiap.vogal.view;

import javax.swing.*;

public class Vogal {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

        if (palavra != null && palavra.matches(".*[aeiouAEIOU].*")) {
            String troca = palavra.replaceAll("[aeiouAEIOU]", "*");
        JOptionPane.showMessageDialog(null, palavra + troca);
        }
        else {JOptionPane.showMessageDialog(null, palavra);}
    }
}