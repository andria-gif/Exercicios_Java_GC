package Exercicio06;

public class ExecucaoConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(500.00);

        try {
            conta.saca(900);
        } catch (SaldoInsuficiente excecao) {
            System.out.println(excecao.getMessage());///menssagem de erro automatica
        }

    }
}
