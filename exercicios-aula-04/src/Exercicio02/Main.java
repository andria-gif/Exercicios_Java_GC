package Exercicio02;

import Exercicio02.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Triangulo(5, 9));
        formas.add(new Quadrado(8, 6));
        formas.add(new Circulo(4));
        formas.add(new Losangulo(4, 5));
        formas.add(new Retangulo(2, 3));

        for (FormaGeometrica forma : formas){
////estudar artigo for com array sintaxe java
            System.out.println(forma.calcularArea());

        }
    }
}
