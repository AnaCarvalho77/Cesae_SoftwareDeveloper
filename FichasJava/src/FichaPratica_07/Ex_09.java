package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fichOrigem = new Scanner(new File("Ficheiros/exercicio_09.txt"));

        File novoFicheiro = new File("Ficheiros/exercicio_09teste.txt");
        // Criar um maquina de escrever naquele ficheiro
        PrintWriter escritaNoFicheiro = new PrintWriter(novoFicheiro);

        int contPalavras= 0;

        while (fichOrigem.hasNextLine()) {
            String linha = fichOrigem.nextLine();
            String[] palavras = linha.split(" ");
            contPalavras += palavras.length;

        }

        String[] palavrasTodas = new String[contPalavras];
        int cont=0;

        while (fichOrigem.hasNextLine()) {
            String linha = fichOrigem.next();
            String[] palavra = linha.split(" ");
            for(int i = cont; i < contPalavras; i++){
                for(int j = 0; j <palavra.length; j++){
                    palavra[j] = palavrasTodas[i];
                    cont += i;

                }
            }
            }


        while (fichNovo.hasNext()) {
            String[] palavra = new String[]{fichNovo.next()};
            for(int i=1; i< palavra.length;i++){
                for(int j=0; j<= i; j++){
                    if(palavra[j].equals(palavra[i]))
                }
        }





    }
    }
}
