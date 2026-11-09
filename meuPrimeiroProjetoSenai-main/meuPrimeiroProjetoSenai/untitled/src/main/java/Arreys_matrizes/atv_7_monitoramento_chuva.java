import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

  //1. definindo das variáveis

    int area[][] = new int[7][4];
    int TotalArea[] = new int[4];

    // 2. entrada de dados


    for (int i = 0; i < 7; i++) {
        System.out.println("======== DIA " + (i + 1) + " ========");
        for (int j = 0; j < 4; j++) {
            System.out.println("Insira a quantidade de chuva registrada em milímetros(mm) na area " + (j + 1) + ":");
            area[i][j] = input.nextInt();

            // 3.processamento de dados
            TotalArea[j] += area[i][j];  
        }
    }

//4. saida de dados

    System.out.print("\n ========= RESULTADOS =========");
    for (int i = 0; i < 4; i++) {
        System.out.print("\n A quantidade de chuva na area " + (i + 1) + " foi de " + TotalArea[i] + " mm \n" );
        
    }







    input.close();
}
