package Repository;

import Domain.Venda;
import Tools.CSVVendasReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasRepository {
    private ArrayList<Venda> vendaArray;

    /**
     * Mnetodo para guardar arraylist com as vendas todas do ficheiro que recebe como parametro:
     * @param filePath - o caminho para o ficheiro
     * @throws FileNotFoundException
     */
    public VendasRepository(String filePath) throws FileNotFoundException {
        //criar objeto da classe CSVVendasReader que recebe como parametro o caminho
        CSVVendasReader csvVendasReader = new CSVVendasReader(filePath);
        //guardamos no arraylist do total das vendas o arraylist retornado na leitura do ficheiro
        this.vendaArray = csvVendasReader.readCSVToRepository();
    }

    public ArrayList<Venda> getVendaArray() {
        return vendaArray;
    }
}
