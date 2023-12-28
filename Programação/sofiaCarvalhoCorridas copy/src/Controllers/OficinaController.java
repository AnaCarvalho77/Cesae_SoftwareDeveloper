package Controllers;

import Domain.*;
import Repository.ItensCorridaRepository;
import Repository.VeiculosOficinaRepository;
import View.VeiculosView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class OficinaController {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;
    private ArrayList<Veiculo> montraVeiculos;
    private ArrayList<ItemCorrida> montraItens;
    private ArrayList<String> carrosPermitidos = new ArrayList<String>();

    private Veiculo veicloEscolhido = null;


    /**
     * Método construtor vazio da classe OficinaController
     */
    public OficinaController(){

    }

    /**
     * Método para criar uma oficina com uma garagem de veiculos e de itens
     * @param caminhoVeiculos caminho para o ficheiro CSV com informação dos veiculos passado por parametro
     * @param caminhoItens canminho para o ficheiro CSV com a infornação dos itens passado por parametro
     * @throws FileNotFoundException
     */
    public void criarOficina(String caminhoVeiculos, String caminhoItens) throws FileNotFoundException {
        //Instanciar um objeto do repositório de veiculos
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository(caminhoVeiculos);
        this.garagem = garagemRepository.getGaragem();
        //Instanciar um obejto do repositório de itens
        ItensCorridaRepository stockRepository = new ItensCorridaRepository(caminhoItens);
        this.stock = stockRepository.getStock();
    }

    /**
     * Método para imprimir aleatoriamente 6 itens compativeis com o tipo de veiculo do piloto
     * @param pilotoAtual recebe um piloto como parametro para poder verificar o tipo de veiculo
     */
    public void imprimirStock(Piloto pilotoAtual) {
        Random random = new Random();
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        ArrayList<ItemCorrida> stockCopia = new ArrayList<>();

        if (veiculoPiloto instanceof Carro) {//verificar se é um carro
            TipoCarro tipoCarroPiloto = ((Carro) veiculoPiloto).getTipoCarro();

            for (ItemCorrida itemAtual : stock) {
                if (itemAtual instanceof Modificacao) {//Se é um carro temos de mostrar itens do tipo "modificação" permitidos para o tipo de carro do piloto
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

        } else if (veiculoPiloto instanceof Mota) {//se é mota vai mostrar só itens do tipo "habilidade"
            for (ItemCorrida itemAtual : stock) {
                if (itemAtual.getTipo().equals("Habilidade")) {
                    stockCopia.add(itemAtual);
                }
            }
        }


        montraItens = new ArrayList<>(6); // limpar variavel

        int numeroMenu = 1;//números que vão aparecer no menu a começar no 1
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(0, stockCopia.size());
            ItemCorrida itemAtual = stockCopia.get(index);
            montraItens.add(itemAtual);
            stockCopia.remove(index);//Removo neste arraylist para não haver repetidos ao gerar aleatoriamente
        }
        //impressão dos itens da montra
        for (ItemCorrida itemMontra : montraItens) {
            System.out.print(numeroMenu + ". ");
            numeroMenu++;
            itemMontra.mostrarDetalhes();
        }
        System.out.println("0. Afinal não quero comprar. Sair do menu de compra de Itens!");

        System.out.print("\nDigite o numero da opcao desejada: ");
    }

    /**
     * Método para imprimir aleatoria 12 veiculos da garagem de veiculos
     */
    public void imprimirGaragem() {
        Random random = new Random();
        ArrayList<Veiculo> garagemCopia = new ArrayList<>();
        garagemCopia.addAll(this.garagem);

        montraVeiculos = new ArrayList<>(12); //problema


        for (int i = 0; i < 12; i++) {
            int index = random.nextInt(0, garagemCopia.size());
            Veiculo veiculo = garagemCopia.get(index);
            montraVeiculos.add(veiculo);
            garagemCopia.remove(index);//para não haver repetidos
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

    /**
     * Método para vender Itens ao utilizador
     * @param pilotoAtual recebe um piloto como parametro para saber se o piloto tem fichas suficientes para comprar o utem e para adicionar os itens ao veiculo do piloto
     * @param opcaoUtilizador recebe uma opção do utilizador baseada na impressão de itens
     */
    public void venderItem(Piloto pilotoAtual, int opcaoUtilizador) {
        int posicaoItem = opcaoUtilizador - 1;//como o arraylist inicia no 0 e a impressão dos itens inicia no 1, à opção do utilizadior terá de ser diminuido 1
        ItemCorrida itemEscolhido = montraItens.get(posicaoItem);//o item escolhido está nessa posição na montra de itens
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        int fichasPiloto = pilotoAtual.getFichasCorrida();
        int fichasItem = itemEscolhido.getPrecoFichasCorrida();


        if (fichasPiloto >= fichasItem) {//verificar se o piloto pode comprar o item escolhido
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

    /**
     * Método para vender veiculos
     * @param pilotoAtual recebe um piloto por parametro para operceber se o piloto tem fichas para comprar o veiculo escolhido e para adicionar oa veiculo atual do piloto
     * @param opcaoUtilizador recebe uma opção do utilizador baseada na impressão de veiculos
     */
    public void venderVeiculo(Piloto pilotoAtual, int opcaoUtilizador) {
            int posicaoVeiculo = opcaoUtilizador - 1;//como o arraylist inicia no 0 e a impressão dos itens inicia no 1, à opção do utilizador terá de ser diminuido 1
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
                    ((Carro) veiculoRemovido).removerMoficacao();
                }else if( veiculoRemovido instanceof Mota){
                    ((Mota) veiculoRemovido).removerHabilidades();
                }
            } else {
                System.out.println("Não tem fichas suficientes para comprar este Veículo.");
                VeiculosView veiculosView = new VeiculosView();
                OficinaController oficinaController = new OficinaController();
                veiculosView.menuVeiculos(pilotoAtual,oficinaController);
            }
        }

    }
