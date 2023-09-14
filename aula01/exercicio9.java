import java.time.Year;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner ano = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = ano.nextInt();

        int anoAtual = Year.now().getValue();

        int idadeAtual = anoAtual - anoNascimento;


        System.out.println("Você tem  " + idadeAtual + " " +
                "anos");


    }
}
