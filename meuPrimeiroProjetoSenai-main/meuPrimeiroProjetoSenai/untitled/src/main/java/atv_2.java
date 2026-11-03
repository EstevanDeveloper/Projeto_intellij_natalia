import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public static void main(String[] args) {
    String caminhoArquivo = "/C://Users//57041669890//Downloads//ativos.csv/";

    int Total = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        while ((linha = br.readLine()) != null) {

            Total += 1;

        }
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
    }

    System.out.println("O total de registros é de " + Total +" registros");
}
