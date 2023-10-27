package FichaPratica_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int max, cont = 0, numero, aux, check = 0;

        //Ler numero
        System.out.print("Quantos números deseja imprimir: ");
        max = input.nextInt();


        //Pedir números
        while (cont != max){
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            aux = numero;
            if (numero <= aux){
                check++ ;
            }
            aux = numero;
            cont ++;
        }

        if (check > 0){
            System.out.println("Não Crescente");
        }else{
            System.out.println("Crescente");
        }


    }
}
