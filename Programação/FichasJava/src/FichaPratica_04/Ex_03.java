package FichaPratica_04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double num1, num2, i = 0;
        String opcao;

            //Ler num1
        do{
            System.out.print("Jogador 1, insira um número entre 0 e 100:  ");
            num1 = input.nextDouble();
        }while (num1 < 0 || num1 > 100);

                //Ler num2
                do {
                    System.out.print("Jogador 2, insira um número: ");
                    num2 = input.nextDouble();
                    if (num2 > num1) {
                        System.out.println("é inferior");
                    } else if (num1 > num2) {
                        System.out.println("é superior");
                    }
                    i++;
                } while (num2 != num1);

                System.out.println("precisou de " + i + " tentativas");

        //Fechar objeto scanner
        input.close();
    }
}