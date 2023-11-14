package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws FileNotFoundException {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Introduza uma palavra: ");
        String palavraPedida = input.next();
        //Fechar objeto scanner
        input.close();

        Scanner fichOrigem = new Scanner(new File("Ficheiros/exercicio_08.txt"));

        File novoFicheiro = new File("Ficheiros/exercicio_08teste.txt");

        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);




        while (fichOrigem.hasNextLine()) {
            String linha = fichOrigem.nextLine();
            linha = linha.replace(",", "");
            linha = linha.replace(".", "");
            String[] palavras = linha.split(" ");
            for (int i = 0; i < palavras.length; i++) {
                if (palavraPedida.equals(palavras[i])) {
                  escritaNoFicheiro.println(linha);
                }
            }

        }

        escritaNoFicheiro.close();


    }
}

