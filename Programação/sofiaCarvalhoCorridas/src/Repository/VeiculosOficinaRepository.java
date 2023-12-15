package Repository;

import Domain.Veiculo;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VeiculosOficinaRepository {
    private ArrayList<Veiculo> veiculosOficina;

    public VeiculosOficinaRepository(String filePath) throws FileNotFoundException {
        CSVVeiculosOficinaReader csvVeiculosOficinaReader = new CSVVeiculosOficinaReader(filePath);
        this.veiculosOficina = csvVeiculosOficinaReader.readCSVToRepository();
    }


    public ArrayList<Veiculo> getVeiculosOficina() {
        return veiculosOficina;
    }
}
