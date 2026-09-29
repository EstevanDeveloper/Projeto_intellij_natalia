import java.util.Scanner;

void main() {

    //definindo variáveis
    int[] milho=  new int[7];

    int media = 0;
    int maior = 0;
    int Total = 0;

    Scanner input = new Scanner(System.in);
    //entrada de dados
    for (int i = 0; i < 7; i++) {
        System.out.println("Insira a quantidade de toneladas de milho produzidas na semana " + i + " :");
        milho[i] = input.nextInt();
        //processamento

        Total = Total + milho[i];

        if (maior < milho[i]){
            maior = milho[i];
        };


    }

    media = (milho[0] + milho[1] + milho[2] + milho[3] + milho[4] + milho[5] + milho[6])/7;

    //saida
    System.out.println("A produção total foi de: " + Total);
    System.out.println("A produção media foi de: " + media + " por semana");
    System.out.println("A maior produção foi de: " + maior);


}