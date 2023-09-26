package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        //Peça ao usuário para inserir 5 números inteiros.
        System.out.println("Digite o primeiro número inteiro: ");
        double number1 = prompt.nextInt();
        System.out.println("Didite o segundo numero inteiro: ");
        double number2 = prompt.nextInt();
        System.out.println("Didite o terceiro numero inteiro: ");
        double number3 = prompt.nextInt();
        System.out.println("Didite o quarto numero inteiro: ");
        double number4 = prompt.nextInt();
        System.out.println("Didite o quinto e último numero inteiro: ");
        double number5 = prompt.nextInt();

        //Armazene esses números em um array.
        double array[] = {number1, number2, number3, number4, number5};
        //inicializando a soma
        double soma = 0;

        for (int i= 0; i<array.length; i++){
            soma = soma + array[i];
        }

        System.out.println("A soma dos números insiridos é: \n" + soma);
        double media = soma / 5;
        System.out.println("A média dos números inseridos é: " + media);

    }
}
