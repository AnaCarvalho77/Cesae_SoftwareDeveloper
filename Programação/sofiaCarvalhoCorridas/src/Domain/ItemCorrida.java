package Domain;

public abstract class ItemCorrida {
    private String nome;
    private int precoFichasCorrida;

    public ItemCorrida(String nome, int precoFichasCorrida) {
        this.nome = nome;
        this.precoFichasCorrida = precoFichasCorrida;
    }

    public void mostrarDetalhes(){
        System.out.println(this.nome + "\t| " + this.precoFichasCorrida);
    }
}
