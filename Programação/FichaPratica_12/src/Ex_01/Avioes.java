package Ex_01;

public class Avioes {
    private String nSerie, modelo;
    private int anoFabrico;
    private double peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco;

    public Avioes(String nSerie, String modelo, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, double nMotores, double autonomia, double velocidadeMax, double preco) {
        this.nSerie = nSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.compFuselagem = compFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.nMotores = nMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }
}
