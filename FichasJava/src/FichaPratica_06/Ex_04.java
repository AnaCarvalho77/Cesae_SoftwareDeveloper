package FichaPratica_06;

import java.util.Scanner;

import static FichaPratica_06.Ex_03.*;

public class Ex_04 {
    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        int numero, opcao;

        System.out.println("Introduza um número");
        numero = input.nextInt();

        do {
            System.out.println("Escolha uma das opções:\n1. Par ou Ímpar\n2. Positivo ou Negativo\n3. Primo ou Não Primo\n4. Perfeito ou Não Perfeito\n5. Triangular ou Não Triangular\n6. Trocar de Número");
            opcao = input.nextInt();

        //Menu de opcoes
        switch(opcao){

            case 1: // Par ou impar
                if (par(numero)){
                    System.out.println("número par");
                }else{
                    System.out.println("número impar");
                }
                break;
            case 2: // Positivo ou Negativo
                if (positivo(numero)){
                    System.out.println("número positivo");
                }else{
                    System.out.println("número negativo");
                }
                break;
            case 3://Primo ou Não Primo
                if (primo(numero)){
                    System.out.println("número primo");
                }else{
                    System.out.println("não é um número primo");
                }
                break;
            case 4://Perfeito ou Não Perfeito
                if (perfeito(numero)){
                    System.out.println("número perfeito");
                }else{
                    System.out.println("não é um número perfeito");
                }
                break;
            case 5:// Triangular ou nao
                if (triangular(numero)){
                    System.out.println("número triangular");
                }else{
                    System.out.println("não é um número triangular");
                }
                break;
            case 6: //Trocar de número
                System.out.println("Introduza um novo número");
                numero = input.nextInt();
            default:
                System.out.println("Erro!número opção não contemplado.");

        }
        }while (opcao <1 || opcao >=6);

    }
}
