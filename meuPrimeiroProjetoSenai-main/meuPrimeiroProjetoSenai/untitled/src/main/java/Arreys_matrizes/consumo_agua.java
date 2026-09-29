import java.util.Scanner;

void main() {

    //definindo variáveis
    int[] agua=  new int[12];


    int maior = 0;


    Scanner input = new Scanner(System.in);
    //entrada de dados

    for (int i = 0; i < 12; i++) {
        System.out.println("insira o valor de consumo de agua no setor " + i + " :");
        agua[i] = input.nextInt();
        //processamento


        if (agua[i] > maior){
            maior = agua[i];
        }

    }

    //saida



    for (int i = 0; i < 12; i++) {
        if (agua[i] >= maior) {
            System.out.println("O setor que mais consumiu agua foi o setor: " + i);
        }
    }



}