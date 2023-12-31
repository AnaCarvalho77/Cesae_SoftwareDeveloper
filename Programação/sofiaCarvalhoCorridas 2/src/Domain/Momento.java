package Domain;

public class Momento {
    private String nome;
    private double atrasoPeso;
    private double atrasoPotencia;

    public Momento(String nome, double atrasoPeso, double atrasoPotencia) {
        this.nome = nome;
        this.atrasoPeso = atrasoPeso;
        this.atrasoPotencia = atrasoPotencia;
    }

    public String getNome() {
        return nome;
    }

    public double getAtrasoPeso() {
        return atrasoPeso;
    }

    public double getAtrasoPotencia() {
        return atrasoPotencia;
    }
}
