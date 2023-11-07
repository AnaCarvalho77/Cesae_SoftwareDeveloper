package FichaPratica_06;

import java.util.Scanner;

public class Ex_07 {
    static void quadrado(String letra, int linhas, int colunas) {
        int i, j;
        String[][] vetor = new String[linhas][colunas];

        for (i = 0; i < linhas; i++) {
            for (j=0; j< colunas; j++) {
                vetor [i][j] = " ";
                vetor[0][j] = letra;
                vetor[linhas - 1][j] = letra;
                vetor[i][0] = letra;
                vetor[i][colunas - 1] = letra;
            }
        }


        for (i = 0; i < linhas; i++) {
            System.out.println();
            for (j = 0; j < colunas; j++) {
                System.out.print(vetor[i][j]);
            }
        }
}

        public static void main (String[]args){

            //Instanciar o Scanner
            Scanner input = new Scanner(System.in);

            int linhas, colunas;
            String letra;

            System.out.print("Introduza um carater: ");
            letra = input.next();
            System.out.print("Introduza o número de Linhas: ");
            linhas = input.nextInt();
            System.out.print("Introduza o número de Colunas: ");
            colunas = input.nextInt();

        quadrado(letra, linhas, colunas);
        }
    }

