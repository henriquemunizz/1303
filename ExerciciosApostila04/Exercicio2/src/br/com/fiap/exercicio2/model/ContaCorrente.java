package br.com.fiap.exercicio2.model;

public class ContaCorrente {

    public double saldo;
    public Cliente titular;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("");
    }
    public void retirar(double valor) {
        saldo -= valor;
    }
    public double retornarSaldo(){
        return saldo;
    }
}
