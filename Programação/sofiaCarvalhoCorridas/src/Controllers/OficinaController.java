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


    public OficinaController() throws FileNotFoundException {
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository("Ficheiros/VeiculosCorridas.csv");
        this.garagem = garagemRepository.getGaragem();

      ItensCorridaRepository stockRepository = new ItensCorridaRepository("Ficheiros/ItensCorrida.csv");
        this.stock = stockRepository.getStock();
    }


    public void imprimirStock(Piloto pilotoAtual){
        Random random = new Random();
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        ArrayList <ItemCorrida> stockCopia = new ArrayList<>();
        if(veiculoPiloto instanceof Carro){
            for(ItemCorrida itemAtual: stock){
                if(itemAtual.getTipo().equals("Modificacao")){
                    stockCopia.add(itemAtual);
                }
            }
        }else if(veiculoPiloto instanceof Mota){
            for(ItemCorrida itemAtual: stock){
                if(itemAtual.getTipo().equals("Habilidade")){
                    stockCopia.add(itemAtual);
                }
        }
        ArrayList<ItemCorrida> montraItens = new ArrayList<>(6);
        int numeroMenu = 1;
        for(int i = 0; i < 6; i++){
            int index = random.nextInt(0,stockCopia.size());
            ItemCorrida itemAtual = stockCopia.get(index);
            montraItens.add(itemAtual);
            stockCopia.remove(index);
            }
        for(ItemCorrida itemMontra:montraItens){
            System.out.print( "Item número " + numeroMenu + ": ");
            numeroMenu++;
            itemMontra.mostrarDetalhes();
        }

        }

    public void imprimirGaragem(){
        Random random = new Random();
        ArrayList <Veiculo> garagemCopia = this.garagem;
        ArrayList<Veiculo> montraVeiculos = new ArrayList<>(12);
        int numeroMenu = 1;
        for(int i = 0; i < 12; i++){
            int index = random.nextInt(0,garagemCopia.size());
            Veiculo veiculoAtual = garagemCopia.get(index);
            montraVeiculos.add(veiculoAtual);
            garagemCopia.remove(index);
        }
        for(Veiculo veiculoMontra:montraVeiculos){
            System.out.print( "Item número " + numeroMenu + ": ");
            numeroMenu++;
            veiculoMontra.mostrarDetalhes();
        }
    }

    public void venderItem(Piloto pilotoAtual, ItemCorrida itemAtual){
        int fichasPiloto = pilotoAtual.getFichasCorrida();
        int fichasItem = itemAtual.getPrecoFichasCorrida();
        if (fichasPiloto >= fichasItem){
            if (pilotoAtual.getVeiculoAtual()instanceof Carro){
                ArrayList<Modificacao> kitCorrida = new ArrayList<>();
                kitCorrida.add((Modificacao) itemAtual);
            }else if(pilotoAtual.getVeiculoAtual()instanceof Mota){
                ArrayList<Habilidade> habilidadesMota = new ArrayList<>();
                habilidadesMota.add((Habilidade) itemAtual);
            }else{
                System.out.println("Não tem fichas suficientes para adicionar este Item!");
            }
        }
    }
    public void venderVeiculo(Piloto pilotoAtual, Veiculo veiculoAtual){
        int fichasPiloto = pilotoAtual.getFichasCorrida();
        int fichasVeiculo = veiculoAtual.getPreco();
        if (fichasPiloto >= fichasVeiculo){
               pilotoAtual.setVeiculoAtual(veiculoAtual);
            }else{
            System.out.println("Não tem fichas suficientes para coprar este Veículo.");
        }
    }


}
