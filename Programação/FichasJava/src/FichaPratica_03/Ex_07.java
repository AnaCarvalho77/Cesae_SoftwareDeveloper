package FichaPratica_03;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num, min, max;

        //Ler numero
        System.out.print("Insira o numero: ");
        num = input.nextInt();

        min = num - 5;

        max = num + 5;

        //imprimir 5 antes e 5 depois

        while(num > min) {
            System.out.println(min);
            min += 1;
        }

        System.out.println("\n");

        while(num < max) {
            num += 1;
            System.out.println(num);
        }
    }
}
