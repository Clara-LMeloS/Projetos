package org.example.aula5;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

    int opcao = 0;

    Scanner sc = new Scanner(System.in);
       System.out.println("Cadastro de alunas.");

       while (opcao != 2) {
        if (opcao == 2) {
            break;
        }
        System.out.println("Digite 1 para continuar ou 2 para sair.");
        opcao = sc.nextInt();
        sc.nextLine();


        switch (opcao) {
            case 1:
                Aluna aluna = new Aluna();
                System.out.println("Digite sua primeira nota:");
                aluna.nota1 = sc.nextDouble();
                sc.nextLine();


                System.out.println("Digite sua segunda nota:");
                aluna.nota2 = sc.nextDouble();
                sc.nextLine();


                aluna.media = ((aluna.nota1 + aluna.nota2) / 2);
                System.out.println("Sua média é: " + aluna.media);


                System.out.println("Digite seu nome:");
                aluna.nome = sc.nextLine();


                if (aluna.media >= 6) {
                    System.out.println(aluna.passou = true);
                    System.out.println("Aprovada!");
                } else {
                    System.out.println(aluna.passou = false);
                    System.out.println("Reprovada");
                }
                System.out.printf(
                        "As notas da aluna %s, foram 1: %.1f, e 2: %.1f, sua Média foi: %.2f, Passou: %b\n",
                        aluna.nome, aluna.nota1, aluna.nota2, aluna.media, aluna.passou);
                break;


            case 2:
                System.out.println("Encerrando o sistema, até logo!");
                break;


            default:
                System.out.println("opção inválida");
                break;


        }
    }

}
}
