import java.util.Scanner;

public class exercicio10 {
    public static void main (String[]args){
        Scanner temp = new Scanner(System.in);

        System.out.println("Insira uma temperatura em Graus Celsius: ");
        int tempUser = temp.nextInt();

        int tempTransform = (tempUser * 9/5) + 32;

        System.out.println("A temperatura digitada em Celsius convetida para Fahrenheit é "
                + tempTransform +" Fahrenheit.");

    }
}
