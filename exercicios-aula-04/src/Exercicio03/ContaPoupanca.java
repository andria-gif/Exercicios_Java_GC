package Exercicio03;

public class ContaPoupanca extends Conta {
    @Override
    public double calcularTributos() {
        return 0; //sem taxa tributavel
    }
}
