package Exercicio03;

public class Agenda {
    private String nome;
    private int numeroTelefone;
    private String endereco;
    private String zona;
    private String cidade;


    public Agenda(String nome, int numeroTelefone, String endereco, String zona, String cidade) {
    }

    // aqui eu estou concatendando pq o TreeMap só aceita chave valor e
// eu quero usar a agenda como um valor p poder chamar colocar todas as infos.
    public void concact(String nome, int numeroTelefone, String endereco, String zona, String cidade) {
        Agenda agenda = new Agenda(nome, numeroTelefone, endereco, zona, cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
