import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner voto = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = voto.nextInt();

        if (idade < 16) {
            System.out.println("Você não tem a idade minima para votar!");
        } else if (idade >= 16 && idade < 18 || idade >= 65) {
            System.out.println("Seu voto é opcional!");
        } else {
            System.out.println("Seu voto é obrigatório");
        }

    }
}
