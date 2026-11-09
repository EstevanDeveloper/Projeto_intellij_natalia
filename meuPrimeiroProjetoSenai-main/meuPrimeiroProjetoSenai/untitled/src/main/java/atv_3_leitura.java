import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public static void main(String[] args) throws IOException {
    try {
        BufferedReader leitor = new BufferedReader(new FileReader("C:/Users/57041669890/Downloads/ativos.csv"));
        BufferedWriter escritor = new BufferedWriter(new FileWriter("C:/Users/57041669890/Downloads/relatorio.txt"));

        String linha = leitor.readLine();



        while ((linha = leitor.readLine()) != null){
            String[] dados = linha.split(",");

            String host = dados[0];
            String ip = dados[1];
            String so = dados[2];


            String criticidade;

            if(so.contains("Windows")){
                escritor.write( ip + "," + so + "\n");
            }



        }

        leitor.close();
        escritor.close();

        System.out.print("O realatorio foi criado com sucesso");

    }catch (IOException e){
        System.out.println("Erro: "+ e.getMessage());
    }
}
