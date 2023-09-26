package Exercicio05;

import Exercicio03.Lista_de_Tarefas;
import Exercicio06.Passagens;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        LinkedList<Impressao> imprimir = new LinkedList<Impressao>();

        String documentos;
        String numeroDepaginas;

        while (true) {
            System.out.println("\nEscolha uma opção:");

            System.out.println("1 - Adicionar documentos a fila de impressão: ");
            System.out.println("2 - Excluir um documento:");
            System.out.println("3 - Verificar fila: ");
            System.out.println("4 - Sair");

            int escolha = prompt.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicione seus documentos: ");
                    documentos= prompt.nextLine();
                    documentos= prompt.nextLine();
                    System.out.println("Digite a o número de páginas desejada: ");
                    numeroDepaginas = prompt.nextLine();
                    Impressao imprime1 = new Impressao(numeroDepaginas, documentos);
                    Impressao.add(imprime1);
                    System.out.println("Impressao adicionada a fila!");
                    break;
                case 2:
                    System.out.println("Digite o indice do documento que deseja remover: ");
                    int indice = prompt.nextInt() - 1;
                    if ((indice > 0) && (indice <= Lista_de_Tarefas.size())) {
                        imprimir.remove(indice);
                        System.out.println("Documento excluído com sucesso!");
                    } else {
                        System.out.println("Número de documento invélido!");
                    }
                    break;
                case 3:
                    System.out.println("Sua fila de impressão atual: ");
                    for (int i = 0; i < Lista_de_Tarefas.size(); i++) {
                        System.out.println(i + ": " + Impressao.get(i));
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

