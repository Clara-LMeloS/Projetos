package org.example.aula8;

public class Utilidades {
    //2 — Crie um metodo saudar(String nome)
    // que imprime "Olá, [nome]! Tudo bem?".
    // Chame ele três vezes, passando nomes diferentes.

    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");


    }
    //3 — Crie um metodo dobro(int numero)
    // que devolve o dobro do número recebido.
    // No main, chame ele e mostre o resultado.


    static void dobro(int numero) {
        System.out.println("o dobro do número é " + (numero * 2));
    }

    //4 — Crie um metodo calcularMedia(double n1, double n2)
    // que devolve a média das duas notas.
    // No main, peça as duas notas com Scanner
    // e mostre a média com duas casas decimais.


    static void calcularMedia(double n1, double n2) {
        System.out.printf("a média é:%.2f ", (n1 + n2) / 2);
    }


//5 — Crie um metodo ehMaiorDeIdade(int idade)
// que devolve true ou false.
// No main, peça a idade
// e use o retorno do metodo dentro de um if para imprimir
// se a pessoa é maior ou menor de idade.


    static void ehMaiorDeIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior idade");
        } else {
            System.out.println("Menor idade");
        }

    }

    //6 — Crie três métodos com o mesmo nome somar:
    //um que recebe dois inteiros
    //um que recebe três inteiros
    //um que recebe dois decimais
    //No main, chame os três e veja o Java escolher sozinho
    // qual usar.
    static void somar (int a, int b) {
        System.out.println("opção 1");
    }
    static void somar (int c, int d, int e) {
        System.out.println("opção 2");
    }
    static void somar (double f, double g) {
        System.out.println("opção 3");
    }

    //7 — Crie dois métodos chamados saudacao:
    //um sem parâmetro, que imprime "Olá!"
    //um que recebe um nome, e imprime "Olá, [nome]!"


    static void saudacao(){
        System.out.print("Olá!");
    }

    static void saudacao(String nome){

        System.out.println("Olá, " + nome);
    }//  System.out.println("Olá, " + nome + "! Tudo bem?");



}
