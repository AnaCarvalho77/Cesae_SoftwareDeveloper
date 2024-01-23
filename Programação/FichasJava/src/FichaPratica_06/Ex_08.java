package FichaPratica_06;

import java.util.Scanner;

public class Ex_08 {

    /**
     * Método para somar duas matrizes
     * @param matriz1 - primeira matriz para adicionar
     * @param matriz2 - segunda matriz para adicionar
     */

    static void somarMatrizes(int[][]matriz1, int [][] matriz2){
        int i, j;
        int[][]soma = new int[matriz1.length][matriz1[0].length];

        for (i = 0; i < matriz1.length; i++){
            for(j = 0; j < matriz1[0].length; j++){
              soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (i = 0; i < soma.length; i++){
            System.out.println();
            for(j = 0; j < soma[0].length; j++){
                System.out.print(soma [i][j] + " ");
            }
        }
    }

    /**
     * Método para somar todos os elementos de duas matrizes
     * @param matriz1 - primeira matriz a ser somada
     * @param matriz2 - segunda matriz a ser somada
     * @return total - número do somatório de todos os elementos das matrizes
     */
    static int somatorioMatrizes(int[][]matriz1, int [][] matriz2){
        int i, j, somatorio = 0;

        for (i = 0; i < matriz1.length; i++){
            for(j = 0; j < matriz1[0].length; j++){
                somatorio = somatorio + matriz1[i][j] + matriz2[i][j];
            }
        }

        return somatorio;

    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);
        int linhas, colunas, somatorio, i,j;

        System.out.println("inroduza o numero de linhas: ");
        linhas = input.nextInt();
        System.out.println("inroduza o numero de colunas: ");
        colunas = input.nextInt();

        int[][]matriz1 = new int[linhas][colunas];
        int[][]matriz2 = new int[linhas][colunas];

        for (i = 0; i < matriz1.length; i++) {
            for(j = 0; j < matriz1[0].length; j++) {
                System.out.print("para a primeira matriz: insira o número [" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < matriz2.length; i++) {
            for(j = 0; j < matriz2[0].length; j++) {
                System.out.print("para a segunda matriz: insira o número [" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        somarMatrizes(matriz1, matriz2);
        somatorio = somatorioMatrizes(matriz1,matriz2);

        System.out.println();
        System.out.println();
        System.out.println(somatorio);
    }
}

