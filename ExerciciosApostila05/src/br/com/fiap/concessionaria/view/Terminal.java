package br.com.fiap.concessionaria.view;

import br.com.fiap.concessionaria.model.Carro;
import br.com.fiap.concessionaria.model.Cor;

public class Terminal {
    public static void main(String[] args) {
        Cor branco = new Cor();
        branco.alterarCor(255,255, 255, "Branco");
        Carro celta = new Carro();

        celta.setModelo("Celta");
        celta.setAnoFabricacao(2005);
        celta.setQuantidadeLugares(5);
        celta.setQuantidadePortas(2);
        celta.setComprimento(4.5);
        celta.setMotor(1);
        celta.setPlaca("ABC-1234");
        celta.setCor(branco);

        System.out.println("Carro: " + celta.getModelo());
        System.out.println("Ano: " + celta.getAnoFabricacao());
        System.out.println("Quantidade de lugares: " + celta.getQuantidadeLugares());
        System.out.println("Quantidade de portas: " + celta.getQuantidadePortas());
        System.out.println("Comprimento: " + celta.getComprimento());
        System.out.println("Motor: " + celta.getMotor());
        System.out.println("Placa: " + celta.getPlaca());
        System.out.println("Cor: " + celta.getCor().getNome());
    }
}
