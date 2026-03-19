package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Ler os dados do produto
        //Criar o objeto do produto
        //Atribuir os valores ao objeto

        //Exibir os valores dos atributos

        Scanner leitor = new Scanner(System.in);
        Produto produto = new Produto();
        
        System.out.print("Nome do produto: ");
        produto.nome = leitor.next();

        System.out.print("Em estoque (true/false): ");
        produto.emEstoque = leitor.nextBoolean();

        System.out.print("Preço: ");
        produto.preco = leitor.nextDouble();

        System.out.print("Quantidade: ");
        produto.quantidade = leitor.nextInt();

        System.out.print("Peso(g): ");
        produto.peso = leitor.nextFloat();

        System.out.println("--- DADOS PRODUTO ---");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);
        System.out.println("Em estoque: " + produto.emEstoque);
        System.out.println("Peso: " + produto.peso);
    }
}
