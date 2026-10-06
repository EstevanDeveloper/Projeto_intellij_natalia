import java.util.Scanner;

public class atv_8_controle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        int[][] focos = new int[tamanho][tamanho];

        // 1. Leitura dos dados da matriz
        System.out.println("=== REGISTRO DE FOCOS DE PRAGAS ===");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Digite a quantidade de focos na posição [" + i + "][" + j + "]: ");
                focos[i][j] = scanner.nextInt();
            }
        }

        // 2. Inicialização das variáveis para encontrar o maior valor
        int maiorFoco = focos[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        // 3. Busca pelo maior número de focos
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (focos[i][j] > maiorFoco) {
                    maiorFoco = focos[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // 4. Exibição do resultado
        System.out.println("\n=============================================");
        System.out.println("Maior quantidade de focos encontrada: " + maiorFoco);
        System.out.println("Região/Posição: Linha " + linhaMaior + ", Coluna " + colunaMaior);
        System.out.println("=============================================");

        scanner.close();
    }
}