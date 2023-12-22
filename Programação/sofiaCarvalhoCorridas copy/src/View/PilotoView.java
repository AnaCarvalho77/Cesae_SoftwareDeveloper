package View;

import Controllers.*;
import Domain.Piloto;
import Domain.Pista;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PilotoView {


    public PilotoView() {
    }


    public static void menuPiloto() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        OficinaController oficinaController = new OficinaController();
        oficinaController.criarOficina();
        PilotoController pilotoController = new PilotoController();
        ItemView itemView = new ItemView();
        VeiculosView veiculosView = new VeiculosView();
        PistaController pistaController = new PistaController();
        ArrayList<Pista> pistasCampeonato = new ArrayList<>();

        int opcao;

        System.out.println("Qual o nome do piloto: ");
        String nome = input.next();
        System.out.println();
        Piloto piloto = null;
        do {
            System.out.println("Qual o nível pretendido: ");
            System.out.println("1. Fácil");
            System.out.println("2. Intermédio");
            System.out.println("3. Difícil");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    piloto = pilotoController.criarPiloto(nome, 10000);
                    break;
                case 2:
                    piloto = pilotoController.criarPiloto(nome, 30000);
                    break;
                case 3:
                    piloto = pilotoController.criarPiloto(nome, 60000);
                    break;
                case 0:
                    System.out.println("A sair....");
                    return;
                default:
                    System.out.println("opcao não contemplada.");
            }
        } while (opcao < 0 || opcao > 3);


        do {
            oficinaController.imprimirGaragem();
            String opcaoUtilizador = input.next();
            oficinaController.menuVenderVeiculo(piloto,opcaoUtilizador);
        } while (piloto.getVeiculoAtual() == null);


        piloto.imprimirVeiculoAtual();
        System.out.println();
        pistasCampeonato = pistaController.pistasCampeonato(piloto);

        itemView.menuItem(piloto,oficinaController);


        System.out.println("********* Vamos iniciar o Campeonato *********");
        pistasCampeonato = pistaController.pistasCampeonato(piloto);
        CampeonatoController campeonatoController = new CampeonatoController();
        campeonatoController.campeonato(pistasCampeonato, piloto);

        System.out.println();


        veiculosView.menuVeiculos(piloto,oficinaController);




        do {
            System.out.println("Deseja fazer mais corridas ou prosseguir para a corrida do final do campeonato?");
            System.out.println("1. Mais uma corrida");
            System.out.println("2. Corrida Final");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                   veiculosView.menuVeiculos(piloto,oficinaController);
                    pistasCampeonato = pistaController.pistasCampeonato(piloto);
                    campeonatoController.campeonato(pistasCampeonato, piloto);
                   break;
                case 2:
                    veiculosView.menuVeiculos(piloto,oficinaController);
                    Pista pistaFinal = pistaController.pistaFinalCampeonato(piloto);
                    CorridaController corridaController = new CorridaController();
                    corridaController.corrida(pistaFinal,piloto);
                    break;
                default:
                    System.out.println("opcao não contemplada!");
                    break;
            }


        } while (opcao != 2);


    }
}
