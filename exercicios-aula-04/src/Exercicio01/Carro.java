package Exercicio01;

import Exercicio01.Automovel;

//calsse concreta que está herdando de aultomavel
public class Carro extends Automovel {
    @Override
    public double calculadoraDeCustosViagem(int distancia, String automovel) {
        return super.calculadoraDeCustosViagem(distancia, automovel);
    }
}
