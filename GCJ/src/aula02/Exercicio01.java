package aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        

        System.out.println("Digite um número maior: ");
        int numeroMaior = prompt.nextInt();
        System.out.println("Digite um número menor: ");
        int numeroMenor = prompt.nextInt();

        for(int i = numeroMenor; i <= numeroMaior ; i++){
            System.out.println(" Os números primos compreendidos entre um intervalo fornecido por você são: "+i);
        }
    }
}
///no laço de repetição acima estamos verificando os dois extremos e incrementando no final
//para que assim eu consiga pegar os intervalos entre ambos.