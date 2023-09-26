package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        ArrayList<Lista_de_Tarefas> tarefas = new ArrayList<>();
        String titulo;
        String data;
        String descricao;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar tarefa, descricao e data à lista");
            System.out.println("2 - Remover tarefa da lista");
            System.out.println("3 - Exibir lista de Tarefas");
            System.out.println("4 - Sair");

            int escolha = prompt.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o titulo da tarefa: ");
                    titulo = prompt.nextLine();
                    titulo = prompt.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    descricao = prompt.nextLine();
                    System.out.println("Data: ");
                    data = prompt.nextLine();
                    Lista_de_Tarefas tarefa = new Lista_de_Tarefas(titulo, data, descricao);
                    Lista_de_Tarefas.add(tarefa);
                    System.out.println("Item adicionado à lista de compras.");
                    break;
                case 2:
                    System.out.println("Digite o indice do item que deseja remover: ");
                    int indice = prompt.nextInt()-1;
                    if ((indice > 0) && (indice <= Lista_de_Tarefas.size())) {
                        Lista_de_Tarefas.remove(indice);
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Número de produto inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Sua lista de Compras atualizada: " );
                    for (int i = 0; i < Lista_de_Tarefas.size(); i++) {
                        System.out.println(i + ": " + Lista_de_Tarefas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até logo!");
                    prompt.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }

}
