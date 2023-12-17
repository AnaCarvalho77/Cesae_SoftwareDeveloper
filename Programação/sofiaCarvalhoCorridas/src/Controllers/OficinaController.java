package Controllers;

import Domain.ItemCorrida;
import Domain.Veiculo;
import Repository.ItensCorridaRepository;
import Repository.VeiculosOficinaRepository;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class OficinaController {
    private ArrayList<Veiculo> garagem;
    private ArrayList<ItemCorrida> stock;


    public OficinaController(String filePath) throws FileNotFoundException {
        VeiculosOficinaRepository garagemRepository = new VeiculosOficinaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/VeiculosCorridas.csv");
        this.garagem = garagemRepository.getGaragem();

      ItensCorridaRepository stockRepository = new ItensCorridaRepository("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/sofiaCarvalhoCorridas/Ficheiros/ItensCorrida.csv");
        this.stock = stockRepository.getStock();
    }

    public void imprimirStock(){
        Random random = new Random();
        for(int i = 0; i < 6; i++){
            ArrayList <String> indexes = new ArrayList<>();
            int index = random.nextInt(0,this.stock.size());

            for (ItemCorrida itemAtual: stock) {
                itemAtual.mostrarDetalhes();
            }
        }
    }


}
