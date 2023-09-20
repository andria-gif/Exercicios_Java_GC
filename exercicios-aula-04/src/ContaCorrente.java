public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calcularTributos() {
        return this.saldo * 0.01;  // Taxa de 1%
    }
}
