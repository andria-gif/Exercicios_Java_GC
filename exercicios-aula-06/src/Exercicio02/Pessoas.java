package Exercicio02;

import java.util.HashMap;
import java.util.Map;

public class Pessoas {
    public static void main(String[] args) {
        HashMap<String, Integer> agenda = new HashMap<String,Integer>();

        //chave / valor
        agenda.put("João", 20);
        agenda.put("Santana", 22);
        agenda.put("Annita", 18);
        agenda.put("Vizeu", 70);
        agenda.put("Fraga", 88);
        agenda.put("Leonardo", 99);

        //teste array
        System.out.println(agenda);

        //imprimindo a idade de um nome especifico
        System.out.println(agenda.get("João\n"));

        // método para imprimir nomes das pessoas que estão na terceira
        for (Map.Entry<String, Integer> pessoasDaterceiraIdade : agenda.entrySet()) {
            String nome = pessoasDaterceiraIdade.getKey();
            int idade = pessoasDaterceiraIdade.getValue();

            if (pessoasDaterceiraIdade.getValue() >= 60) {
                System.out.println("Terceira idade: "+nome +","+idade  );

            }
        }

    }

}
