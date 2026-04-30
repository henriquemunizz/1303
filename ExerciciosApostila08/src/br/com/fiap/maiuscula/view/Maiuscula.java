package br.com.fiap.maiuscula.view;

import javax.swing.*;
import java.sql.SQLOutput;

public class Maiuscula {
    public static void main(String[] args) {


    String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");

    String mudar = palavra.toUpperCase();

   JOptionPane.showMessageDialog(null, mudar);
}
}