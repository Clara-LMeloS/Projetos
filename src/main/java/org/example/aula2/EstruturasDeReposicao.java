package org.example.aula2;

public class EstruturasDeReposicao {
    public static void main(String[] args) {

        //Numero 1
        int idade = 17;


        if (idade < 13) {
            System.out.println("Criança.");


        } else if (idade >= 13 && idade <= 17) {


            System.out.println("Adolescente.");
        } else if (idade >= 18 && idade <= 59) {


            System.out.println("Adulto.");


        } else {
            System.out.println("Idoso.");
        }


        //Numero 2
        double saldoConta = 0;
        double valorDaCompra = 320.00;
        double valorInicial = 500.00;


        saldoConta = valorInicial;


        if (saldoConta >= valorDaCompra) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Saldo insuficiente " + (valorDaCompra - saldoConta));
        }


        //Numero 3
        int opcao = 1;


        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;


            case 2:
                System.out.println("Cappuccino");
                break;


            case 3:
                System.out.println("Chocolate quente");
                break;


            case 4:
                System.out.println("Chá");
                break;


            default:
                System.out.println("Opção inválida");
                break;
        }


        //Numero 4
        int idade1 = 17;
        boolean temAutorizacao = true;


        if (idade >= 18 || temAutorizacao == true) {
            System.out.println("Acesso liberado!");


        } else {
            System.out.println("Acesso negado!");
        }


        if (idade >= 18 && temAutorizacao == true) {


            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado!");
        }

        //Desafio
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;


        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovada!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.printf("Recuperação.");
        } else {
            System.out.println("Reprovada.");
        }
        //foi utilizado esse printf para precisão correta da resposta. Ele formata nossa resposta para melhor leitura
        /*Estou colocando cada um das coisas que eu quero: ordem de variável, quantidade de caracteres*/
        System.out.printf("Sua média é: %.2f\n", media);


    }
}

