package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVItensCorridaReader {
    private String filePath;

    public CSVItensCorridaReader(String filePath) {
        this.filePath = filePath;
    }

    public ArrayList<ItemCorrida> readCSVToRepository() throws FileNotFoundException {



        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        ArrayList<ItemCorrida> arrayItensCorrida = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");



            String tipoVeiculo = linhaDividida[0];

            String marca = linhaDividida[1];
            String modelo = linhaDividida[2];
            int potenciaCV = Integer.parseInt(linhaDividida[3]);
            double pesoKg = Double.parseDouble(linhaDividida[4]);
            int preco = Integer.parseInt(linhaDividida[5]);
            if(tipoVeiculo.equals("Carro")){
                TipoCarro tipoCarro = TipoCarro.valueOf(linhaDividida[6]);
                Carro carroAtual = new Carro(marca,modelo,potenciaCV,pesoKg,preco);
                arrayVeiculosOficina.add(carroAtual);
            }else if (tipoVeiculo.equals("Mota")){
                Mota motaAtual = new Mota(marca, modelo, potenciaCV, pesoKg, preco);
                arrayVeiculosOficina.add(motaAtual);
            }

        }

        return arrayVeiculosOficina;

    }
}
