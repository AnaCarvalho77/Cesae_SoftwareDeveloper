package Domain;

public class Habilidade extends ItemCorrida {
    private int aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }
}
