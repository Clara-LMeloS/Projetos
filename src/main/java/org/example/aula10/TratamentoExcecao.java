package org.example.aula10;

public class TratamentoExcecao {
    public static void main(String[] args) {

        //debug de erro!! IMPORTANTE PRA DEDEU
        try {
            int resultado = 10 / 5;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua.");

    }
}