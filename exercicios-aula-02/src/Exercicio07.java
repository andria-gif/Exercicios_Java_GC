import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Random ramdom = new Random(); //gerador de número aleatório

        int espartanos = 300;
        int soldadoInimigos = ramdom.nextInt(30000) + 1; // Gera um número aleatório entre 1 e 300000

        System.out.println("\nBem-vindo ao jogo de adivinhação dos 300 espartanos!\n");

        System.out.println("\nLeônidas está pedindo para você adivinhar quantos soldados inimigos eles enfrentarão.\n");


        while (true) {
            System.out.print("Digite seu palpite: ");
            int palpiteUser = prompt.nextInt();
            if (palpiteUser == soldadoInimigos) {
                System.out.println("UHUUUUUL! Você acertou. Os 300 espartanos enfrentarão " + soldadoInimigos + " inimigos.");
                break;
            } else if (palpiteUser < soldadoInimigos) {
                System.out.println("Um pouco mais! Tente novamente!");
            } else {
                System.out.println("Pouco menos! Tente novamente!");
            }
        }
    }
}