package View;

import Controllers.CampeonatoController;
import Controllers.CorridaController;
import Controllers.OficinaController;
import Controllers.PistaController;
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
        OficinaController oficinaControler = new OficinaController();
        oficinaControler.criarOficina();
        PistaController pistaController = new PistaController();
        ArrayList<Pista> pistasCampeonato = new ArrayList<>();

        int opcao;

        System.out.print("Qual o nome do piloto: ");
        System.out.println();
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
                    piloto = oficinaControler.criarPiloto(nome, 10000);
                    break;
                case 2:
                    piloto = oficinaControler.criarPiloto(nome, 30000);
                    break;
                case 3:
                    piloto = oficinaControler.criarPiloto(nome, 60000);
                    break;
                case 0:
                    System.out.println("A sair....");
                    break;
                default:
                    System.out.println("opcao não contemplada.");

            }
        } while (opcao < 0 || opcao > 3);


        oficinaControler.imprimirGaragem();
        System.out.print("Digite o numero da opcao desejada: ");
        opcao = input.nextInt();
        oficinaControler.venderVeiculo(piloto, opcao);
        piloto.imprimirVeiculoAtual();
        pistasCampeonato = pistaController.pistasCampeonato(piloto);

        do{
            System.out.println("quer comprar itens?");
            System.out.println("1. sim");
            System.out.println("2. nao");
            opcao= input.nextInt();
            switch (opcao){
                case 1:
                    oficinaControler.imprimirStock(piloto);
                    opcao = input.nextInt();
                    oficinaControler.venderItem(piloto, opcao);
                    System.out.println();
                    piloto.usarItem();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("opcao não contemplada");
                    break;
            }
        }while (opcao != 2);

        CampeonatoController campeonatoController = new CampeonatoController();
        campeonatoController.campeonato(pistasCampeonato, piloto);

        System.out.println();
        opcao = 0;
        OficinaController oficinaController = new OficinaController();
        do{
            System.out.println("Quer comprar outro veículo?");
            System.out.println("1. Sim");
            System.out.println("2. Nao");
            System.out.print("\nDigite o número da opcao:");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    oficinaController.imprimirGaragem();
                    opcao= input.nextInt();
                    oficinaController.venderVeiculo(piloto,opcao);
                    do {
                        System.out.println("Quer comprar itens?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.print("\nDigite o número da opcao:");
                        opcao = input.nextInt();
                        switch (opcao) {
                            case 1:
                                oficinaController.imprimirStock(piloto);
                                opcao = input.nextInt();
                                oficinaController.venderItem(piloto, opcao);
                                break;
                            case 2:

                                break;
                            default:
                                System.out.println("opcao não contemplada!");
                                break;
                        }
                    }while(opcao < 1 || opcao > 2);
                    break;
                case 2:
                    opcao = 0;
                    do {
                        System.out.println("Quer adicionar itens ao seu veiculo?");
                        System.out.println("1. Sim");
                        System.out.println("2. Nao");
                        System.out.print("\nDigite o número da opcao:");
                        opcao = input.nextInt();
                        switch (opcao) {
                            case 1:
                                oficinaController.imprimirStock(piloto);
                                opcao = input.nextInt();
                                oficinaController.venderItem(piloto, opcao);
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("opcao não contemplada!");
                                break;
                        }
                    }while(opcao < 1 || opcao > 2);
                    break;
                default:
                    System.out.println("opcao não contemplada!");
                    break;
            }
        }while (opcao != 2);
        pistasCampeonato = pistaController.pistasCampeonato(piloto);
        System.out.println("********* Dados Atuais *******");
        piloto.mostrarDetalhes();

        do {
            System.out.println("Deseja fazer mais corridas ou prosseguir para a corrida do final do campeonato?");
            System.out.println("1. Mais uma corrida");
            System.out.println("2. Corrida Final");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    campeonatoController.campeonato(pistasCampeonato, piloto);

                    System.out.println("********* Dados Atuais *******");
                    piloto.mostrarDetalhes();
                    break;
                case 2:
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
