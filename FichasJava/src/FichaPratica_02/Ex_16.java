package FichaPratica_02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int valor, notas, num3;

        //Ler nota1
        System.out.print("Insira um valor em euros (múltiplo de 5): ");
        valor = input.nextInt();


        //Ver se valor múltiplo de 5
        if (valor % 5 == 0){
            System.out.print("O valor inserido foi: " + valor);
            notas = valor / 200;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 200" );

            valor -= (notas * 200);
            notas = valor / 100;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 100" );

            valor -= (notas * 100);
            notas = valor / 50;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 50" );

            valor -= (notas * 50);
            notas = valor / 20;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 20" );

            valor -= (notas * 20);
            notas = valor / 10;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 10" );

            valor -= (notas * 10);
            notas = valor / 5;
            if(notas != 0)
                System.out.print("\n" + notas + " notas de 5" );
        } else{
            System.out.println("ERRO!!Este valor não é múltiplo de 5");
        }

        //Fechar objeto scanner
        input.close();
    }
}
