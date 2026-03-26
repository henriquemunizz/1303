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
        double valorFinal = preco * quantidadeComprada;
        if (quantidadeComprada < 5) {
            valorFinal = preco * quantidadeComprada;
        }else if (quantidadeComprada >= 5 && quantidadeComprada < 10) {
            valorFinal = valorFinal * 0.85;
        } else if (quantidadeComprada >= 10) {
            valorFinal = valorFinal * 0.80;
        }

        return valorFinal;
    }
}