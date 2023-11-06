package FichaPratica_05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, maior;
        int[] num = new int[10];
        maior = -1;


        for (i = 0; i < num.length; i++) {
            System.out.printf("insira um número [%d]: ", i);
            num[i] = input.nextInt();
        }


        for (i = 0; i < num.length; i++) {
                if ((num[i] > maior || maior ==-1) && num[i] % 2 == 0) {
                    maior = num[i];
                }
        }

        if (maior % 2 == 0) {
            System.out.println(maior);
        } else {
            System.out.println("Não existem números pares!!");
        }


        //Fechar objeto scanner
        input.close();
    }
}
