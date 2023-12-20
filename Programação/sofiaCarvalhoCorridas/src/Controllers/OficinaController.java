package Controllers;

import Domain.*;
import Repository.ItensCorridaRepository;
import Repository.VeiculosOficinaRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class OficinaController {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;
    private Veiculo veicloEscolhido = null;
    private ArrayList<Veiculo> montraVeiculos = new ArrayList<>(12);
    private ArrayList<ItemCorrida> montraItens = new ArrayList<>(6);
    private ArrayList<String> carrosPermitidos = new ArrayList<String>();




    public OficinaController(){

    }
    public void criarOficina() throws FileNotFoundException {
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/VeiculosCorridas.csv");
        this.garagem = garagemRepository.getGaragem();
        ItensCorridaRepository stockRepository = new ItensCorridaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/ItensCorrida.csv");
        this.stock = stockRepository.getStock();
    }


    public void imprimirStock(Piloto pilotoAtual) {
        Random random = new Random();
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        ArrayList<ItemCorrida> stockCopia = new ArrayList<>();
        ArrayList<ItemCorrida> stockModificacao = new ArrayList<>();

        if (veiculoPiloto instanceof Carro) {
            TipoCarro tipoCarroPiloto = ((Carro) veiculoPiloto).getTipoCarro();

            for (ItemCorrida itemAtual : stock) {
                if (itemAtual instanceof Modificacao) {
                    carrosPermitidos = ((Modificacao) itemAtual).getCarrosPermitidos();
                    for (String modificacaoAtual : carrosPermitidos) {
                        if (tipoCarroPiloto.equals(TipoCarro.GT)) {
                            if (modificacaoAtual.equals("GT"))
                                stockCopia.add(itemAtual);
                        } else if (tipoCarroPiloto.equals(TipoCarro.Rally)) {
                            if (modificacaoAtual.equals("Rally"))
                                stockCopia.add(itemAtual);
                        } else if (tipoCarroPiloto.equals(TipoCarro.F1)) {
                            if (modificacaoAtual.equals("F1"))
                                stockCopia.add(itemAtual);
                        }
                    }
                }
            }

        } else if (veiculoPiloto instanceof Mota) {
            for (ItemCorrida itemAtual : stock) {
                if (itemAtual.getTipo().equals("Habilidade")) {
                    stockCopia.add(itemAtual);
                }
            }
        }

//            for (ItemCorrida itemAtual : stock) {
//                if (itemAtual instanceof Modificacao) {
//                    if (tipoCarroPiloto.equals("GT")) {
//                        if (((Modificacao) itemAtual).getCarrosPermitidos().equals("GT")) {
//                            stockCopia.add(itemAtual);
//                        }
//                    } else if (tipoCarroPiloto.equals("Rally")) {
//                        if (((Modificacao) itemAtual).getCarrosPermitidos().equals("Rally")) {
//                            stockCopia.add(itemAtual);
//                        }
//                    } else if (tipoCarroPiloto.equals("F1")) {
//                        if (((Modificacao) itemAtual).getCarrosPermitidos().equals("F1")) {
//                            stockCopia.add(itemAtual);
//                        }
//                    }
//                }
//            }


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
//                montraItens.remove(itemEscolhido);  não vou remover porque vou assumir que nos itens há varias quantidades para serem repostas
            } else if (veiculoPiloto instanceof Mota && itemEscolhido instanceof Habilidade) {
                ((Mota) veiculoPiloto).adicionarItensCorrida((Habilidade) itemEscolhido);
                pilotoAtual.setFichasCorrida(fichasPiloto - fichasItem);
//                montraItens.remove(itemEscolhido); não vou remover porque vou assumir que nos itens há varias quantidades para serem repostas
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




}
