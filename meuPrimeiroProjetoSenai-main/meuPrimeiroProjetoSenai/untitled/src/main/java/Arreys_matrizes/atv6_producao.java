import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meses = 4;
        int culturas = 3;

        // Matriz 4x3: 4 meses (linhas) x 3 culturas (colunas)
        double[][] producao = new double[meses][culturas];
        double[] totalCultura = new double[culturas];



        // 1. Leitura dos dados de produção
        System.out.println("=== REGISTRO DE PRODUÇÃO ===");
        for (int i = 0; i < meses; i++) {
            System.out.println("\n--- Mês " + (i + 1) + " ---");
            for (int j = 0; j < culturas; j++) {
                System.out.print("Produção da cultura " + j + ": ");
                producao[i][j] = scanner.nextDouble();
            }
        }

        // 2. Cálculo do total de cada cultura (soma das colunas)
        for (int j = 0; j < culturas; j++) {
            for (int i = 0; i < meses; i++) {
                totalCultura[j] += producao[i][j];
            }
        }

        // 3. Exibição dos resultados
        System.out.println("\n===============================");
        System.out.println("   PRODUÇÃO TOTAL POR CULTURA  ");
        System.out.println("===============================");
        for (int j = 0; j < culturas; j++) {
            System.out.println("Cultura " + j + ": " + totalCultura[j] + " toneladas/unidades");
        }

        scanner.close();
    }
