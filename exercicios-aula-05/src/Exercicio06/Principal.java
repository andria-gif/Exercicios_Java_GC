package Exercicio06;

import Exercicio03.Lista_de_Tarefas;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
   public static void main(String[]args){
       Scanner prompt = new Scanner(System.in);
       LinkedList<Objects> reservas = new LinkedList<>();
       String reserva;
       String data;

       while (true) {
           System.out.println("\nEscolha uma opção:");
           System.out.println("1 - Efetuar uma  reserva:");
           System.out.println("2 - Cancelar viagem:");
           System.out.println("3 - Exibir descrição da viagem:");
           System.out.println("4 - Sair");

           int escolha = prompt.nextInt();

           switch (escolha) {
               case 1:
                   System.out.println("Digite para onde queres ir: ");
                   reserva= prompt.nextLine();
                   reserva= prompt.nextLine();
                   System.out.println("Digite a data desejada: ");
                   data = prompt.nextLine();
                   Passagens reserva1  = new Passagens(reserva,data);
                   Passagens.add(reservas);
                   System.out.println("Reserva efetuada!");
                   break;
               case 2:
                   System.out.println("Digite o indice do item que deseja remover: ");
                   int indice = prompt.nextInt() -1;
                   if ((indice > 0) && (indice <= Lista_de_Tarefas.size())) {
                       Lista_de_Tarefas.remove(indice);
                       System.out.println("Viagem excluído com sucesso!");
                   } else {
                       System.out.println("Número da viagem inválida!");
                   }
                   break;
               case 3:
                   System.out.println("Sua lista de viagem atualizada: " );
                   for (int i = 0; i < Lista_de_Tarefas.size(); i++) {
                       System.out.println(i + ": " + Passagens.get(i));
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

