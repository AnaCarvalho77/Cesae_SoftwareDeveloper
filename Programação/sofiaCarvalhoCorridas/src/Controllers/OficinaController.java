package Controllers;

import Domain.*;
import Repository.ItensCorridaRepository;
import Repository.VeiculosOficinaRepository;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class OficinaController {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;
    private Veiculo veiculoInicial = null;
    private Veiculo veicloEscolhido = null;
    ArrayList<Veiculo> montraVeiculos = new ArrayList<>(12);
    ArrayList<ItemCorrida> montraItens = new ArrayList<>(6);


    public OficinaController() throws FileNotFoundException {
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/VeiculosCorridas.csv");
        this.garagem = garagemRepository.getGaragem();

        ItensCorridaRepository stockRepository = new ItensCorridaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/ItensCorrida.csv");
        this.stock = stockRepository.getStock();
    }


    public void imprimirStock(Piloto pilotoAtual) {

        Random random = new Random();
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        ArrayList<ItemCorrida> stockCopia = new ArrayList<>();

        if (veiculoPiloto instanceof Carro) {
            for (ItemCorrida itemAtual : stock) {
                if (itemAtual.getTipo().equals("Modificacao")) {
//                    if(((Carro) veiculoPiloto).getTipoCarro().equals("GT")){
//
//                    }
                    stockCopia.add(itemAtual);
                }
            }
        } else if (veiculoPiloto instanceof Mota) {
            for (ItemCorrida itemAtual : stock) {
                if (itemAtual.getTipo().equals("Habilidade")) {
                    stockCopia.add(itemAtual);
                }
            }
        }

        int numeroMenu = 1;
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(0, stockCopia.size());
            ItemCorrida itemAtual = stockCopia.get(index);
            montraItens.add(itemAtual);
            stockCopia.remove(index);
        }
        for (ItemCorrida itemMontra : montraItens) {
            System.out.print(numeroMenu + ": ");
            numeroMenu++;
            itemMontra.mostrarDetalhes();
        }


        System.out.print("Digite o numero da opcao desejada: ");
    }

    public void imprimirGaragem() {
        Random random = new Random();
        ArrayList<Veiculo> garagemCopia = this.garagem;

        int numeroMenu = 1;
        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(0, garagemCopia.size());
            Veiculo veiculoAtual = garagemCopia.get(index);
            montraVeiculos.add(veiculoAtual);
            garagemCopia.remove(index);
        }
        for (Veiculo veiculoMontra : montraVeiculos) {
            System.out.print(numeroMenu + ": ");
            numeroMenu++;
            veiculoMontra.mostrarDetalhes();
        }
    }

    public void venderItem(Piloto pilotoAtual, int opcaoUtilizador) {
        int posicaoItem = opcaoUtilizador - 1;
        ItemCorrida itemEscolhido = montraItens.get(posicaoItem);
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        int fichasPiloto = pilotoAtual.getFichasCorrida();
        int fichasItem = itemEscolhido.getPrecoFichasCorrida();

        if (fichasPiloto >= fichasItem) {
            if (veiculoPiloto instanceof Carro && itemEscolhido instanceof Modificacao) {
                ((Carro) veiculoPiloto).adicionarItensCorrida((Modificacao) itemEscolhido);
                pilotoAtual.setFichasCorrida(fichasPiloto - fichasItem);
                montraItens.remove(itemEscolhido);
            } else if (veiculoPiloto instanceof Mota && itemEscolhido instanceof Habilidade) {
                ((Mota) veiculoPiloto).adicionarItensCorrida((Habilidade) itemEscolhido);
                pilotoAtual.setFichasCorrida(fichasPiloto - fichasItem);
                montraItens.remove(itemEscolhido);
            }
        } else {
            System.out.println("Não tem fichas suficientes para adicionar este Item!");
        }

    }

    public void venderVeiculo(Piloto pilotoAtual, int opcaoUtilizador) {
        int posicaoVeiculo = opcaoUtilizador - 1;
        Veiculo veiculoEscolhido = montraVeiculos.get(posicaoVeiculo);
        int fichasPiloto = pilotoAtual.getFichasCorrida();
        int fichasVeiculo = veiculoEscolhido.getPreco();

        if (fichasPiloto >= fichasVeiculo) {
            pilotoAtual.setVeiculoAtual(veiculoEscolhido);
            pilotoAtual.setFichasCorrida(fichasPiloto - fichasVeiculo);
            montraVeiculos.remove(veiculoEscolhido);
        } else {
            System.out.println("Não tem fichas suficientes para comprar este Veículo.");
        }

    }


    public Piloto criarPiloto(String nome) {
        Piloto piloto1 = new Piloto(nome, 150000, veiculoInicial, 0);
        return piloto1;
    }


}
