import java.util.Scanner;

class Main9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o cargo do funcionário: ");
        String cargo = entrada.nextLine();

        if (cargo.equalsIgnoreCase("administrativo") || cargo.equalsIgnoreCase("liderança")) {
            System.out.println("Pode participar do programa de idiomas.");
        } else {
            System.out.println("Não pode participar do programa de idiomas. ");
        }

        entrada.close();
    }
}