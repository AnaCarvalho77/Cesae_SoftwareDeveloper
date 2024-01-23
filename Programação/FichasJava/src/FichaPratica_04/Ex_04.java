package FichaPratica_04;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double num, i, cont = 0;

        //Ler num1
        System.out.print("insira um número primo:  ");
        num = input.nextDouble();
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
            if (cont > 2) {
                System.out.println("Não é um número primo");
            } else {
                System.out.println("é um número primo");
            }

            //Fechar objeto scanner
            input.close();
        }
    }

