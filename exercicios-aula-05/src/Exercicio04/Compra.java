package Exercicio04;

public class Compra {
    private String nome;
    private String dataValidade;

    public Compra(String nome, String dataValidade) {
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public static void add(Compra compra) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void ExibirItens() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Data de Vencimento: " + this.dataValidade);
    }

    public int size() {
        return 0;
    }

    public void remove(int i) {
    }
}
