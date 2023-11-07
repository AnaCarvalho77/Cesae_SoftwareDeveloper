package FichaPratica_06;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, aux = 0;
        int[] num = new int[9];
        boolean crescente = true;


        for (i = 0; i < num.length; i++) {
            System.out.printf("insira um número [%d]: ", i);
            num[i] = input.nextInt();
        }
//        Arrays.sort(num);
        for (i = 0; i < num.length; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }
        System.out.println();
        for (i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
