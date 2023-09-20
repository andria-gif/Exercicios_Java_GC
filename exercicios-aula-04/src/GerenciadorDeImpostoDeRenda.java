public class GerenciadorDeImpostoDeRenda {
    private double totalTributos;

    public void adicionar(Tributavel t) {
        this.totalTributos += t.calcularTributos();
    }

    public double getTotalTributos() {
        return this.totalTributos;
    }
}
