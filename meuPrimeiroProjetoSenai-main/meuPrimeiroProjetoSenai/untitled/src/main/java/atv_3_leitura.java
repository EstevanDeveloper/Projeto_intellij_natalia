import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public static void main(String[] args) throws IOException {
    int totalAtivos = 0;
    int linux = 0;
    int windows = 0;
    int firewall = 0;

    try {
        BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/57041669890/Downloads/ativos.csv"));
        BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/57041669890/Downloads/relatorio.txt"));

        String linha = leitor.readLine();
        if (linha != null) {

            escritor.newLine();
        }

        // 1. Ler arquivo e classificar sistemas
        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(",");

            if (dados.length >= 3) {
                String host = dados[0];
                String ip = dados[1];
                String so = dados[2];

                totalAtivos++; // Incrementa o total de ativos


                // Classificação e contagem por sistema operacional
                if (so.toLowerCase().contains("linux")) {
                    linux++;

                } else if (so.toLowerCase().contains("windows")) {
                    windows++;
                }

                // Escreve os dados atualizados no novo arquivo

            }


        }

        escritor.write("Windows: " + windows + "\n" );
        escritor.write( "Linux: " + linux +"\n");
        escritor.write("Total: " + totalAtivos + "\n");

        escritor.newLine(); // Essencial para pular linha no arquivo de saída

        leitor.close();
        escritor.close();

        // 3. Exibir relatório final no console
        System.out.println("=== RELATÓRIO DE ATIVOS ===");
        System.out.println("Total de ativos: " + totalAtivos);
        System.out.println("Quantidade Linux: " + linux);
        System.out.println("Quantidade Windows: " + windows);
        System.out.println("\nO relatório foi criado com sucesso!");

    } catch (IOException e) {
        System.out.println("Erro: " + e.getMessage());
    }
}
