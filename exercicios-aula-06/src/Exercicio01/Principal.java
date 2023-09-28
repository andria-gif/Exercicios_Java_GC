package Exercicio01;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Stack<Livros> pilhaLivros = new Stack<>();

        int opcoesAlocar;

        Livros livro1 = new Livros();
        livro1.setTitulo("Faça a sua comunicação enrriquecer você");
        livro1.setCategoria("Comunicação");

        Livros livro2 = new Livros();
        livro2.setTitulo("Mulheres que correm com os lobos");
        livro2.setCategoria("Fantasia, Mitos");

        Livros livro3 = new Livros();
        livro3.setTitulo("A ultima musica");
        livro3.setCategoria("Romance");

        Livros livros4 = new Livros();
        livros4.setTitulo("O mundo de Sofia");
        livros4.setCategoria("Romance");

        //função para add livros a pilha
        pilhaLivros.push(livro1);
        pilhaLivros.push(livro2);
        pilhaLivros.push(livro3);
        pilhaLivros.push(livros4);

        System.out.println("1- Imprimir todos os livros da biblioteca");
        System.out.println("2- Imprimir com base na categoria ");
        System.out.println("3- Remover um  livro");
        System.out.println("4- Remover livros até que a biblioteca  esteja vazia");
        System.out.println("5- Sair");

        int escolha = prompt.nextInt();

        switch (escolha) {
            case 1:

                for (Livros livros : pilhaLivros) {
                    System.out.println("Titulos: " + livros.getTitulo() + "\nCategoria: "
                            + livros.getCategoria());
                }
                break;
            case 2:
                for (Livros livros : pilhaLivros) {
                    System.out.println("Categorias: " + livros.getCategoria());
                }
                break;
            //Remove um elemento da pilha
            case 3:
                Livros livroRemovido = pilhaLivros.pop();
                System.out.println("Livro removido: " + livroRemovido);
                break;
            //verificar se a pilha esta vazia
            case 4:
                while (!pilhaLivros.empty()) {
                    pilhaLivros.pop();
                }
                System.out.println("Biblioteca vazia: " + pilhaLivros.empty());
                break;
            case 5:
                System.out.println("Saindo do programa. Até logo!");
                prompt.close();
                System.exit(0);
        }

    }
}
