import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner numberUser = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double number1 = numberUser.nextInt();

        System.out.println("Digite o segundo número");
        double number2 = numberUser.nextInt();

        System.out.println("Digite o terceiro número");
        double number3 = numberUser.nextInt();

        double numbersDigitados[] = {number1, number2, number3};

        for (int n = 1; n < numbersDigitados.length - 1; n++) {
            for (int i = 0; i < numbersDigitados.length - 1; i++) {
                if (numbersDigitados[i] > numbersDigitados[i + 1]) {
                    double result = numbersDigitados[i];
                    numbersDigitados[1] = numbersDigitados[i + 1];
                    numbersDigitados[i + 1] = result;
                }
            }

        }
        System.out.println("O menor número digitado é:" + numbersDigitados[0]);
        System.out.println("O maior número digitado é:" + numbersDigitados[1]);
        System.out.println("A média aritimética entre eles é:" + (numbersDigitados[0] + numbersDigitados[1] + numbersDigitados[2] / 3));
    }
}
