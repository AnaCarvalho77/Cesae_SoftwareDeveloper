package Ex_06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculadora calculos = new Calculadora();
        String opcao;

        do {

            System.out.println("\nqual conta deseja fazer?");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            opcao = input.next();
            if (!opcao.equals("0")) {
                System.out.println("qual o primeiro número? ");
                Double num1 = input.nextDouble();
                System.out.println("Qual o segundo número? ");
                Double num2 = input.nextDouble();


                switch (opcao) {
                    case "1":
                        System.out.println(calculos.adicao(num1, num2));
                        break;
                    case "2":
                        System.out.println(calculos.subtracao(num1, num2));
                        break;
                    case "3":
                        System.out.println(calculos.multiplicacao(num1, num2));
                        break;
                    case "4":
                        System.out.println(calculos.divisao(num1, num2));
                        break;

                    default:
                        System.out.println("Opção não contemplada!");
                        break;
                }
            }
        } while (!opcao.equals("0"));


    }
}
