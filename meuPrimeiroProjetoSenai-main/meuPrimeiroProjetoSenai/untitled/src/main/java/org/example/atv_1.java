import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


    public static void main(String[] args) {
        String caminhoArquivo = "/C://Users//57041669890//Downloads//ativos.csv/";

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String host = dados[0];
                System.out.println("Host: " + host);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
