package View;

import Controllers.OficinaController;
import Controllers.PilotoController;
import Domain.Piloto;

import java.util.Scanner;

/**
 * classe ItemView para o menu de compra de itens de corrida
 */
public class ItemView {
    /**
     * Metodo construtor vazio da classe de Menu de Venda de Itens
     */
    public ItemView() {
    }

    /**
     * Método para apresentar menu de venda de itens
     *
     * @param piloto            recebe um piloto como parametro para verificar qual o veiculo do piloto, para so serem apresentados itens comppativeis com o veiculo
     * @param oficinaController objeto da classe OficinaController passado como parâmetro para não ter de instanciar a classe novamente
     */
    public static void menuItem(Piloto piloto, OficinaController oficinaController) {
        //Instanciar scanner
        Scanner input = new Scanner(System.in);

        //Declaração de variaveis
        int opcaoMenuItem;
        int opcaoMontra;

        // menu de compra de itens
        do {
            System.out.println();
            System.out.println("quer comprar itens?");
            System.out.println("1. sim");
            System.out.println("2. nao");
            System.out.println("0. Sair");
            opcaoMenuItem = input.nextInt();


            switch (opcaoMenuItem) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("******** Montra de Itens ********");
                        oficinaController.imprimirStock(piloto);//apresentação da montra de itens compativeis com o veiculo do piloto
                        opcaoMontra = input.nextInt();
                        if (opcaoMontra > 0 && opcaoMontra <= 6) {
                            oficinaController.venderItem(piloto, opcaoMontra);//compra do item e operações inerentes
                        } else if (opcaoMontra < 0 || opcaoMontra > 6) {
                            System.out.println("Número opcao não contemplado!!");
                        } else if(opcaoMontra == 0){
                            break;
                        }

                    } while (opcaoMontra < 0 || opcaoMontra > 6);
                    System.out.println();
                    piloto.mostrarDetalhes();//imprimir detalhes do piloto(fichas, veiculo, itens e vitorias)
                    break;
                case 2:
                    piloto.mostrarDetalhes();//imprimir detalhes do piloto(fichas, veiculo, itens e vitorias)
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcao não contemplada");
                    break;
            }
        } while (opcaoMenuItem != 0 && opcaoMenuItem != 2);
    }
}
