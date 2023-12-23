package Domain;

public class Habilidade extends ItemCorrida {
    private int aumentoPotencia;

    /**
     * Método construtor da subclasse Habilidade que recebe como parametros:
     * @param tipo (string) o tipo de item
     * @param id (string) o id do item
     * @param nome (string) o nome do item
     * @param precoFichasCorrida (int) o preço do item
     * @param aumentoPotencia (int) o aumento da potencia da habilidade
     */
    public Habilidade(String tipo, String id, String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(tipo, id, nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    /**
     * Método para saber o valor da variável AumentoPotencia da subclasse habilidade
     * @return valor da variavável AumentoPotencia sa subclasse habilidade
     */
    public int getAumentoPotencia() {
        return aumentoPotencia;
    }

    /**
     * Método para imprimir um item do tipo habilidade
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| aumento potência: " + this.aumentoPotencia +"\n");
    }

}
