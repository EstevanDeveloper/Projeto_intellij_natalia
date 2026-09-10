package org.example;

import java.util.Scanner;

class Main6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o salário: ");
        double salario = entrada.nextDouble();

        if (salario <= 4000) {
            System.out.println("Possui direito ao vale refeição.");
        } else {
            System.out.println("Não possui direito ao vale refeição.");
        }

        entrada.close();
    }
}