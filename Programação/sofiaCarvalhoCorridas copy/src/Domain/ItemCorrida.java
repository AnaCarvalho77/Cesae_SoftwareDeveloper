package Domain;

public abstract class ItemCorrida {
    private String tipo;
    private String id;
    private String nome;
    private int precoFichasCorrida;

    public ItemCorrida(String tipo, String id, String nome, int precoFichasCorrida) {
        this.tipo = tipo;
        this.id = id;
        this.nome = nome;
        this.precoFichasCorrida = precoFichasCorrida;
    }

    public void mostrarDetalhes(){
        System.out.print("Referência: " + this.id + "\t| Nome: " + this.nome + "\t| Preço: " + this.precoFichasCorrida);
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getPrecoFichasCorrida() {
        return precoFichasCorrida;
    }


}
