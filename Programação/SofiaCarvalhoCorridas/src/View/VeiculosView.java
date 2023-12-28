package View;

import Controllers.OficinaController;
import Domain.Piloto;

import java.util.Scanner;

/**
 * classe VeciculosView para o menu de compra de veiculos
 */
public class VeiculosView {
    /**
     * Método construtor vazio da classe do menu de veiculos
     */
    public VeiculosView() {
    }

    /**
     * Metodo para apresentar o menu de veiculos
     *
     * @param piloto            parametro para passar como paramentro na opção de compra de itens quando não quer comprar veiculo
     * @param oficinaController objeto de OficinaController passado como parâmetro para não ter de instanciar novamente a classe
     */
    public static void menuVeiculos(Piloto piloto, OficinaController oficinaController) {
        //Instanciar o scanner
        Scanner input = new Scanner(System.in);
        //Instanciar a classe ItemView
        ItemView itemView = new ItemView();
        //Declaração de variaveis
        int opcaoMenuVeiculo;
        int opcaoMontraVeiculos;

        //menu para comprar veiculos
        do {
            System.out.println();
            System.out.println("Quer comprar um veículo?");
            System.out.println("1. Sim");
            System.out.println("2. Nao");
            System.out.print("Digite o número da opcao:");
            opcaoMenuVeiculo = input.nextInt();

            switch (opcaoMenuVeiculo) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("******* Montra de Veículos *******");
                        oficinaController.imprimirGaragem();
                        opcaoMontraVeiculos = input.nextInt();
                        if (opcaoMontraVeiculos > 0 && opcaoMontraVeiculos <= 12) {
                            oficinaController.venderVeiculo(piloto, opcaoMontraVeiculos);
                            piloto.mostrarDetalhes();
                            itemView.menuItem(piloto, oficinaController);//mostrar menu de compra de itens
                        } else if(opcaoMontraVeiculos == 0){
                            piloto.mostrarDetalhes();
                            itemView.menuItem(piloto, oficinaController);
                            return;// para não voltar a questionar se quer comprar um veículo
                        }else{
                             System.out.println("numero opção não contemplado");
                        }
                    } while (opcaoMontraVeiculos < 0 || opcaoMontraVeiculos > 12);
                    break;

                case 2:
                    itemView.menuItem(piloto, oficinaController);//mostrar menu de opcao de compra de itens
                    break;

                default:
                    System.out.println("opcao não contemplada!\n");
                    break;
            }
        } while (opcaoMenuVeiculo != 2);
    }
}
