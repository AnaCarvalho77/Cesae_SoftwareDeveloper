package Controllers;

import Domain.Piloto;
import Domain.Veiculo;

public class PilotoController {
    private Veiculo veiculoInicial = null;
    public PilotoController() {

    }
    public Piloto criarPiloto(String nome, int fichas) {
        Piloto piloto = new Piloto(nome, fichas, veiculoInicial, 0);
        return piloto;
    }
}
