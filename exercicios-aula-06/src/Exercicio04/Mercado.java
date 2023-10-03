package Exercicio04;

import java.util.LinkedHashMap;
import java.util.Map;

public class Mercado {
    public static void main(String[] args) {

        LinkedHashMap<String, Double> produtos = new LinkedHashMap<String,Double>();

        produtos.put("Arroz Branco", 6.50);
        produtos.put("Leite Desnatado", 3.50);
        produtos.put("Coca-Cola 2l", 8.50);
        produtos.put("Abacate", 5.80);
        produtos.put("Doritos", 12.00);
        produtos.put("Acetona", 2.00);

        System.out.println("Lista de inserção de produtos\n");


        for (Map.Entry<String, Double> ordermProdutos: produtos.entrySet()){
            String produto = ordermProdutos.getKey();
            double preco = ordermProdutos.getValue();

            System.out.println("Produto: " +produto + "\npreço: " +preco);

        }


    }
}
