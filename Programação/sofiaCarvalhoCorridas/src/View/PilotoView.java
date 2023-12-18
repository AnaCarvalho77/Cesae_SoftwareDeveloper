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
        System.out.println("Qual o nome do piloto: ");
        String nome = input.next();
        Piloto piloto1 = oficinaControler.criarPiloto(nome);
        oficinaControler.imprimirGaragem();
        System.out.print("Digite o numero da opcao desejada: ");
        int opcao = input.nextInt();
       oficinaControler.venderVeiculo(piloto1,opcao);
        piloto1.imprimirVeiculoAtual();
        oficinaControler.imprimirStock(piloto1);
        System.out.print("Digite o numero da opcao desejada: ");
        opcao = input.nextInt();
        oficinaControler.venderItem(piloto1,opcao);
       piloto1.usarItem();




    }
}
