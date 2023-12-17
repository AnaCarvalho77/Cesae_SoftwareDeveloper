package Tools;

import Domain.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVVendasReader {

    private String filePath;

    /**
     * Metodo construtor qur recebe como parametros:
     * @param filePath - caminho para o ficheiro
     */
    public CSVVendasReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * metodo paera ler o ficheiro CSS de Venda
     * @return aarraylist de Venda
     * @throws FileNotFoundException
     */
    public ArrayList<Venda> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        //iniciar arraylist de venda (que vai ser cada linha do ficheiro de vendas
        ArrayList<Venda> arrayVendas = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(",");

            String tipoProduto = linhaDividida[0];
            String produto = linhaDividida[1];
            double quantidadeVendida = Double.parseDouble(linhaDividida[2]);
            double precoUnitario = Double.parseDouble(linhaDividida[3]);

            //criar objeto de Venda com dados do ficheiro
            Venda vendaAtual = new Venda(tipoProduto, produto, quantidadeVendida, precoUnitario);
            //Solução condensada: Venda vendaAtual1 = new Venda(linhaDividida[0],linhaDividida[1],Double.parseDouble(linhaDividida[2]),Double.parseDouble(linhaDividida[3]));


            //adicionar a vanda ao arraylist
            arrayVendas.add(vendaAtual);

        }

        return arrayVendas;

    }
}
