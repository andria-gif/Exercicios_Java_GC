package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Retangulo extends FormaGeometrica {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
