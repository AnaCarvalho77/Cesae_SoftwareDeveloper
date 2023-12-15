package Domain;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {
    private String nome;
    private int diminuicaoDesgaste;
    private double diminuicaoPeso;
    ArrayList<String>carrosPermitidos;

    public Modificacao(String nome, int precoFichasCorrida) {
        super(nome, precoFichasCorrida);
    }
}
