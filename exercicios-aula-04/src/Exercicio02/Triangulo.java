package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Triangulo extends FormaGeometrica {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return  (base * altura) / 2;
    }


}
