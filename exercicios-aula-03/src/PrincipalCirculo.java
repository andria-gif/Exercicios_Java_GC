import java.util.Scanner;

public class PrincipalCirculo {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Circulo primeiroCirculo = new Circulo();

        System.out.println("Digite o valor do raio: ");
        double raio = prompt.nextDouble();
        primeiroCirculo.setRaio(raio);

        double circoferencia = primeiroCirculo.CalcularCircuferencia();
        double area = primeiroCirculo.CalculaArea();


    }
}