public abstract class Losangulo extends FormaGeometrica{
 public double diagonalMaior;
 public double diagonalMenor;

 public Losangulo(double diagonalMaior, double diagonalMenor){
     this.diagonalMaior = diagonalMaior;
     this.diagonalMenor = diagonalMaior;
 }
    @Override
    public void calcularArea() {
     double area = (diagonalMaior * diagonalMenor)/2;

        System.out.println("O valor da area do lo sangulo é: "+area);
    }
}
