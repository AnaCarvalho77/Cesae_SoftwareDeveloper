package FichaPratica_06;

import java.util.Scanner;

public class Ex_08 {
    static int somarMatrizes(int[][]matriz1, int [][] matriz2){
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
                System.out.println(soma [i][j]);
            }
        }
    }

    static int somatorioMatrizes(int[][]matriz1, int [][] matriz2){
        int i, j, total;
        int[][]somatorio = new int[matriz1.length][matriz1[0].length];

        for (i = 0; i < matriz1.length; i++){
            for(j = 0; j < matriz1[0].length; j++){
                somatorio[i][j] = matriz1[i][j] + matriz2[i][j];
                total  +=  (somatorio[i][j] +somatorio[i-1][j-1]);
            }
        }


    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);
        int linhas, colunas, somatorio;

        System.out.println("inroduza o numero de linhas: ");
        linhas = input.nextInt();
        System.out.println("inroduza o numero de colunas: ");
        colunas = input.nextInt();

        int[][]matriz1 = new int[linhas][colunas];
        int[][]matriz2 = new int[linhas][colunas];

        somarMatrizes(matriz1, matriz2);
    }
}

