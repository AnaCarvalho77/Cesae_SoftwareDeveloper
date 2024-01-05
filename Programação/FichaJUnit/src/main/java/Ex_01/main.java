package Ex_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculadora = new Calculator();

        int num1=0, num2=0;
        String operacao;

        do{
            boolean estaTudoOk = false;

            do{

                try{
                    System.out.print("Insira um número inteiro: ");
                    num1 = input.nextInt();
                    estaTudoOk = true;
                } catch (InputMismatchException exc){
                    System.out.println("Não sabes ler? eu disse um número inteiro!!");
                    input.nextLine();
                }
            }while(!estaTudoOk);

            System.out.print("Operação Aritmética(+ - * /): ");
            operacao = input.next();


            System.out.print("Insira o segundo número: ");
            num2 = input.nextInt();

            switch (operacao){
                case "+":
                    System.out.println("soma: " + calculadora.add(num1,num2));
                    break;
                case "-":
                    System.out.println("subtração: " + calculadora.subtract(num1,num2));
                    break;
                case "*":
                    System.out.println("multiplicação " + calculadora.multiply(num1,num2));
                    break;
                case "/":
                    try {
                        System.out.println("Divisão: " + calculadora.divide(num1, num2));
                    } catch (IllegalArgumentException exc) {
                        System.out.println("Impossível dividir por 0");
                    }
                    break;
                default:
                    System.out.println("Opção não contemplada");
                    break;
            }

        }while(true);
    }
}
