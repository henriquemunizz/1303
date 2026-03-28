package br.com.fiap.exercicio01.model;

public class Aluno {

    public String nome;
    public int rm;
    public double cp1, cp2, clg1, clg2, gs;

    public double calcularMedia() {
       double mediaCp = (cp1 + cp2) / 2;
       double mediaClg = (clg1 + clg2) / 2;

        return mediaCp * 0.2 + mediaClg * 0.2 + gs * 0.6;
    }

}

