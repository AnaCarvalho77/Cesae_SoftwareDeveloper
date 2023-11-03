package FichaPratica_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        //Declarar variáveis
        int i, j, maior = 0, menor = 0;
        int[][] num = new int[3][3];


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
            }
        }

        menor = num[0][0];
        maior = num[0][0];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                        if(maior < num[i][j]){
                            maior = num[i][j];
                        }
                        if(menor > num[i][j]) {
                            menor = num[i][j];
                        }
                    }
            }


            for (i = 0; i < 3; i++) {
                System.out.println();
                for (j = 0; j < 3; j++) {
                    System.out.print(num[i][j] + " ");

                }
            }

            System.out.println();

            System.out.println("o maior número na matriz é o: " + maior);
        System.out.println("o menor número na matriz é o: " + menor);


            //Fechar objeto scanner
            input.close();
        }
    }

