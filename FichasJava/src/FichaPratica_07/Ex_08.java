package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ficheiroOrigem = new Scanner(new File("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/FichasJava/Ficheiros/exercicio_08.txt"));

        String conteudo;

        File novoFicheiro = new File("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/FichasJava/Ficheiros/exercicio_08teste.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);



        while (ficheiroOrigem.hasNextLine()) {
            conteudo = ficheiroOrigem.nextLine();
            escritaNoFicheiro.println(conteudo);
        }

        escritaNoFicheiro.close();


    }
}
