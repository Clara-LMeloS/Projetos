package org.example.aula5;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        String nomeCompleto;
        int anoNascimento;


        Scanner sc = new Scanner(System.in);


        System.out.println("Cadastro de usuário.");
        System.out.println("Digite seu ano de nascimento:");
        anoNascimento = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite seu nome completo:");
        nomeCompleto = sc.nextLine();


        System.out.println("O usuário nome: " +  nomeCompleto + " nasceu em " + anoNascimento);






    }
}

