import java.util.Scanner;

class Main8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Utiliza veículo próprio para trabalhar? (SIM/NÃO): ");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("SIM")) {
            System.out.println("Possui auxílio disponível.");
        } else {
            System.out.println("Não possui auxílio.");
        }

        entrada.close();
    }
}