package FichaPratica_05;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
//Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i,j,z, aux = 0;
        int[] num =new int[4];


        for(i =0 ; i < 4; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            num [i] = input.nextInt();
            if(i >= 1 && num [i] < num [i - 1]){
                for (j = i-2; j >= 0;j--) {
                    if (num[i] > num[j]) {
                        aux = num[j + 1];
                        num[j + 1] = num[i];
                        
                        for (z = i; z > j + 1; z--){
                            num[z] = aux;

                            num[z] = num[j];
                            j++;
                        }

                    }
                }
            }



        }
        System.out.println();
        for(i=0; i<4; i++){
            System.out.println(num[i]);
        }


        //Fechar objeto scanner
        input.close();
    }
}
