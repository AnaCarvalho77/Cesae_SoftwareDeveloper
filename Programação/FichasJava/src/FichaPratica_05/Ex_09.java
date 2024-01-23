package FichaPratica_05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int i, j, soma = 0;
        int[][]num = new int[5][5];


        for (i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
                soma += num[i][j];
            }
        }

        System.out.println(soma);


        //Fechar objeto scanner
        input.close();
    }
}
