public class TestaTributavel {
    public static void main (String[]args){
        ContaCorrente cc = new ContaCorrente();
         cc.depositar(500);
         cc.sacar(50);
        System.out.println("Teste saca: "+cc.saldo);
        System.out.println("O  resultado do calculo dos tributos foi: "
                +cc.calcularTributos());

        Tributavel t = cc;
        System.out.println(t);

        System.out.println("Testando poli "+t.calcularTributos());

        GerenciadorDeImpostoDeRenda gr = new GerenciadorDeImpostoDeRenda();
        gr.adicionar(cc);

        System.out.println("Teste" +gr);


    }
}
