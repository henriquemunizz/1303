package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Placa do Carro: ");
        carro.setPlaca(entrada.next());
        System.out.print("Setor da Vaga: ");
        carro.setSetor(entrada.next().charAt(0));
        System.out.print("Número da Vaga: ");
        carro.setNumeroVaga(entrada.nextInt());
        System.out.print("Vaga Preferencial?: ");
        carro.setPreferencial(entrada.nextBoolean());
        System.out.print("Hora de Entrada: ");
        carro.setHoraEntrada(entrada.next());
        System.out.print("Hora de Saída: ");
        carro.setHoraSaida(entrada.next());
        System.out.print("Valor a Pagar: ");
        carro.setValor(entrada.nextDouble());

        System.out.println("\nPlaca do carro: " + carro.getPlaca());
        System.out.print("Setor:" + carro.getSetor() + "Vaga: " + carro.getNumeroVaga());
        System.out.println("Vaga Preferencial?: " + carro.isPreferencial());
        System.out.println("Entrada: " + carro.getHoraEntrada());
        System.out.println("Saída: " +  carro.getHoraSaida());
        System.out.print("Valor a Pagar: " + carro.getValor());

    }
}
