package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Circulo extends FormaGeometrica {
    public double raio;

    public Circulo(double base){
       this.raio = raio;
    }
    @Override
    public  double calcularArea() {
        return  (this.raio * this.raio) * Math.PI;
    }
}
