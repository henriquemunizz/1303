package br.com.fiap.model.elevador.model;

import javax.swing.*;

public class Elevador {
    private int capacidade;
    private int qtdAndares;
    private int qtdAtualPessoas;





    public Elevador(int capacidade, int qtdAndares, int qtdAtualPessoas) {
        this.capacidade = capacidade;
        this.qtdAndares = qtdAndares;
        this.qtdAtualPessoas = qtdAtualPessoas;
    }

    public void entra(int qtdAtualPessoas){
        if (qtdAtualPessoas > capacidade){
            JOptionPane.showMessageDialog(null, "Inválido");
        }else {
            JOptionPane.showMessageDialog(null, qtdAtualPessoas += qtdAtualPessoas);

        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdAtualPessoas() {
        return qtdAtualPessoas;
    }

    public void setQtdAtualPessoas(int qtdAtualPessoas) {
        this.qtdAtualPessoas = qtdAtualPessoas;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdAndares() {
        return qtdAndares;
    }

    public void setQtdAndares(int qtdAndares) {
        this.qtdAndares = qtdAndares;
    }
}
