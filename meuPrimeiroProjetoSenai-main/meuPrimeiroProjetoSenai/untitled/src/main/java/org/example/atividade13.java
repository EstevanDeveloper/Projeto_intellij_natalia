package org.example;
import java.util.Scanner;

class Main13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da transação: ");
        double transacao = entrada.nextDouble();

        if (transacao > 10000) {
            System.out.println("Transação suspeita. Deve ser sinalizada para análise.");
        } else {
            System.out.println("Transação não suspeita.");
        }

        entrada.close();
    }
}