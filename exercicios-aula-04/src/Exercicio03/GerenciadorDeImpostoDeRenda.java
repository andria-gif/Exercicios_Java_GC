package Exercicio03;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;

    public void adicionar(ContaCorrente t) {
        this.totalTributos += t.calcularTributos();
    }

    public double getTotalTributos() {
        return this.totalTributos;
    }
}
