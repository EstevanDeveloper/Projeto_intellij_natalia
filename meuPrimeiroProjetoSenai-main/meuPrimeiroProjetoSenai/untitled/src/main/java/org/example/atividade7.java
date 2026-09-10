import java.util.Scanner;

class Main7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tempo de empresa em meses: ");
        int tempoEmpresa = entrada.nextInt();

        if (tempoEmpresa > 3) {
            System.out.println("O plano de saúde está disponível. ");
        } else {
            System.out.println("O plano de saúde não está disponível. ");
        }

        entrada.close();
    }
}