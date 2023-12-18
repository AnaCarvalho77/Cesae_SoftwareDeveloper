package View;

import Controllers.OficinaController;
import Domain.Piloto;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PilotoView {

    public PilotoView() {
    }


    public static void menuPiloto() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        OficinaController oficinaControler = new OficinaController();
        System.out.print("Qual o nome do piloto: ");
        System.out.println();
        String nome = input.next();
        Piloto piloto1 = oficinaControler.criarPiloto(nome);
        oficinaControler.imprimirGaragem();
        System.out.print("Digite o numero da opcao desejada: ");
        int opcao = input.nextInt();
       oficinaControler.venderVeiculo(piloto1,opcao);
        piloto1.imprimirVeiculoAtual();
        System.out.println();
        oficinaControler.imprimirStock(piloto1);

        opcao = input.nextInt();
        oficinaControler.venderItem(piloto1,opcao);
       piloto1.usarItem();




    }
}
