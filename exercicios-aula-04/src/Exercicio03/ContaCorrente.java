package Exercicio03;

public class ContaCorrente extends Conta {

    @Override
    public double calcularTributos() {
        return this.saldo * 0.01;  // Taxa de 1%
    }
}
