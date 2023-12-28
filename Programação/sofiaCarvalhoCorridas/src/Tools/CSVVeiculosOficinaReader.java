package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CSVVeiculosOficinaReader {
    private String filePath;

    /**
     * Método construtor da classe CSVVeiculosOficinaReader que recebe como parâmetro:
     * @param filePath o caminho do ficheiro CSV onde está a informação de veiculos a ler e tratar
     */
    public CSVVeiculosOficinaReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Método paea ler e tratar a informação contida no ficheiro CSV
     * @return retorna um arraylist de veiculos
     * @throws FileNotFoundException
     */
    public ArrayList<Veiculo> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<Veiculo> arrayGaragem = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");



            String tipoVeiculo = linhaDividida[0];

            String id = linhaDividida[1];
            String marca = linhaDividida[2];
            String modelo = linhaDividida[3];
            int potenciaCV = parseInt(linhaDividida[4]);
            double pesoKg = Double.parseDouble(linhaDividida[5]);
            int desgaste = parseInt(linhaDividida[8]);
            int preco = parseInt(linhaDividida[6]);
            //Para adicionar ao arraylist de veiculos criei um objeto da subclasse carro e da subclasse mota consoante o tipo de veiculo
            if(tipoVeiculo.equals("Carro")){
                TipoCarro tipoCarro = TipoCarro.valueOf(linhaDividida[7]);
                Carro carroAtual = new Carro(id,marca,modelo,potenciaCV,pesoKg,desgaste,preco,tipoCarro);
                arrayGaragem.add(carroAtual);
            }else if (tipoVeiculo.equals("Mota")){
                Mota motaAtual = new Mota(id,marca, modelo, potenciaCV, pesoKg,desgaste, preco);
                arrayGaragem.add(motaAtual);
            }

        }

        return arrayGaragem;

    }
}
