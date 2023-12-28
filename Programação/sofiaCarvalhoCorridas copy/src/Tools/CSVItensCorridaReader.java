package Tools;

import Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CSVItensCorridaReader {
    private String filePath;

    /**
     * Método construtor da classe CSVItensCorridaReader que recebe como parametros:
     * @param filePath caminho do ficheiro da qual vai ser retirada a informação de itens a ser tratada
     */
    public CSVItensCorridaReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Método para ler o ficheiro CSV com informação dos itens para oraganizá-la para o repositório de itens
     * @return retorna um arraylist de itens de corrida
     * @throws FileNotFoundException
     */
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

            ArrayList<String> carrosPermitidos = new ArrayList<>();//criei um arraylist de strings para adicionar os carros permitidos

            String [] permitidos = linhaDividida[6].split(",");// fiz um split por virgula e guardei num vector os carros perimitidos
            Collections.addAll(carrosPermitidos, permitidos);// adicionei todos os elementos do vetor ao arraylist de carros permitidos
            // o IDE sugeriu o uso desta função acima mas deixei o código original comentado abaixo
//            for(int i = 0; i < permitidos.length;i++){
//                carrosPermitidos.add(permitidos[i]);
//            }

            int aumentoPotencia = Integer.parseInt(linhaDividida[7]);

            //para adicionar os itens ao arraylist criei um objeto de moficicação e outro de habilidade consoante o tipo de item
            if(tipoItem.equals("Modificacao")){
                Modificacao modificacaoAtual = new Modificacao(tipoItem,id,nome,preco,diminuicaoDesgaste,diminuicaoPeso);
                arrayItensCorrida.add(modificacaoAtual);
            }else if (tipoItem.equals("Habilidade")){
                Habilidade habilidadeAtual = new Habilidade(tipoItem,id,nome, preco,aumentoPotencia);
                arrayItensCorrida.add(habilidadeAtual);
            }

        }

        return arrayItensCorrida;

    }

}
