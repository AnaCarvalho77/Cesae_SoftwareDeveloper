package FichaPratica_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, numero, cont=0;
        int[][] num = new int[3][5];


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("insira um número [" + i + "][" + j + "]: ");
                num[i][j] = input.nextInt();
            }
        }

        System.out.println("qual número deseja verificar: ");
        numero = input.nextInt();

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                if (numero == num[i][j])
                    cont ++;
            }
        }

        if (cont > 0) {
            System.out.println("este múmero aparece " + cont + " vezes");
        } else {
            System.out.println("Este número não aparece nenhuma vez");
        }


        //Fechar objeto scanner
        input.close();
    }
}
