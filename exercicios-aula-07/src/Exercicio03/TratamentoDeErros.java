package Exercicio03;

import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println("Digie um número inteiro: ");
            num1 = prompt.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            num2 = prompt.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Número inválida. Por favor, insira um número inteiro.");
        } finally {
            prompt.close();
        }
        System.out.println("O primeiro número digitado foi:"  +num1 + "\n" +
                "O segundo número digitado foi: "+num2);

    }
}
