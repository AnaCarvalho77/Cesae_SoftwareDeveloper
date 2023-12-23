package Domain;

public class Habilidade extends ItemCorrida {
    private int aumentoPotencia;

    public Habilidade(String tipo, String id, String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(tipo, id, nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    public int getAumentoPotencia() {
        return aumentoPotencia;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| aumento potência: " + this.aumentoPotencia +"\n");
    }

}
