package FichaPratica_01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2, soma;

        //Ler num1
        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        //Calcular soma
        soma = num1 + num2;

        //Apresentar soma
        System.out.println("Soma:" + soma);


    }
}
