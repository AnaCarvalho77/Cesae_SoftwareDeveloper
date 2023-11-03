package FichaPratica_05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i;
        int[] vetor =new int[10];

        for(i = 0 ; i < 10; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            vetor [i] = input.nextInt();

        }
        System.out.println();
        for(i = 0; i < 10; i++){
            System.out.print("|" + vetor[i] + "| ");
        }

        //Fechar objeto scanner
        input.close();
    }
}
