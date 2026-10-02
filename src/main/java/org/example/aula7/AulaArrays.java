package org.example.aula7;

import java.util.Scanner;

public class AulaArrays {
    public static void main(String[] args) {


        // 1 — Crie um array com os nomes de 5 pessoas.
        // Mostre o primeiro, o terceiro e o último.

        String[] alunas = {"Ana Catarina", "Maria Bethania", "Flora Bela", "Annabela Toicinha", "Canjica"};
        System.out.println(alunas[0]);
        System.out.println(alunas[2]);
        System.out.println(alunas[4]);


        //  2 — Crie um array com as notas {8, 6, 10, 7, 9}.
        // Usando um laço, mostre todas, uma por linha, assim: "Nota 1:8".


        int[] notas = {8, 6, 10, 7, 9};


        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + (i + 1) + ": " + notas[i]);

            //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.


            double[] notas1 = {8, 6, 10, 7, 9};
            double soma = 0;


            for (int i1 = 0; i < notas1.length; i++) {
                soma += notas1[i1];
            }
            double media = soma / notas1.length;


            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);


            //4 — Peça 5 números para a pessoa, guarde num array,
            // e depois mostre todos de trás pra frente.


            int numero1;
            int numero2;
            int numero3;
            int numero4;
            int numero5;


            System.out.println("Digite 5  inteiros");
            Scanner sc = new Scanner(System.in);
            numero1 = sc.nextInt();
            numero2 = sc.nextInt();
            numero3 = sc.nextInt();
            numero4 = sc.nextInt();
            numero5 = sc.nextInt();


            System.out.printf("\n");
            int[] valores = {numero1, numero2, numero3, numero4, numero5};
            System.out.println(valores[4]);
            System.out.println(valores[3]);
            System.out.println(valores[2]);
            System.out.println(valores[1]);
            System.out.println(valores[0]);

        }

    }
}

