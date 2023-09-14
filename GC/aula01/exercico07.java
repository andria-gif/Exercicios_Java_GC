import java.util.Scanner;

public class exercico07 {

    public static void main(String[] args) {
        Scanner consorcio = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int idade = consorcio.nextInt();

        if (idade < 18) {
            System.out.println("Você não tem a idade minima para comprar um carro!");
        } else if (idade <= 18) {
            System.out.println("Qual o seu sálario?");
            double salario = consorcio.nextInt();
            if (salario >= 2000) {
                System.out.println("Você  já pode comprar um carro!");
            } else {
                System.out.println("Seu salário não é o suficiente para comprar um carro!");
            }
        }
    }
}



