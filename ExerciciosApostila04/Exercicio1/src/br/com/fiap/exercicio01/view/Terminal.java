package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;

import java.util.Scanner;

public class Terminal {

    static void main() {

        Aluno aluno = new Aluno();
        Scanner leitor = new Scanner(System.in);
        boolean valido = true;

        System.out.println("Nome do Aluno: ");
        aluno.nome = leitor.nextLine();

        System.out.println("RM: ");
        aluno.rm = leitor.nextInt();

        while (valido) {
            System.out.println("Nota Checkpoint 1: ");
            aluno.cp1 = leitor.nextDouble();
            if (aluno.cp1 < 0 || aluno.cp1 > 10) {
                System.out.println("Digite uma nota Válida!");
                continue;
            }

            System.out.println("Nota Checkpoint 2: ");
            aluno.cp2 = leitor.nextDouble();
            if (aluno.cp2 < 0 || aluno.cp2 > 10) {
                System.out.println("Digite uma nota Válida!");
                continue;
            }
            System.out.println("Nota Challenge 1: ");
            aluno.clg1 = leitor.nextDouble();
            if (aluno.clg1 < 0 || aluno.clg1 > 10) {
                System.out.println("Digite uma nota Válida!");
                continue;
            }
            System.out.println("Nota Challenge 2: ");
            aluno.clg2 = leitor.nextDouble();
            if (aluno.clg2 < 0 || aluno.clg2 > 10) {
                System.out.println("Digite uma nota Válida!");
                continue;
            }
            System.out.println("Nota Global Solution: ");
            aluno.gs = leitor.nextDouble();
            if (aluno.gs < 0 || aluno.gs > 10) {
                System.out.println("Digite uma nota Válida!");
                continue;
            } else {
                aluno.calcularMedia();

                System.out.println("\nNome do Aluno: " + aluno.nome);
                System.out.println("RM" + aluno.rm);
                System.out.println("Nota Final: " + aluno.calcularMedia());
                break;
            }


        }
    }
}
