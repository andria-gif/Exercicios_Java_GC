public abstract class Triangulo extends FormaGeometrica {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;

        System.out.println("O valor da area do Triangulo é: " + area);
    }


}
