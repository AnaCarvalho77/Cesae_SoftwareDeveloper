package FichaPratica_05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i, maior = 0;
        int[] num =new int[10];

        System.out.printf("insira um número [0]: ");
        num [0] = input.nextInt();
        maior = num[0];

        for(i = 1 ; i < 9; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            num [i] = input.nextInt();
            if(i >= 1 && num [i] > maior)
                    maior = num[i];


        }
        System.out.println();
        System.out.println(maior);

        //Fechar objeto scanner
        input.close();
    }
}
