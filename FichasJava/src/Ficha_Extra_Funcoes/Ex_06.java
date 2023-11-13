package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_06 {
    static double somatorio(int num) {

        int soma = 0, i, digito = 0, numVetor, numAtual;


        while (num != 0) {
            // Obtém o último dígito
            digito = num % 10;

            // Adiciona o dígito à soma
            soma += digito;

            // Remove o último dígito do número
            num /= 10;
        }

        return soma;
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        int num;

        System.out.print("Introduza um número: ");
        num = input.nextInt();



        System.out.println("somatório: " + somatorio(num));


    }
}
