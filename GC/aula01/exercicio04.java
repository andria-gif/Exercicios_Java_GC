import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        double salarioMinimo = 1320.0;

        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");

        double SalarioDigitado = salario.nextDouble();

        double VerificandoQuantidadeDeSalarios = SalarioDigitado / salarioMinimo;

        System.out.println("Você ganha" + VerificandoQuantidadeDeSalarios + "salarios minimos!");

    }
}
