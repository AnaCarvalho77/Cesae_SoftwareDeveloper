package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static FichaPratica_07.BibliotecaFicheiros.*;

public class Ex_02 {
    public static void main(String[] args) throws FileNotFoundException {
//
//        // Criar o novo ficheiro
//        File novoFicheiro = new File("Ficheiros/exercicio_02.txt");
//
//        // Criar um maquina de escrever naquele ficheiro
//        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);
//
//        String mensagem = "Vai todo mundo ficar bem empregado no final do curso!";
//
//        escritaNoFicheiro.println(mensagem);
//
//
//
//        escritaNoFicheiro.close();
        String conteudo = "Vai todo mundo ficar bem empregado no final do curso!";
        criarFicheiroEscrever("Ficheiros/exercicio_02.txt", conteudo);
    }
}
