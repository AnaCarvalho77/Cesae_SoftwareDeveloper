package View;

import Controllers.OficinaController;
import Domain.Piloto;

import java.util.Scanner;

public class ItemView {
    public ItemView() {
    }

    public void menuItem(Piloto piloto, OficinaController oficinaController){
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("quer comprar itens?");
            System.out.println("1. sim");
            System.out.println("2. nao");
            opcao= input.nextInt();
            switch (opcao){
                case 1:
                    oficinaController.imprimirStock(piloto);
                    opcao = input.nextInt();
                    oficinaController.venderItem(piloto, opcao);
                    opcao = 0;
                    System.out.println();
                    piloto.mostrarDetalhes();
                    break;
                case 2:
                    piloto.mostrarDetalhes();
                    break;
                default:
                    System.out.println("opcao não contemplada");
                    break;
            }
        }while (opcao != 2);
    }
}
