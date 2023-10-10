package Exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Listas {
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

        System.out.println(" O número total de strings na lista: " + (long) strings.size());
        //O trecho está contando quantas strings estão presentes na coleção strings. Ele retorna
        // um valor que representa a quantidade de elementos no stream.

        System.out.println("A string mais longa é: " + strings.stream().max(Comparator.comparingInt(String::length)));
////o trecho de código está procurando a string mais longa na coleção chamada strings usando a API
//// de Streams e comparando as strings pelo comprimento. O resultado
//// é um Optional contendo a string mais longa ou nenhum se a coleção estiver vazia.

        Map<String, Long> frequencias = strings.stream() //Long é o tipo de dado capaz de armazenar 64 bits
                // de informação (representa inteiros), sendo adequado nessa caso para calcular a frequancia
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//agrupando os elementos por eles mesmos e contando o numero de elementos em cada grupo


        frequencias.entrySet().stream()// Converte as entradas do mapa em um fluxo (stream) de pares chave-valor.
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())//inverte os valores de base colocando os maiores primeiro
                .limit(5)//limitação de floxo
                .forEach(e -> System.out.println("String: " + e.getKey() + ", Frequência: " + e.getValue()));//intera cada entrada de fluxo e imprime
    }


}



