package Tools;

import Domain.Utilizador;
import Domain.Venda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVLoginReader {
    private String filePath;

    /**
     * Construtor que recebe uma String caminho do ficheiro
     * @param filePath
     */
    public CSVLoginReader(String filePath) {
        this.filePath = filePath;
    }

    /**
     * método para ler ficheiro CSV com utilizadores
     * @return retorna um arraylist de utilizadores
     * @throws FileNotFoundException
     */
    public ArrayList<Utilizador> readCSVToRepository() throws FileNotFoundException {

        File file = new File(this.filePath);
        Scanner scanner = new Scanner(file);

        String linha = scanner.nextLine();

        //iniciar uma arraylist de utilizadores vazio
        ArrayList<Utilizador> arrayUsers = new ArrayList<>();

        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipoConta = linhaDividida[0];
            String utilizador = linhaDividida[1];
            String password = linhaDividida[2];

            //criar um objeto de Utilizador com os parametros recolhidos do ficheiro
            Utilizador utilizadorAtual = new Utilizador(tipoConta,utilizador,password);

            //adicionar o utilizador ao arraylist de Utilizadores
            arrayUsers.add(utilizadorAtual);

        }

        return arrayUsers;
    }
}
