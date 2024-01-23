package FichaPratica_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {


        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double num1, num2, soma, subt, mult, divisao;

        //Ler num1
        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        //Calcular soma
        soma = num1 + num2;

        //Calcular Subtração
        subt = num1 - num2;

        //Calcular Multiplicação
        mult = num1 * num2;

        //Calcular divisão
        divisao = num1 / num2;

        //Apresentar resultados
        System.out.println("Soma:" + soma);
        System.out.println("Subtração:" + subt);
        System.out.println("Multiplicação:" + mult);
        System.out.println("Divisão:" + divisao);


    }
}
