package Domain;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {
    private int diminuicaoDesgaste;
    private double diminuicaoPeso;
    private ArrayList<String>carrosPermitidos;

    public Modificacao(String tipo, String id, String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso) {
        super(tipo, id, nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = new ArrayList<>();
    }

    public Modificacao(String tipo, String id, String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso, ArrayList<String> carrosPermitidos) {
        super(tipo, id, nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = carrosPermitidos;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| " + this.diminuicaoDesgaste + "\t| " + this.diminuicaoPeso + "\t| " + this.carrosPermitidos);
    }

    public int getDiminuicaoDesgaste() {
        return diminuicaoDesgaste;
    }

    public double getDiminuicaoPeso() {
        return diminuicaoPeso;
    }

    public ArrayList<String> getCarrosPermitidos() {
        return carrosPermitidos;
    }
}
