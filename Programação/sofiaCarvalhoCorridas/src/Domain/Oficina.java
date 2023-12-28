package Domain;

import java.util.ArrayList;

/**
 * classe oficinia para armazenar veiculos e itens
 */
public class Oficina {
    /**
     * arraylist de veiculos
     */
    private ArrayList<Veiculo> garagem;
    /**
     * arraylist de itens de corrida
     */
    private ArrayList<ItemCorrida> stock;

    /**
     * Método construtor da oficina que recebe como parametros:
     * @param garagem um arraylist de veiculos
     * @param stock um arraylist de itens de corrida
     */
    public Oficina(ArrayList<Veiculo> garagem, ArrayList<ItemCorrida> stock) {
        this.garagem = garagem;
        this.stock = stock;
    }

    /**
     * método para obter o arraylist de veiculos
     * @return arraylist de veiculos
     */
    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }

    /**
     * método para obter o arraylist de itens de corrida
     * @return arraylist de itens de corrida
     */
    public ArrayList<ItemCorrida> getStock() {
        return stock;
    }
}
