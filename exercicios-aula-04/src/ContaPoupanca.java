public class ContaPoupanca extends Conta implements Tributavel{
    @Override
    public double calcularTributos() {
        return 0; //sem taxa tributavel
    }
}
