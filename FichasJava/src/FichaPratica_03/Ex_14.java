package FichaPratica_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

      /*  //Declarar variáveis
        int num, aux = 0;

        //Ler numero
        System.out.print("Fatorial de: ");
        num = input.nextInt();
        aux = num -1;

        //Pedir números


        if(num > 0){
            while(aux >= 1 ){
                num *= aux;
                aux--;
            }
        }else {
            System.out.println("numero inválido");
        }
        System.out.println("Factorial = " + num);*/


        //Declarar variáveis
        int num, aux = 0, n = 1;

        //Ler numero
        System.out.print("Fatorial de: ");
        num = input.nextInt();
        aux = num -1;

        //Pedir números


        if(num > 0){
            while(aux >= 1 ){
                num =;
                aux--;
            }
        }else {
            System.out.println("numero inválido");
        }
        System.out.println("Factorial = " + num);
    }
}
