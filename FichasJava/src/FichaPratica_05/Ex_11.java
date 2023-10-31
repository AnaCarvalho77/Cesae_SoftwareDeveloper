package FichaPratica_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int i, j, z, w, maior = 0;
        int[][] num = new int[3][3];


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (z = i; z < 3; z++) {
                    for (w = 0; w < 3; w++) {
                        if (num[z][w] > num[i][j]) {
                            maior = num[z][w];
                        }
                    }
                }
            }
            }
            if (num[0][0] > maior)
                maior = num[0][0];

            for (i = 0; i < 3; i++) {
                System.out.println();
                for (j = 0; j < 3; j++) {
                    System.out.print(num[i][j] + " ");

                }
            }

            System.out.println();

            System.out.println("o maior número na matriz é o: " + maior);


            //Fechar objeto scanner
            input.close();
        }
    }

