package FichaPratica_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
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
        System.out.println("Factorial = " + num);


//        //Declarar variáveis
//        int numIni,num, aux, i, numSoma, j;
//
//        //Ler numero
//        System.out.print("Fatorial de: ");
//        numIni = input.nextInt();
//        num = numIni;
//        aux = num -1;
//        i = numIni - 2;
//        j = numIni - 1;
//
//        //Pedir números
//
//
//        if(numIni > 0){
//
//            while(aux > 1 ){
//                num += numIni;
//                aux--;
//            }
//            numSoma = num;
//            aux = 1;
//            while (aux <= (numIni-2) ){
//                while (i > 1){
//                    num = num + numSoma;
//                    i--;
//                }
//                numSoma = num;
//                j--;
//                i = j - 1;
//                aux++;
//            }
//
//
//        }else {
//            System.out.println("numero inválido");
//        }
//        System.out.println("Factorial = " + num);
    }
}
