package Domain;

import java.util.ArrayList;

public class Oficina {
    private ArrayList<Veiculo>garagem;
    private ArrayList<ItemCorrida>stock;

    /**
     * Método construtor da classe Oficina
     */
    public Oficina() {
        ArrayList<Veiculo> garagem = new ArrayList<>();
        ArrayList<Veiculo> stock = new ArrayList<>();
    }

}
