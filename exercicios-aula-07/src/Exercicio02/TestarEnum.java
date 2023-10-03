package Exercicio02;

import java.util.Scanner;

public class TestarEnum {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        DiaDaSemana diaDaSemana;

        System.out.println("Digite um dia da semana (por exemplo, SEGUNDA, TERCA, etc.):");
        String dia = prompt.nextLine().toUpperCase();//pegando a mesma string e convertendo para maiuscula

        //fazendo validação da string digitada
        try {
            diaDaSemana = DiaDaSemana.valueOf(dia);
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido.");
            return;
        }
        switch (diaDaSemana) {
            case SEGUNDA -> {
                System.out.println("Pegue um balde de café e VAMO DALE!");
                break;
            }
            case TERCA -> {
                System.out.println("VAMOS DE CURIOSIDADE ALEATÓRIA----->\n");
                System.out.println("Na maior parte das outras línguas românicas, a sua origem são\n" +
                        " nomes de deuses pagãos romanos aos quais os dias eram dedicados, neste caso a terça-feira \n" +
                        "era dedicada a divindade romana Marte (este por sua vez inspirado no deus grego Ares).");
                break;
            }
            case QUARTA -> {
                System.out.println("Mais conhecida como dia NACIONAL DO SOFÁ (segundo os mais velhos)");
                break;
            }
            case QUINTA -> {
                System.out.println("É pré find! Vamos dar o gás que falta pouco p descanso!");
                break;
            }
            case SEXTA -> {
                System.out.println("Bora de sextou???");
                break;
            }
            case  SABADO -> {
                System.out.println("Vai se despedindo do find!");
                break;
            }
            case DOMINGO -> {
                System.out.println("Vamos organizar a semana?");
                break;
            }
        }
    }
}
