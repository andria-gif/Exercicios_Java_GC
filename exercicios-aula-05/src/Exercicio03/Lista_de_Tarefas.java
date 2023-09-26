package Exercicio03;

public class Lista_de_Tarefas {
   private String titulo;
   private  String descricao;
   private String data;


   public Lista_de_Tarefas(String data, String titulo, String descricao){
       this.data = data;
       this.descricao = descricao;
       this.titulo = titulo;
   }

    public static void add(Lista_de_Tarefas tarefa) {
    }

    public static int size() {
        return 0;
    }

    public static void remove(int indice) {
    }

    public static int get(int i) {
        return i;
    }



    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    public void ExibirLista(){
        System.out.println("Titulo: " +this.titulo);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Data: "+this.data);
    }
}
