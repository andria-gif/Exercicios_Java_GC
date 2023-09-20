public abstract class Retangulo extends FormaGeometrica {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Ovalor da area do Retangulo é: "+area);
    }
}
