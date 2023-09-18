import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner fatorial = new Scanner(System.in);

        System.out.println("Digite um número que seja fatorial: ");
        int fatorialUser = fatorial.nextInt();


        int fatorialEscolhido = fatorialUser;

        if (fatorialEscolhido < 0) {
            System.out.println("O número não pode ser negativo");

        }
        for (int i = fatorialEscolhido - 1; i > 0; i--) {

            int result = fatorialEscolhido * i;
            fatorialEscolhido = result;


        }
        System.out.println("O fatorial de " + fatorialUser + "é quivalente a " + fatorialEscolhido);
    }
}
