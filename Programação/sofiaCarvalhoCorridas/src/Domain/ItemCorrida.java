package Domain;

/**
 * superclasse abstrata ItemCorrida para itens de corrida que podem ser modicicações para carros ou habilidades para motas
 */
public abstract class ItemCorrida {
    /**
     * variável do tipo string para guardar o tipo de item de corrida (modificacao ou habilidade)
     */
    private String tipo;
    /**
     * variável do tipo string que guarda o id do item
     */
    private String id;
    /**
     * variável do tipo string que guarda o nome do item
     */
    private String nome;
    /**
     * variável do tipo inteiro que guarda o preço em fichas de corrida do item
     */
    private int precoFichasCorrida;

    /**
     * Método construtor de um ItemCorrida que recebe os seguintes parametros:
     * @param tipo (string) o tipo de item
     * @param id (string) o id do item
     * @param nome (string) o nome do item
     * @param precoFichasCorrida (int) o preço do item
     */
    public ItemCorrida(String tipo, String id, String nome, int precoFichasCorrida) {
        this.tipo = tipo;
        this.id = id;
        this.nome = nome;
        this.precoFichasCorrida = precoFichasCorrida;
    }

    /**
     * Método para imprimir detalhes de um item
     */
    public void mostrarDetalhes(){
        System.out.print("Referência: " + this.id + "\t| Nome: " + this.nome + "\t| Preço: " + this.precoFichasCorrida);
    }

    /**
     * Método para saber o tipo de item
     * @return (string) retorna o tipo de Item, se Modificacao ou Habilidade
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Método para saber o preço de um item
     * @return (int) retorna o preço do item
     */
    public int getPrecoFichasCorrida() {
        return precoFichasCorrida;
    }


}
