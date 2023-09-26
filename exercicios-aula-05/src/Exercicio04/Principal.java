package Exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        ArrayList<Compra> listaDeCompras = new ArrayList<>();
        String nome;
        String dataValidade;

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item à lista");
            System.out.println("2 - Remover item da lista");
            System.out.println("3 - Exibir lista de compras");
            System.out.println("4 - Sair");

            int escolha = prompt.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do item: ");
                    nome = prompt.nextLine();
                    System.out.println("Digite a data de validade do item: ");
                    dataValidade = prompt.nextLine();
                    Compra Compra = new Compra(nome, dataValidade);
                    Exercicio04.Compra.add(Compra);
                    System.out.println("Item adicionado à lista de compras.");
                    break;
                case 2:
                    System.out.println("Digite o indice do item que deseja remover: ");
                    int indice = Integer.parseInt(prompt.nextLine());
                    if ((indice > 0) && (indice <= Compra.size())) {
                        Compra.remove(indice - 1);
                        System.out.println("Produto excluído com sucesso!");
                    } else {
                        System.out.println("Número de produto inválido!");
                    }
                    break;
                case 3:
                    System.out.println("Sua lista de Compras atualizada: " );
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println(i + ": " + listaDeCompras.get(i));
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
