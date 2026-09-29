import java.util.Scanner;

void main() {

    //definindo variáveis
    int[] temp=  new int[8];



    Scanner input = new Scanner(System.in);
    //entrada de dados

    for (int i = 0; i < 8; i++) {
        System.out.println("insira o percentual de umidade na area " + i + " :");
        temp[i] = input.nextInt();
        //processamento


    }

    //saida
    System.out.println("As areas que possuem umidade inferior a 40% são: ");

    for (int i = 0; i < 8; i++) {
        if (temp[i] < 40) {
            System.out.println("Area" + i + " com percentual de umidade " + temp[i]);
        }
    }

}