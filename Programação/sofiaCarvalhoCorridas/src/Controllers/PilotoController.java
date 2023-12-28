package Controllers;

import Domain.Piloto;
import Domain.Veiculo;

public class PilotoController {
    //Declaração de variável da classe que é um veiculo inicial a null do piloto
    private Veiculo veiculoInicial = null;

    /**
     * Método construtor vazio da classe PilotoController
     */
    public PilotoController() {

    }

    /**
     * Método para criar uma instância da classe Piloto com dados do utilizador
     * @param nome nome recebido como input do utilizador passado por parametro
     * @param fichas fichas definidas para cada nível passado por parametro
     * @return retorna um piloto
     */
    public Piloto criarPiloto(String nome, int fichas) {
        Piloto piloto = new Piloto(nome, fichas, veiculoInicial, 0);
        return piloto;
    }
}
