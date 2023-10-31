package FichaPratica_05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, maior = 0;
        int[] num = new int[10];


        for (i = 0; i < 10; i++) {
            System.out.printf("insira um número [%d]: ", i);
            num[i] = input.nextInt();
        }

        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (num[j] > num[i] && num[j] % 2 == 0) {
                    maior = num[j];
                }
            }
        }
        if(num[0] > maior && num[0]%2==0){
            maior = num[0];
        }
        if (maior > 0) {
            System.out.println(maior);
        } else {
            System.out.println("Não existem números pares!!");
        }


        //Fechar objeto scanner
        input.close();
    }
}
