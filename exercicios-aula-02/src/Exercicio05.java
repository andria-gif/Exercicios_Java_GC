public class Exercicio05 {

    public static void main(String[] args) {

        String valor = "Programação , Marketing , Gestão em Vendas , UX/UI";//declaração da String

        int contagem = valor.length() / 2; // contagem da metade da string

        String separacao = valor.substring(0, contagem); //define os limites de separação

        System.out.println("A primeira parte da string é: " + separacao); ///impressao da parte solicitada

    }

}
