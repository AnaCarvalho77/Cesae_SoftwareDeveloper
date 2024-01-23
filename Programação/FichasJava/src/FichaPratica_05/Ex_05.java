package FichaPratica_05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i, cont = 0, media = 0;
        int[] num =new int[10];


        for(i = 0 ; i < 10; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            num [i] = input.nextInt();
            media += num[i];
            cont++;
        }
        media = media/cont;

        System.out.println();
        System.out.println(media);

        //Fechar objeto scanner
        input.close();
    }
}
