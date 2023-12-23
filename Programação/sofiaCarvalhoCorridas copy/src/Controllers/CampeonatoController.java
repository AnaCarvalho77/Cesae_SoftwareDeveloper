package Controllers;

import Domain.Piloto;
import Domain.Pista;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {
    public CampeonatoController() {
    }

    public void campeonato(ArrayList<Pista> pistasCampeonato, Piloto piloto){
        Scanner input = new Scanner(System.in);
        CorridaController corridaController = new CorridaController();
        OficinaController oficinaController = new OficinaController();
        for(Pista pistaAtual: pistasCampeonato) {
            System.out.print("\n" + pistaAtual.getNome() + ": ");
            corridaController.corrida(pistaAtual, piloto);
        }
        piloto.mostrarDetalhes();
    }

}
