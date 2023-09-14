package aula02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[]args){
        Scanner prompt = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String recebe = prompt.nextLine();

        StringBuffer result = new StringBuffer(recebe);//aqui eu estou sincronizando
        // a string fornecida pelo usário deixando ela mais concatenada que me permite
        //modifica-la com maior consistencia utilizando o reverse.
        result.reverse();

        System.out.println(result);
    }
}
