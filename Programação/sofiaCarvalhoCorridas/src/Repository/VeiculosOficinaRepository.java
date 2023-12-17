package Repository;

import Domain.Veiculo;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VeiculosOficinaRepository {
    private ArrayList<Veiculo> garagem;

    public VeiculosOficinaRepository(String filePath) throws FileNotFoundException {
        CSVVeiculosOficinaReader csvVeiculosOficinaReader = new CSVVeiculosOficinaReader(filePath);
        this.garagem = csvVeiculosOficinaReader.readCSVToRepository();
    }


    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }
}
