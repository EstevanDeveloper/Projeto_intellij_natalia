package org.example;
import java.util.Scanner;

class Main11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor investido: ");
        double investimento = entrada.nextDouble();

        if (investimento <= 10000) {
            System.out.println("Categoria: Bronze.");
        } else if (investimento <= 50000) {
            System.out.println("Categoria: Prata.");
        } else if (investimento <= 100000) {
            System.out.println("Categoria: Ouro.");
        } else {
            System.out.println("Categoria: Platinum.");
        }

        entrada.close();
    }
}