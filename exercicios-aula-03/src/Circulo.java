public class Circulo {
    private Double raio;
    //private Double PI = 3.0,14159265358979323846;
    private static final double PI = 3.14159;

    public double CalculaArea(){
        double area = PI * this.raio * this.raio;
        System.out.println("A área é: " + area);
        return area;
    }
    public void setRaio(Double raio) {
        this.raio = raio;
    }
    public double CalcularCircuferencia(){
      double circuferencia = raio * 2 * PI;

        System.out.println(circuferencia);
        return circuferencia;
    }

}