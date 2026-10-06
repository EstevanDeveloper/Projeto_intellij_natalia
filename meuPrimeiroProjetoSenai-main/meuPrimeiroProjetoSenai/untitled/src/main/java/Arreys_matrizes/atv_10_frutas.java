import java.util.Scanner;


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    // dreclarando as veriáveis
    int producao[][] = new int[4][12];
    int maior = 0;
    int anual[] = new int[4];

    //1. Entrada de dados

    System.out.print("========================================");
    System.out.print("\n    CALCULO DE PRODUÇÃO DOS POMARES");
    System.out.print("\n========================================");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 12; j++) {
            System.out.print("\nInsira a produção, em kilos, do pomar "+ (i + 1) +" no mês " + (j + 1) + " :  ");
            producao[i][j] = input.nextInt();

            anual[i] += producao[i][j];


            }

        if (anual[i] > maior){
            maior = anual[i];
        }

    }


    System.out.println("=================  =================");

        System.out.println("A maior produção anual foi " + maior);


    System.out.println("==========================================");

    //saida de dados




    input.close();
}
