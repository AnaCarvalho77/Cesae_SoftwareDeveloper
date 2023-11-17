package Ex_04;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double areaCirculo(){
        return 3.14*(raio*raio);
    }

    public double circunferencia(){
        return 2*3.14*raio;
    }
}
