package org.example.aula5;

public class Atividade4 {
    public static void main(String[] args) {


        Pet gato = new Pet();
        Pet cavalo = new Pet();


        gato.nome = "Annabela Toicinha";
        gato.raca = "SRD";
        gato.peso = 8.4;


        cavalo.nome = "Patrício";
        cavalo.raca = "Kiger Mustang";
        cavalo.peso = 500.00;


        System.out.println("Os dados do seu gato são, respectivamente: "
                + "Nome: " + gato.nome + ", "
                + "Raça: " + gato.raca + ", "
                + "Peso: " + gato.peso + ".");
        System.out.println("Os dados do seu cavalo são, respectivamente: "
                + "Nome: " + cavalo.nome + ", "
                + "Raça: " + cavalo.raca + ", "
                + "Peso: " + cavalo.peso + ".");


    }
}


