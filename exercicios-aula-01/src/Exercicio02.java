import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner numberUser = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int number = Integer.parseInt(numberUser.nextLine());
        System.out.println("Os números digitados foram: " + number);

    }
}
