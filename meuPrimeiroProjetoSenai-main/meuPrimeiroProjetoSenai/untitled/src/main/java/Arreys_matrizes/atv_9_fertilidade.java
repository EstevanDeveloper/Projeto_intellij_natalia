import java.util.Scanner;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // dreclarando as veriáveis
        int indices[][] = new int[6][6];
        int media[] = new int[6];
        int soma[] = new int[6];

        //1. Entrada de dados
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Insira os indices de fertilidade na posição ["+ i +"]["+ j +"]:   ");
                indices[i][j] = input.nextInt();

            soma[i] += indices[i][j];
            }

            //2. Calculando as médias
            media[i] = soma[i]/6;

        }


        System.out.println("================= MEDIAS =================");
        for (int i = 0; i < 6; i++) {

            System.out.println("A média da linha "+ i + " é " + media[i]);

        }
        System.out.println("==========================================");

        //saida de dados




        input.close();
    }
