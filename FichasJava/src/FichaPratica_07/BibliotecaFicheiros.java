package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BibliotecaFicheiros {
    public static void imprimirFicheiro(String caminho) throws FileNotFoundException {

        Scanner fileScanner = new Scanner(new File(caminho));

        String linha;

        while (fileScanner.hasNextLine()) {
            linha = fileScanner.nextLine();
            System.out.println(linha);
        }
    }

    public static void criarFicheiroEscrever(String caminho, String mensagem) throws FileNotFoundException {
        // Criar o novo ficheiro
        File novoFicheiro = new File(caminho);

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        escritaNoFicheiro.println(mensagem);


        escritaNoFicheiro.close();
    }


}

