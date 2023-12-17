package Repository;

import Domain.ItemCorrida;
import Domain.Veiculo;
import Tools.CSVItensCorridaReader;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ItensCorridaRepository {
    ArrayList<ItemCorrida> stock = new ArrayList<ItemCorrida>();

    public ItensCorridaRepository(String filePath) throws FileNotFoundException {
        CSVItensCorridaReader csvItensCorridaReader = new CSVItensCorridaReader(filePath);
        this.stock = csvItensCorridaReader.readCSVToRepository();
    }

    public ArrayList<ItemCorrida> getStock() {
        return stock;
    }
}
