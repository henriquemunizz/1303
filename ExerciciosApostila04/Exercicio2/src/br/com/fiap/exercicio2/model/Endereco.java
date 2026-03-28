package br.com.fiap.exercicio2.model;

public class Endereco {

    public String cep;
    public String logradouro;
    public short numero;
    public String complemento;

    public String retornarEndereco() {

        return "" + cep + logradouro + numero + complemento;
    }
}