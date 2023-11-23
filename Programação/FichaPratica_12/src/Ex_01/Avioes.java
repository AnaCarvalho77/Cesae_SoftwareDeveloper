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

    public void dadosAviao(){
        System.out.println("numero de serie: " + this.nSerie);
        System.out.println("modelo: " + this.modelo);
        System.out.println("peso: " + this.peso);
        System.out.println("comprimento fuselagem: " + this.compFuselagem);
        System.out.println("envergadura asas: " + this.envergaduraAsas);
        System.out.println("altura cauda: " + this.alturaCauda);
        System.out.println("numero motores: " + this.nMotores);
        System.out.println("autonomia: " + this.autonomia);
        System.out.println("velocidade máxima: " + this.velocidadeMax);
        System.out.println("preço: " + this.preco);
    }

    public double getPreco() {
        return preco;
    }
}
