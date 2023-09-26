package Exercicio02;

import Exercicio02.FormaGeometrica;

public class Losangulo extends FormaGeometrica {
 public double diagonalMaior;
 public double diagonalMenor;

 public Losangulo(double diagonalMaior, double diagonalMenor){
     this.diagonalMaior = diagonalMaior;
     this.diagonalMenor = diagonalMaior;
 }
    @Override
    public double calcularArea() {
     return (diagonalMaior * diagonalMenor)/2;
    }
}
