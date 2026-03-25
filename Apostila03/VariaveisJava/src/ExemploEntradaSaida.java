//18/03

import java.util.Scanner;

public class ExemploEntradaSaida {

    public static void main(String[] args) {

        //Ler as notas do aluno e calcular a média FIAP
        Scanner leitor = new Scanner(System.in);

        //Declarar as variáveis nescessárias

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.print("Digite a nota da CP1: ");
        double cp1 = leitor.nextDouble(); //Lê um valor do tipo double do teclado

        System.out.print("Digite a nota da CP2: ");
        double cp2 = leitor.nextDouble();

        System.out.print("Digite a nota da GS: ");
        double gs  = leitor.nextDouble();

        System.out.print("Digite a nota do C1: ");
        double challenge1 = leitor.nextDouble();

        System.out.print("Digite a nota da C2: ");
        double challenge2 = leitor.nextDouble();

        double mediaCp = (cp1 + cp2) / 2;
        double mediaChallenge = (challenge1 + challenge2) / 2;
        double mediaFinal = (mediaCp * 0.2) + (mediaChallenge * 0.2) + (gs * 0.6);

        System.out.println(" ");
        System.out.println("Aluno :" + nome);
        System.out.println("Média: " + mediaFinal);

    }
}
