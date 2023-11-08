package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_06 {
    static double somatorio(int num){

        int soma = 0, i;

//        String numero = Integer.toString(num);
//        char[]  arrayNumero = numero.toCharArray();
//        int [] array = new int[arrayNumero.length];
//
//        for(i=0; i< arrayNumero.length; i++ ){
//            array[i] = Integer.parseInt(String.valueOf(arrayNumero[i]));
//        }
//
//        for(i=0; i< arrayNumero.length;i++){
//            soma += array[i];
//        }

        
        return soma;
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        int num;

        System.out.print("Digitte um número: ");
        num = input.nextInt();

        System.out.println(somatorio(num));


    }
}
