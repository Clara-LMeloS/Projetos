package org.example.aula5;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int opcaoCliente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para camisas, 2 para calças e 3 para sair.");


        do {
            opcaoCliente = sc.nextInt();


            switch (opcaoCliente) {
                case 1:
                    System.out.println("Ver camisas");
                    break;
                case 2:
                    System.out.println("Ver calças");
                    break;
                case 3:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcaoCliente != 3);

    }
}


