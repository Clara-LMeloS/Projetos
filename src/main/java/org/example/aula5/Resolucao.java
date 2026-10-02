package org.example.aula5;

import java.util.Scanner;

public class Resolucao {
    public static void main(String[] args) {


        String nomeLanche;
        double valorLanche;


        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha entre esses lanches: Pizza (R$75,60) " + "ou" +  " Hamburguer (R$27,90).");
        System.out.println("Digite o nome do seu lanche:");
        nomeLanche = sc.nextLine();




        System.out.println("Digite o valor do seu lanche:");
        valorLanche = sc.nextDouble();


        System.out.println("Seu lanche é: " +  nomeLanche + " no valor de R$" + valorLanche);


        if(valorLanche >30){
            System.out.printf("Cupom de desconto no valor de R$5,00 aplicado.\n");
            valorLanche = (valorLanche - 5);
            //= %s  está dizendo para o código onde vai ficar a primeira variável
            System.out.printf(" Sua compra agora sai por: %.2f\n ", + valorLanche);
        } else {
            System.out.printf("Sua compra não ganhou um cupom de desconto\n");
        }
    }
}

