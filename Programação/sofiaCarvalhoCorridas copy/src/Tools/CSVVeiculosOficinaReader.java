package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CSVVeiculosOficinaReader {
    private String filePath;

    public CSVVeiculosOficinaReader(String filePath) {
        this.filePath = filePath;
    }

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
