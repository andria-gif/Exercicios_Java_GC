package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Quadrado extends FormaGeometrica {
    public double lado;

    public Quadrado(double lado, int i) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return lado * lado;


    }
}
