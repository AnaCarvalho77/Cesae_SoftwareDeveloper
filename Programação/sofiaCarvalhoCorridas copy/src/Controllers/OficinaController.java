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
    private ArrayList<Veiculo> montraVeiculos;
    private ArrayList<ItemCorrida> montraItens;
    private ArrayList<String> carrosPermitidos = new ArrayList<String>();




    public OficinaController(){

    }
    public void criarOficina(String caminhoVeiculos, String caminhoItens) throws FileNotFoundException {
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository(caminhoVeiculos);
        this.garagem = garagemRepository.getGaragem();
        ItensCorridaRepository stockRepository = new ItensCorridaRepository(caminhoItens);
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
                    carrosPermitidos = ((Modificacao) itemAtual).getCarrosPermitidos(); // não esta bem
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


        montraItens = new ArrayList<>(6); // limpar variavel

        int numeroMenu = 1;
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(0, stockCopia.size());
            ItemCorrida itemAtual = stockCopia.get(index);
            montraItens.add(itemAtual);
            stockCopia.remove(index);
        }
        for (ItemCorrida itemMontra : montraItens) {
            System.out.print(numeroMenu + ". ");
            numeroMenu++;
            itemMontra.mostrarDetalhes();
        }
        System.out.println("0. Afinal não quero comprar. Sair do menu de compra de Itens!");

        System.out.print("\nDigite o numero da opcao desejada: ");
    }

    public void imprimirGaragem() {
        Random random = new Random();
        ArrayList<Veiculo> garagemCopia = new ArrayList<>();
        garagemCopia.addAll(this.garagem);

        montraVeiculos = new ArrayList<>(12); //problema


        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(0, garagemCopia.size());
            Veiculo veiculo = garagemCopia.get(index);
            montraVeiculos.add(veiculo);
            garagemCopia.remove(index);
        }
        int numeroMenu = 1;
        for (Veiculo veiculoMontra : montraVeiculos) {
            System.out.print(numeroMenu + ": ");
            numeroMenu++;
            veiculoMontra.mostrarDetalhes();
        }
        System.out.println("0 : Afinal não quero comprar. Sair do menu comprar!");
        System.out.print("\n Digite número opção: ");
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
                if(veiculoPiloto.getDesgaste() - ((Modificacao) itemEscolhido).getDiminuicaoDesgaste() > 0){
                    veiculoPiloto.setDesgaste(veiculoPiloto.getDesgaste() - ((Modificacao) itemEscolhido).getDiminuicaoDesgaste());
                    }
                if(veiculoPiloto.getPesoKg() - ((Modificacao) itemEscolhido).getDiminuicaoPeso() > 0){
                    veiculoPiloto.setPesoKg(veiculoPiloto.getPesoKg() - ((Modificacao) itemEscolhido).getDiminuicaoPeso());
                }
//                montraItens.remove(itemEscolhido);  não vou remover porque quero sempre 6 e tenho só a aparecer o da categoria do veiculo rapido ficava sem 6.
            } else if (veiculoPiloto instanceof Mota && itemEscolhido instanceof Habilidade) {
                ((Mota) veiculoPiloto).adicionarItensCorrida((Habilidade) itemEscolhido);
                pilotoAtual.setFichasCorrida(fichasPiloto - fichasItem);
                veiculoPiloto.setPotenciaCV(veiculoPiloto.getPotenciaCV() + ((Habilidade) itemEscolhido).getAumentoPotencia());
//                montraItens.remove(itemEscolhido);  não vou remover porque quero sempre 6 e tenho só a aparecer o da categoria do veiculo rapido ficava sem 6.
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
            Veiculo veiculoRemovido = pilotoAtual.getVeiculoAtual();

            if (fichasPiloto >= fichasVeiculo) {

                pilotoAtual.setVeiculoAtual(veiculoEscolhido);
                pilotoAtual.setFichasCorrida(fichasPiloto - fichasVeiculo);

//            montraVeiculos.remove(veiculoEscolhido);não vou remover porque quero sempre 12 e rapidamente ficava sem 12 carros, teria de ter uma garagem grande.

                // uma vez que não estou a eliminar os veiculos nem os itens da garagem, quando mudo o veiculo tenho de no veiculo a ser substituido limoar o arraylist de itens
                if(veiculoRemovido instanceof Carro){
                    ((Carro) veiculoRemovido).setKitCorrida(new ArrayList<>());
                }else if( veiculoRemovido instanceof Mota){
                    ((Mota) veiculoRemovido).setHabilidadesMota(new ArrayList<>());
                }
            } else {
                System.out.println("Não tem fichas suficientes para comprar este Veículo.");
            }
        }

    }
