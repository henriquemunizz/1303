package br.com.fiap.view;

import br.com.fiap.exercicio2.model.Cliente;
import br.com.fiap.exercicio2.model.ContaCorrente;
import br.com.fiap.exercicio2.model.Endereco;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        ContaCorrente conta = new ContaCorrente();
        Cliente titular = new Cliente();
        Endereco endereco = new Endereco();
        conta.titular = titular;
        conta.titular.endereco = endereco;
        boolean valido = true;

        System.out.println("Digite o saldo titular: ");
        conta.saldo = entrada.nextDouble();

        System.out.println("Digite o nome do titular: ");
        conta.titular.nome = entrada.nextLine() + entrada.next();

        System.out.println("Digite o CPF do titular: ");
        conta.titular.cpf = entrada.next();

        System.out.println("Digite o CEP: ");
        conta.titular.endereco.cep = entrada.next();

        entrada.nextLine(); // limpa buffer

        System.out.println("Digite o logradouro (rua): ");
        conta.titular.endereco.logradouro = entrada.nextLine();

        System.out.println("Digite o número: ");
        conta.titular.endereco.numero = entrada.nextShort();

        entrada.nextLine(); // limpa buffer

        System.out.println("Digite o complemento: ");
        conta.titular.endereco.complemento = entrada.nextLine();

        while (valido) {
            System.out.println("O que você quer fazer?");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir dados do cliente");
            System.out.println("4. Exibir endereço do cliente");
            System.out.println("5. Sair\n");

            int funcao = entrada.nextInt();

            if (funcao < 1 || funcao > 5) {
                System.out.println("Digite um valor entre 1 e 4!");
                continue;
            }

            if (funcao == 1) {

                System.out.println("Escolha o valor (saldo: "+conta.saldo+"): ");
                double valor = entrada.nextDouble();

                System.out.println("Você tem certeza? (sim ou nao)");
                String certeza = entrada.next();

                if (certeza.equalsIgnoreCase("sim")) {
                    conta.depositar(valor);
                    System.out.println("Depósito realizado!");
                    System.out.println("Saldo Atual: " + conta.saldo);
                } else {
                    System.out.println("\nOperação cancelada.\n");
                    continue; // volta pro menu
                }
            }
            if (funcao == 2) {

                System.out.println("Escolha o valor (saldo: "+ conta.saldo+"): ");
                double valor = entrada.nextDouble();

                System.out.println("Você tem certeza? (sim ou nao)");
                String certeza = entrada.next();

                if (certeza.equalsIgnoreCase("sim")) {
                    conta.retirar(valor);
                    System.out.println("Saque realizado! (" + valor + ")");
                    System.out.println("Saldo Atual: " + conta.saldo);
                } else {
                    System.out.println("\nOperação cancelada.\n");
                    continue;

                    }
                }
                if (funcao == 3) {
                    System.out.println("\n--- Cliente ---\n");
                    System.out.println("Nome: " + conta.titular.nome);
                    System.out.println("CPF: " + conta.titular.cpf);
                    continue;
                }
                if (funcao == 4) {
                    System.out.println("\n--- Endereço ---");
                    System.out.println("CEP: " + conta.titular.endereco.cep);
                    System.out.println("Logradouro: " + conta.titular.endereco.logradouro);
                    System.out.println("Número: " + conta.titular.endereco.numero);
                    System.out.println("Complemento: " + conta.titular.endereco.complemento);
                    continue;
                }
                if (funcao == 5) {
                    System.out.println("Encerrando...");
                    valido = false;
                }
            }
        }
}