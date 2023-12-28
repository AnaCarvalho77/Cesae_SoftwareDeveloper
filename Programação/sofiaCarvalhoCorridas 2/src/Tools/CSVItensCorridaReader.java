package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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



            String tipoItem = linhaDividida[0];


            String id = linhaDividida[1];
            String nome = linhaDividida[2];
            int preco = Integer.parseInt(linhaDividida[3]);
            int diminuicaoDesgaste = Integer.parseInt(linhaDividida[4]);
            double diminuicaoPeso = Double.parseDouble(linhaDividida[5]);

            ArrayList<String> carrosPermitidos = new ArrayList<>();

            String [] permitidos = linhaDividida[6].split(",");
            Collections.addAll(carrosPermitidos, permitidos);
//            for(int i = 0; i < permitidos.length;i++){
//                carrosPermitidos.add(permitidos[i]);
//            }

            int aumentoPotencia = Integer.parseInt(linhaDividida[7]);


            if(tipoItem.equals("Modificacao")){
                Modificacao modificacaoAtual = new Modificacao(tipoItem,id,nome,preco,diminuicaoDesgaste,diminuicaoPeso,carrosPermitidos);
                arrayItensCorrida.add(modificacaoAtual);
            }else if (tipoItem.equals("Habilidade")){
                Habilidade habilidadeAtual = new Habilidade(tipoItem,id,nome, preco,aumentoPotencia);
                arrayItensCorrida.add(habilidadeAtual);
            }

        }

        return arrayItensCorrida;

    }

}
