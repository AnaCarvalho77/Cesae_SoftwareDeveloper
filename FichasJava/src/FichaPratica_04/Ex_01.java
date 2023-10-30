package FichaPratica_04;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double num1, num2, resultado;
        String opcao;

        do {
            //Ler num1
            System.out.print("Insira número 1: ");
            num1 = input.nextDouble();

            //Ler num2
            System.out.print("Insira número 2: ");
            num2 = input.nextDouble();

            //Recolher opcao utilizador
            //Ler opcao
            System.out.print("Insira operação pretendida escrevendo +, -, / ou * : ");
            opcao = input.next();


            //escolha
            switch (opcao) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case "/":
                    resultado = num1 / num2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;

                default:
                    System.out.println("Erro!operação não contemplada ou mal escrita");
            }
            System.out.println("Deseja continuar : ");
            System.out.println("s - para sim");
            System.out.println("n - para não");
            opcao = input.next();
        } while (!opcao.equals("n"));




        //Fechar objeto scanner
        input.close();
    }
}
