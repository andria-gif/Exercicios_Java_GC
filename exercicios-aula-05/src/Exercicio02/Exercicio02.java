package Exercicio02;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Random random = new Random();
        int[] arrayn = new int[10];

        //gerando os numeros aletórios nos intervalos solicitados
        for (int i = 0; i < arrayn.length; i++) {
            arrayn[i] = random.nextInt(100) + 1;
            //sout para teste
            //System.out.println(arrayn[i]);
        }
        System.out.println("Insira um número e verifique se esse número " +
                "está presente no array: ");
        double chuteUser = prompt.nextInt();
        boolean encontrado = false;

        ///verificando se o chute esta no array
        for (int numero : arrayn) {
            if (numero == chuteUser) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Parabéns você acertou!");
        } else {
            System.out.println("O número " + chuteUser + " não está presente no array");
        }


    }
}
