package Domain;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {
    private int diminuicaoDesgaste;
    private double diminuicaoPeso;
    ArrayList<String>carrosPermitidos;

    public Modificacao(String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso) {
        super(nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
    }
}
