package Controllers;

import Domain.Piloto;
import Domain.Pista;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {
    /**
     * Metodo construtor vazio da classe campeonato controller
     */
    public CampeonatoController() {
    }

    /**
     * Método para executar um campeonato
     * @param pistasCampeonato recebe um arraylist de pista do campeonato
     * @param piloto para saber informações do veiculo do piloto como os dados do veiculo para calculo da corrida e atualização de variaveis
     */
    public void campeonato(ArrayList<Pista> pistasCampeonato, Piloto piloto){
        System.out.println();
        Scanner input = new Scanner(System.in);
        CorridaController corridaController = new CorridaController();
        OficinaController oficinaController = new OficinaController();
        for(Pista pistaAtual: pistasCampeonato) {
            System.out.print("\n" + pistaAtual.getNome() + ": ");
            corridaController.corrida(pistaAtual, piloto);//iniciar a corrida nas pistas deste campeonato
        }
        piloto.mostrarDetalhes();
    }

}
