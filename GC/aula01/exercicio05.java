import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner horas = new Scanner(System.in);

        int segundosMax = 86400;

        System.out.println("Digite um horário: ");
        int hora = horas.nextInt();

        System.out.println("Digite os minutos: ");
        int minutos = horas.nextInt();

        System.out.println("Digite os segundos: ");
        int segundos = horas.nextInt();

        int resultSegundos = (hora * 3600) + (minutos * 60) + segundos;

        System.out.println("Atualmente se passaram " + resultSegundos +
                " segundos desde de a desde as 0h00min0s e faltam " + (segundosMax - resultSegundos) +
                " segundos até o fim do dia.");
    }
}
