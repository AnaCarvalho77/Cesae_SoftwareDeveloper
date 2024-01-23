package FichaPratica_02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2, num3, opcao;


        //Ler num1
        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        //Ler num3
        System.out.print("Insira número 3: ");
        num3 = input.nextInt();

        //Questionar qual a ordem
        System.out.print("Escreva qual a ordem:\n1. crescente\n2. decrescente\n");
        opcao = input.nextInt();

        //escolha
        switch (opcao) {
            case 1:
                //Colocar ordem crescente
                if (num1 > num2 && num1 > num3){
                    if(num2 > num3){
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }else{
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }
                if (num2 > num1 && num2 > num3){
                    if(num1 > num3){
                        System.out.println(num3 + " " + num1 + " " + num2);
                    }else{
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                }
                if (num3 > num1 && num3 > num2){
                    if(num1 > num2){
                        System.out.println(num2 + " " + num1 + " " + num3);
                    }else{
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }
                }
                break;
            case 2:
                //Colocar ordem decrescente
                if (num1 > num2 && num1 > num3){
                    if(num2 > num3){
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }else{
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                }
                if (num2 > num1 && num2 > num3){
                    if(num1 > num3){
                        System.out.println(num2 + " " + num1 + " " + num3);
                    }else{
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }
                if (num3 > num1 && num3 > num2){
                    if(num1 > num2){
                        System.out.println(num3 + " " + num1 + " " + num2);
                    }else{
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                }
                break;
            default:
                System.out.println("Erro!opção não contemplado.");
        }



        //Fechar objeto scanner
        input.close();
    }
}
