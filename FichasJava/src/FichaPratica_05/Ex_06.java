package FichaPratica_05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
//Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i,j, aux = 0;
        int[] num =new int[10];


        for(i =0 ; i < 10; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            num [i] = input.nextInt();
        }
//        Arrays.sort(num);
        for(i = 0; i < 10; i++){
            for(j=i+1; j<10; j++){
                   if(num[i] > num[j]){
                       aux = num [i];
                       num[i] = num[j];
                       num[j] = aux;
                   }
            }
        }
        System.out.println();
        for(i=0; i<10; i++){
            System.out.println(num[i]);
        }


        //Fechar objeto scanner
        input.close();
    }
}
