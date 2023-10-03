package Exercicio01;

import java.util.ArrayList;
import java.util.Comparator;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("Ola");
        strings.add("Ola");
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("tchau");

        System.out.println(" O número total de strings na lista: " + strings.stream().count());
        System.out.println("A string mais longa é: "+ strings.stream().max(Comparator.comparingInt(String::length)));




    }

}
