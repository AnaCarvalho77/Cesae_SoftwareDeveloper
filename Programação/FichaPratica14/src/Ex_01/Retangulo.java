package Ex_01;

public class Retangulo extends FiguraGeometrica {
    private double compimento;
    private double largura;

    public Retangulo(String cor, double compimento, double largura) {
        super(cor);
        this.compimento = compimento;
        this.largura = largura;
    }

    @Override
    public double area() {
        double area = compimento * largura;
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro = 2*compimento + 2*largura;
        return perimetro;
    }
}
