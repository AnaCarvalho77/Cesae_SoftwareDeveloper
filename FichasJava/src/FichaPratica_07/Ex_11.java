package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {

    public static void pesquisarMusicaGenero(String[][] matriz, String genero) {
        String[] musicasGenero = new String[matriz.length];
        int indexAtual = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][2].equals(genero) ) {
                musicasGenero[indexAtual] = matriz[i][0];
                indexAtual++;
            }
        }
        for (int i = 0; i < musicasGenero.length; i++) {
            if (musicasGenero[i] != null) {
                System.out.println(musicasGenero[i]);
            }
        }
    }

    public static void pesquisarMusicaArtista(String[][] matriz, String artista) {
        String[] musicasArtista = new String[matriz.length];
        int indexAtual = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1].equals(artista)) {
                musicasArtista[indexAtual] = matriz[i][0];
                indexAtual++;
            }
        }
        for (int i = 0; i < musicasArtista.length; i++) {
            if (musicasArtista[i] != null) {
                System.out.println(musicasArtista[i]);
            }

        }
    }

    public static void musicaMaior(String[][] matriz) {
        String maior,linha;
        int indexAtual = 0;
        for (int i = 0; i < matriz.length; i++) {
                linha = matriz[i][3];
                indexAtual++;
            }
        }
        for (int i = 0; i < musicasArtista.length; i++) {
            if (!musicasArtista[i].equals(null)) {
                System.out.println(musicasArtista[i]);
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fichOrigem = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        int contLinhas = 0, contColunas = 0;
        while (fichOrigem.hasNextLine()) {
            String linha = fichOrigem.nextLine();
            String[] itens = linha.split(",");
            contColunas = itens.length;
            contLinhas++;

        }
        fichOrigem.close();
        Scanner fichOrigem2 = new Scanner(new File("Ficheiros/exercicio_11.csv"));

        String nomeMusica, artista, genero, opcao;
        int horas, minutos, nLinha = 0;

        String[][] matriz = new String[contLinhas - 1][contColunas];
        String linha = fichOrigem2.nextLine();

        while (fichOrigem2.hasNextLine()) {
            linha = fichOrigem2.nextLine();
            String[] itens = linha.split(",");

            for (int i = 0; i < itens.length; i++) {
                matriz[nLinha][i] = itens[i];
            }
            nLinha++;

        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Escolha uma opcao:");
        System.out.println("1. Pesquisar por músicas de um determinado género");
        System.out.println("2. Pesquisar músicas de um determinado artista. ");
        System.out.println("3. Pesquisar música com maior duração");
        System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
        System.out.println("5. Número de músicas no ficheiro");
        opcao = input.next();


        switch (opcao) {
            case "1":
                System.out.println("Qual o género: ");
                genero = input.next();
                pesquisarMusicaGenero(matriz, genero);
                break;

            case "2":
                System.out.println("Qual o artista: ");
                artista = input.next();
                pesquisarMusicaArtista(matriz, artista);
                break;

//            case"3":

            default:
                System.out.println("Erro!número opção não contemplado.");


        }


    }

}
