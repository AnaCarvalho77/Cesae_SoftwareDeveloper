package Repository;

import Domain.Veiculo;
import Tools.CSVVeiculosOficinaReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VeiculosOficinaRepository {
    private ArrayList<Veiculo> garagem;

    /**
     * Método para criar o repositório de veiculos
     * @param filePath recebe o caminho do ficheiro com a informação como parâmetro
     * @throws FileNotFoundException
     */
    public VeiculosOficinaRepository(String filePath) throws FileNotFoundException {
        CSVVeiculosOficinaReader csvVeiculosOficinaReader = new CSVVeiculosOficinaReader(filePath);
        this.garagem = csvVeiculosOficinaReader.readCSVToRepository();
    }

    /**
     * Método para obter o arraylist de veiculos
     * @return (garagem) o arraylist de veiculos
     */
    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }
}
