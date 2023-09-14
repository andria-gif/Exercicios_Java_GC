package aula02;

import java.util.Scanner;

public class exercico04 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Vamos Calcular!");
        System.out.println("****************************");
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = prompt.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = prompt.nextInt();

        System.out.println("\n****************************\n");

        System.out.println("\nAgora escolha a operação que deseja realizar -----> \n");

        Scanner menu = new Scanner(System.in);

        System.out.println("\n****************************\n");
        System.out.println("1- Multipicação");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Adição");
        System.out.println(" -----> ATENÇÃO DIGITE O NÚMERO 5 A QUALQUER MOMENTO DA OPERAÇÃO PARA SAIR DA CALCULADORA <-----");



        int escolha = menu.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("O resultado da sua multiplicação foi:  " + (primeiroNumero * segundoNumero));
                break;
            case 2:
                System.out.println("O resultado da sua subtração foi: " + (primeiroNumero - segundoNumero));
                break;
            case 3:
                System.out.println("O resultado da sua divisão foi: "+ (primeiroNumero/segundoNumero));
                break;
            case 4:
                System.out.println("O resultado da sua adição  foi: "+ (primeiroNumero+segundoNumero));
                break;
            case 5:
                System.out.println("Você da saiu da operação!");
                break;
            default:
                System.out.println("Opção invalidade! Digite uma das nossas opções!");

        }
    }
}
