import java.util.Scanner;

public class exercicio12 {
    public static void main(String[]args){
        Scanner dol = new Scanner(System.in);

        System.out.println("Insira a quantia em dólares que deseja converter: ");
        double dolUser = dol.nextInt();

        System.out.println("Insira a taxa de cambio atual: ");
        double taxaCambio = dol.nextInt();

        double resul = dolUser * taxaCambio;

        System.out.println("O resultado da converção é: " +resul);

    }
}
