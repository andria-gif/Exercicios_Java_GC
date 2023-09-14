package aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String[]args){
 Scanner prompt = new Scanner(System.in);

        System.out.println("Digite uma palavra:  ");
        String valor = prompt.nextLine();
        //declaração da String

        int contagem = valor.length()/2 ; // contagem da metade da string

        String separacao = valor.substring(0,contagem); //define os limites de separação

        System.out.println("A primeira parte da string é: "+separacao); ///impressao da parte solicitada

        }

    }
