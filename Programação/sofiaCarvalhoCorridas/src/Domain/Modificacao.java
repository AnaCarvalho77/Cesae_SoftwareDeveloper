package Domain;

import java.util.ArrayList;

/**
 * sublcasse Modificacao da superclasse ItemCorrida para itens de corrida para carros
 */
public class Modificacao extends ItemCorrida {
    /**
     * variável dp tipo inteiro para guardar o valor da diminuição no desgaste do carro provocado pela modificação
     */
    private int diminuicaoDesgaste;
    /**
     * variável do tipo double que guarda o valor da diminuição no peso do carro provocado pela modificação
     */
    private double diminuicaoPeso;
    /**
     * arraylist de strings que contém o tipo de carros que é permitido aquela modificação
     */
    private ArrayList<String>carrosPermitidos;

    /**
     * Método construtor da subclasse Modificacao que recebe como parametros:
     * @param tipo (string) o tipo de item
     * @param id (string) o id do item
     * @param nome (string) o nome do item
     * @param precoFichasCorrida (int) o preço do item
     * @param diminuicaoDesgaste (int) a diminuição do desgaste da Modificacao
     * @param diminuicaoPeso (double) a diminuição do peso da Modificacao
     */
    public Modificacao(String tipo, String id, String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso) {
        super(tipo, id, nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = new ArrayList<>();
    }

    /**
     * Método para imprimir os detalhes de um item do tipo Modificacao
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("\t| diminuição desgaste: " + this.diminuicaoDesgaste + "\t| diminuiçãoPeso: " + this.diminuicaoPeso + "\t| carrosPermitidos: " + this.carrosPermitidos);
    }

    /**
     * Método para saber o valor da variável DiminuicaoDesgaste
     * @return (int) retorna o valor de diminuição de desgaste da modificacao
     */
    public int getDiminuicaoDesgaste() {
        return diminuicaoDesgaste;
    }

    /**
     * Método para saber o valor da variável DiminuiçãoPeso
     * @return (double) retorna o valor da diminuição de peso da modificacao
     */
    public double getDiminuicaoPeso() {
        return diminuicaoPeso;
    }

    /**
     * Método para saber o arraylist de carros permitidos
     * @return (arraylist) retorna os carros permitidos
     */
    public ArrayList<String> getCarrosPermitidos() {
        return carrosPermitidos;
    }
}
