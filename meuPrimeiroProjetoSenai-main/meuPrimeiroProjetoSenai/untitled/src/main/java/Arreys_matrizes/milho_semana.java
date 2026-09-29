import java.util.Scanner;

void main() {

    //definindo variáveis
    int[] temp=  new int[10];


    int maior = 0;


    Scanner input = new Scanner(System.in);
    //entrada de dados

    for (int i = 0; i < 10; i++) {
        System.out.println("insira o valor da temperatura da estufa no dia " + i + " :");
        temp[i] = input.nextInt();
        //processamento


    }

    //saida
    System.out.println("Os dias que passaram de 30 graus foram: ");

    for (int i = 0; i < 10; i++) {
        if (temp[i] > 30) {
            System.out.println("Dia " + i + " com temperatura de " + temp[i]);
        }
    }

}