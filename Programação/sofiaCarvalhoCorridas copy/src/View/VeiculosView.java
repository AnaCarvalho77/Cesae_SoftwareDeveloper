package View;

import Controllers.OficinaController;
import Domain.Piloto;

import java.util.Scanner;

public class VeiculosView {
    public VeiculosView() {
    }

    public void menuVeiculos(Piloto piloto, OficinaController oficinaController){
        Scanner input = new Scanner(System.in);
            ItemView itemView = new ItemView();
            int opcao = 0;
        do{
            System.out.println("Quer comprar um veículo?");
            System.out.println("1. Sim");
            System.out.println("2. Nao");
            System.out.print("Digite o número da opcao:");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    boolean validaOpcao;
                    do{
                        oficinaController.imprimirGaragem();
                        String opcaoUtilizador= input.next();
                        validaOpcao = oficinaController.menuVenderVeiculo(piloto,opcaoUtilizador);
                    }while(validaOpcao == false);


            opcao = 0;
                    piloto.imprimirVeiculoAtual();
                    itemView.menuItem(piloto,oficinaController);
                    break;
                case 2:
                  itemView.menuItem(piloto,oficinaController);
                    break;
                default:
                    System.out.println("opcao não contemplada!\n");
                    break;
            }
        }while (opcao != 2);
    }
}
