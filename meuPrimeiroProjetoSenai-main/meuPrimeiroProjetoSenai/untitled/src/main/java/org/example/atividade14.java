package org.example;
import java.util.Scanner;

class Main14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o saldo médio mensal: ");
        double saldoMedio = entrada.nextDouble();

        if (saldoMedio > 5000) {
            System.out.println("Cliente possui direito à isenção de tarifa bancária.");
        } else {
            System.out.println("Tarifa bancária mantida.");
        }

        entrada.close();
    }
}