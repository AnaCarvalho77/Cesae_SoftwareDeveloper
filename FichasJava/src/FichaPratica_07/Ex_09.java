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

        int contPalavras = 0;

        while (fichOrigem.hasNextLine()) {
            String linha = fichOrigem.nextLine();
            String[] palavras = linha.split(" ");
            contPalavras += palavras.length;

        }
        fichOrigem.close();
        String[] palavrasTodas = new String[contPalavras];

        int cont = 0, contMaior = 0;

        Scanner fichOrigem2 = new Scanner(new File("Ficheiros/exercicio_09.txt"));
        while (fichOrigem2.hasNextLine()) {
            String linha = fichOrigem2.nextLine();
            String[] palavra = linha.split(" ");
            for (int i = 0; i < palavra.length; i++) {
                palavrasTodas[cont] = palavra[i] ;
                cont += 1;

            }

        }
        String maisVezes = palavrasTodas[0];

        for (int i = 0; i < palavrasTodas.length; i++) {
            for (int j = i + 1; j < palavrasTodas.length; j++) {
                if (palavrasTodas[i].equals(palavrasTodas[j])) {
                    cont++;
                    if (cont > contMaior) {
                        contMaior = cont;
                        maisVezes = palavrasTodas[i];
                    }
                }
            }
        }
        System.out.println(maisVezes);
    }
}
