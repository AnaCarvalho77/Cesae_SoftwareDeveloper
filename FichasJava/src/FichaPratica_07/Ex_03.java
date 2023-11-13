package FichaPratica_07;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica_07.BibliotecaFicheiros.*;

public class Ex_03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("Ficheiros/exercicio_03.txt"));

        String conteudo;

        File novoFicheiro = new File("Ficheiros/exercicio3(1).txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);



        while (fileScanner.hasNextLine()) {
            conteudo = fileScanner.nextLine();
            escritaNoFicheiro.println(conteudo);
        }

        escritaNoFicheiro.close();

    }
}
