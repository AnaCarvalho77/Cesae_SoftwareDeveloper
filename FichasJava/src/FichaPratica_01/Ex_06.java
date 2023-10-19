package FichaPratica_01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int valor1, valor2, perm = 0;

        //Ler valor1
        System.out.print("Insira o valor 1: ");
        valor1 = input.nextInt();

        //Ler valor2
        System.out.print("Insira o valor 2: ");
        valor2 = input.nextInt();

        //Permutar os valores
        perm = valor1;
        valor1 = valor2;
        valor2 = perm;


        //Apresentar resultados
        System.out.println("Valor 1:" + valor1);
        System.out.println("Valor 2:" + valor2);
    }
}
