package org.example.aula1;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        //numero1
        int alunaA = 10;
        int alunaB = 3;

        System.out.println("Se A = 10 e B = 3: ");
        if (alunaA == alunaB) {
            System.out.println("São notas iguais");
        } else if (alunaA > alunaB) {
            System.out.println("A nota da aluna A é maior que a da aluna B ");
        } else {
                System.out.println("A nota da aluna A é menor que a da aluna B ");
            }


            alunaA = 3;
            alunaB = 10;

            System.out.println("Se A = 3 e B = 10: ");
            if (alunaA == alunaB) {
                System.out.println("São notas iguais");
            } else if (alunaA > alunaB) {
                System.out.println("A nota da aluna A é maior que a da aluna B ");
            } else {
                System.out.println("A nota da aluna A é menor que a da aluna B");
            }

            alunaA = 5;
            alunaB = 5;
            System.out.println("Se A = 5 e B = 5: ");

            if (alunaA == alunaB) {
                System.out.println("São notas iguais");
            } else if (alunaA > alunaB) {
                System.out.println("A nota da aluna A é maior que a da aluna B ");
            } else {
                System.out.println("A nota da aluna A é menor que a da aluna B");
            }

        }
    }


