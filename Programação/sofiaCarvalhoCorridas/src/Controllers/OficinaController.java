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
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/VeiculosCorridas.csv");
        this.garagem = garagemRepository.getGaragem();

      ItensCorridaRepository stockRepository = new ItensCorridaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/ItensCorrida.csv");
        this.stock = stockRepository.getStock();
    }

    public void imprimirStock(){
        Random random = new Random();
        ArrayList <ItemCorrida> stockCopia = this.stock;
        int numeroMenu = 1;
        for(int i = 0; i < 6; i++){
            int index = random.nextInt(0,stockCopia.size());
            ItemCorrida itemAtual = stockCopia.get(index);
            System.out.print( "Item número " + numeroMenu + ": ");
            numeroMenu++;
            itemAtual.mostrarDetalhes();
            stockCopia.remove(index);
            }
        }

    public void imprimirGaragem(){
        Random random = new Random();
        ArrayList <Veiculo> garagemCopia = this.garagem;
        for(int i = 0; i < 12; i++){
            int index = random.nextInt(0,garagemCopia.size());
            Veiculo veiculoAtual = garagemCopia.get(index);
            veiculoAtual.mostrarDetalhes();
            garagemCopia.remove(index);
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
            }
        }
    }

}
