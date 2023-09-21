public class Circulo extends FormaGeometrica{
    public double raio;

    public Circulo(double base){
       this.raio = raio;
    }
    @Override
    public void calcularArea() {
        double area = (this.raio * this.raio) * Math.PI;
        System.out.println("O valor da area do circulo é: "+area);
    }
}
