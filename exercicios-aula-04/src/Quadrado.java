public abstract class Quadrado extends FormaGeometrica{
 public double lado;

 public Quadrado( double lado){
     this.lado = lado;
 }
    @Override
    public void calcularArea() {
     double arae = lado * lado;

        System.out.println("O valor da area do quadrado é: "+arae);
    }
}
