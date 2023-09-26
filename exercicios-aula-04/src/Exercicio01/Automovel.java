package Exercicio01;

public  abstract  class Automovel {

    protected String marca;
    protected String modelo;
    protected int ano;


    //metodos
    public double calculadoraDeCustosViagem(int distancia, String automovel) {
        if (automovel == "carro") {
            double custo = distancia * 0.20;
            System.out.println("O custo da sua viagem foi: " + custo);
            return custo;
        } else {
            double custo = distancia * 0.15;
            System.out.println("O custo da sua viagem foi: " + custo);
            return custo;
        }


    }


}
