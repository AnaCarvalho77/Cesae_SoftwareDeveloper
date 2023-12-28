package Repository;

import Domain.ItemCorrida;
import Domain.Veiculo;
import Tools.CSVItensCorridaReader;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ItensCorridaRepository {

    private ArrayList<ItemCorrida> stock = new ArrayList<ItemCorrida>();

    /**
     * Método para criar um repositório de Itens de Corrida
     * @param filePath recebe o caminho do ficheiro onde está a informação como parâmetro
     * @throws FileNotFoundException
     */
    public ItensCorridaRepository(String filePath) throws FileNotFoundException {
        CSVItensCorridaReader csvItensCorridaReader = new CSVItensCorridaReader(filePath);
        this.stock = csvItensCorridaReader.readCSVToRepository();
    }

    /**
     * Método para obter o arraylist de Itens de Corrida
     * @return (stock) o arraylist de itens de corrida
     */
    public ArrayList<ItemCorrida> getStock() {
        return stock;
    }
}
