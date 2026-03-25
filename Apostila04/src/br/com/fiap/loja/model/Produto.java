package br.com.fiap.loja.model;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;
    public boolean emEstoque;
    public float peso;
    public Categoria categoria;
    public double valorFinal;
    public int quantidadeComprada;

    public double calcularDesconto(int quantidadeComprada) {
        double valorFinal = 0;
        if (quantidadeComprada < 5) {
            valorFinal = preco * quantidadeComprada;
        }else if (quantidadeComprada >= 5 && quantidadeComprada < 10) {
            valorFinal = preco * quantidadeComprada - preco * quantidadeComprada * 0.15;
        } else if (quantidadeComprada >= 10) {
            valorFinal = preco * quantidadeComprada - preco * quantidadeComprada * 0.20;
        }


        return valorFinal;
    }
}