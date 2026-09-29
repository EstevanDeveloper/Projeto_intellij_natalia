import java.util.Scanner;

void main() {

    //definindo variáveis
    int[] talhao=  new int[5];

    int Total = 0;


    Scanner input = new Scanner(System.in);
    //entrada de dados

    for (int i = 0; i < 5; i++) {
        System.out.println("Insira a quantidade produzida pelo talhão " + i + " :");
        talhao[i] = input.nextInt();
        //processamento

        Total = Total + talhao[i];
    }

    //saida



    for (int i = 0; i < 5; i++) {
            System.out.println("A quantidade produzida pelo talhão " + i + " foi de " + talhao[i]);

    }
    System.out.println("O total de hortaliças produzidas foi de " + Total);



}