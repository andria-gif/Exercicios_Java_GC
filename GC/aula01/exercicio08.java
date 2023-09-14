import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner fila = new Scanner(System.in);

        System.out.println("1- Gestante");
        System.out.println("2- Idoso (a)");
        System.out.println("3- PCD");
        System.out.println("4- Nenhuma das opções acima");
        System.out.println("\n**********************************\n");
        System.out.println("Digite uma das opções acima:");

         int respostaUser = fila.nextInt();

         if (respostaUser<4){
             System.out.println("Você tem direito a fila prioritária");
         }else {
             System.out.println("Você não faz parte do grupo prioritário. " +
                     "Direciona-se para outra fila!");
         }

    }
}
