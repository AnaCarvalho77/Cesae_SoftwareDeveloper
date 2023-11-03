package FichaPratica_05;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i, j;
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[][] matriz = new int[10][2];


        for(i = 0 ; i < 10; i++ ){
            System.out.printf("insira um número para vetor 1 posição [%d]: ",i);
            vetor1 [i] = input.nextInt();
            matriz[i][0] = vetor1[i];
        }
        for(i = 0 ; i < 10; i++ ){
            System.out.printf("insira um número para vetor2 posição [%d]: ",i);
            vetor2 [i] = input.nextInt();
            matriz [i][1] = vetor2[i];
        }


        for(i=0; i<10;i++){
            System.out.println();
            for(j=0;j<2;j++){
                System.out.print("   " + matriz[i][j] + "   ");
            }
        }


        //Fechar objeto scanner
        input.close();
    }
}
