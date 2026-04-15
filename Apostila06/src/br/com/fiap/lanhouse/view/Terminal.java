package br.com.fiap.lanhouse.view;

import br.com.fiap.lanhouse.model.Computador;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Computador pc = new Computador(entrada.nextLine(),
                entrada.nextLine(),
                entrada.nextDouble(),
                entrada.nextInt(),
                entrada.nextBoolean(),
                entrada.nextInt());

        Computador pichau = new Computador(2, "I9");

    }
}
