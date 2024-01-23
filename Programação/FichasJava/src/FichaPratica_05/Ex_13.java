package FichaPratica_05;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, soma = 0;
        int[][] matriz = new int[4][4];


        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();

                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }


        for (i = 0; i < 4; i++) {
            System.out.println();
            for (j = 0; j < 4; j++) {
                if (matriz[i][j] > 9) {
                    System.out.print(matriz[i][j] + "   ");
                } else if (matriz[i][j] > 10) {
                    System.out.print(matriz[i][j] + "  ");

                } else {
                    System.out.print( matriz[i][j] +"    ");
                }
            }
        }
        System.out.println();

            System.out.println("a soma da diagonal principal é: " + soma);
            //Fechar objeto scanner
            input.close();

    }
}