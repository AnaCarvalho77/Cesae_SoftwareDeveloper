package Ex_01;

public class Circulo extends FiguraGeometrica {
    private double raio;
    private double pi=3.14;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        double area = pi*(raio*raio);
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro = 2*pi*raio;
        return perimetro;
    }
}
