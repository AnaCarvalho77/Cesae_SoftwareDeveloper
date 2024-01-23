package FichaPratica_05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int i, j;
        int[][]num = new int[3][3];


        for (i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            System.out.println();
            for (j = 0; j < 3; j++) {
                System.out.print(num[i][j] + " ");
                }
            }


        //Fechar objeto scanner
        input.close();
    }
}
