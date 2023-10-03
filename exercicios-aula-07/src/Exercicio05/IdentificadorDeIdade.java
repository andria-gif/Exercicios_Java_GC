package Exercicio05;

import java.util.Scanner;

public class IdentificadorDeIdade {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = prompt.nextInt();

        if (idade < 0 || idade > 150){
            throw new IdadeInvalidaException("A sua idade é inválida! A idade varia entre 0 a 150 (150 já é mumificado)");
        }
        System.out.println(" A Idade informada foi: "+idade);
    }
}
