package View;

import Controllers.*;
import Domain.Piloto;
import Domain.Pista;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static View.ItemView.menuItem;

/**
 * classe JogoView para o menu do jogo
 */
public class JogoView {
    /**
     * Construtor vazio da classe JogoView
     */
    public JogoView() {
    }

    /**
     * Método para apresentar o Menu do Jogador
     *
     * @throws FileNotFoundException exceção
     */
    public static void menuPiloto() throws FileNotFoundException {
        //Instanciar o scanner
        Scanner input = new Scanner(System.in);

        //Declaração de Variáveis Caminhos Ficheiros
        String caminhoItens = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/ItensCorrida.csv";
        String caminhoVeiculos = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/VeiculosCorridas.csv";

        //Criar instâncias de Classes
        OficinaController oficinaController = new OficinaController();
        PistaController pistaController = new PistaController();
        PilotoController pilotoController = new PilotoController();
        CampeonatoController campeonatoController = new CampeonatoController();
        CorridaController corridaController = new CorridaController();

        //criar oficina com os ficheiros csv
        oficinaController.criarOficina(caminhoVeiculos, caminhoItens);


        ArrayList<Pista> pistasCampeonato = new ArrayList<>();

        int opcao;

        //Menu Criação do Piloto
        System.out.println("Qual o nome do piloto: ");
        String nome = input.next();
        System.out.println();
        Piloto piloto = null;//Variável piloto da classe piloto para receber o retorno do piloto criado no pilotocontroller
        do {
            System.out.println("Qual o nível pretendido: ");
            System.out.println("1. Fácil");
            System.out.println("2. Intermédio");
            System.out.println("3. Difícil");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            switch (opcao) {//os valores inicais das moedas comecei em valores mais altos derivado ao preço dos veículos
                case 1:
                    piloto = pilotoController.criarPiloto(nome, 40000);
                    break;
                case 2:
                    piloto = pilotoController.criarPiloto(nome, 60000);
                    break;
                case 3:
                    piloto = pilotoController.criarPiloto(nome, 80000);
                    break;
                case 0:
                    System.out.println("A sair....");
                    return;
                default:
                    System.out.println("opcao não contemplada.");
            }
        } while (opcao < 0 || opcao > 3);

        System.out.println();
        //imprimir informações do piloto (fichas, veiculos, itens e vitorias)
        piloto.mostrarDetalhes();


        //Menu para comprar obrigatoriamente o primeiro veiculo
        do {
            System.out.println();
            System.out.println("******* Montra de Veículos *******");
            oficinaController.imprimirGaragem();//imprimir a montra de veículos
            int opcaoMontra = input.nextInt();
            if (opcaoMontra < 0 || opcaoMontra > 12) {
                System.out.println("numero opção não contemplado!");
            } else if (opcaoMontra == 0) {
                System.out.println("Tem de comprar um veiculo para iniciar");
            } else {
                oficinaController.venderVeiculo(piloto, opcaoMontra);//com a opção vai comprar o veiculo e fazer operações inerentes
            }
        } while (piloto.getVeiculoAtual() == null);


        piloto.mostrarDetalhes();//imprimir informações do piloto (fichas, veiculos, itens e vitorias)
        System.out.println();

        menuItem(piloto, oficinaController);//opção de compra de itens

        System.out.println();
        System.out.println("********* Vamos iniciar o Campeonato *********");
        pistasCampeonato = pistaController.pistasCampeonato(piloto);//Arraylist que vai receber as pistas do campeonato retornadas pelo metodo pistasCampeonato da classe PistaController
        campeonatoController.campeonato(pistasCampeonato, piloto);//iniciar campeonato através do metodo campeonato da classe CampeonatoController

        VeiculosView.menuVeiculos(piloto, oficinaController);//opção de compra de veiculo

        //menu para questionar se quer fazer mais corridas para ganhar moedas e comprar veiculos melhores ou se quer ir para a corrida final
        do {
            System.out.println();
            System.out.println("Deseja fazer mais corridas ou prosseguir para a corrida do final do campeonato?");
            System.out.println("1. Mais uma corrida");
            System.out.println("2. Corrida Final");
            System.out.println("0. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    pistasCampeonato = pistaController.pistasCampeonato(piloto);//invoquei outra vez o método para retornar as pistas do campeonato porque pode ser um veiculo diferente e tenho pistas para cada tipo de veiculo
                    campeonatoController.campeonato(pistasCampeonato, piloto);//iniciar o novo campeonato
                    VeiculosView.menuVeiculos(piloto, oficinaController);
                    break;
                case 2:
                    Pista pistaFinal = pistaController.pistaFinalCampeonato();//criar instancia de Pista para receber o retorno de uma pista do metodo pistaFinalCampeonato
                    corridaController.corrida(pistaFinal, piloto);//iniciar corrida final
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcao não contemplada!");
                    break;
            }


        } while (opcao != 2 && opcao != 0);


    }
}
