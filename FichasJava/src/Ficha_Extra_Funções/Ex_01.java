package Ficha_Extra_Funções;

import java.util.Scanner;

public class Ex_01 {
    /**
     * Função para retornar o menor numero inteiro de 3 numeros
     * @param num1 - primeiro numero
     * @param num2 - segundo numero
     * @param num3 - terceiro numero
     * @return menor - o menor numero dos três recebidos
     */
    static int numeroMaisPequeno(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        }else if (num2 < num1 && num2 < num3){
            return num2;
        } else if(num3 < num1 && num3 < num2) {
            return num3;
        }
        return 0;
    }

    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

       //Declarar variáveis
        int num1, num2, num3, menor;

        //pedir numeros ao utilizador e guardar as variaveis
        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();
        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        menor = numeroMaisPequeno(num1,num2,num3);

        System.out.println();
        System.out.print("O menor número é o: " + menor);
    }
}
