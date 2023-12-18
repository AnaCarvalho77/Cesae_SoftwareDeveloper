package Controllers;

import Domain.Piloto;
import Domain.Veiculo;

public class PilotoController {
    Veiculo veiculoAtual;

    public PilotoController(String nome){
        Piloto piloto1 = new Piloto(nome,15000,veiculoAtual,0);
    }

}
