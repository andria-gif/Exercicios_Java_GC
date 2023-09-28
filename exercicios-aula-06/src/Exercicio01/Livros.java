package Exercicio01;

public class Livros {
    private String titulo;
    private String categoria;


    public Livros(String titulo, String categoria){
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public Livros() {

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
