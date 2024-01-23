package FichaPratica_05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i, menor = 0;
        int[] num =new int[10];

        System.out.printf("insira um número [%d]: ",0);
        num [0] = input.nextInt();
        menor = num[0];


        for(i = 1 ; i < 9; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            num [i] = input.nextInt();
            if(i >= 1 && num [i] < menor)
                menor = num[i];


        }
        System.out.println();
        System.out.println(menor);

        //Fechar objeto scanner
        input.close();
    }
}
