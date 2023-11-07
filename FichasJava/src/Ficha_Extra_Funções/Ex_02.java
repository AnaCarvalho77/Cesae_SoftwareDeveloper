package Ficha_Extra_Funções;

import java.util.Scanner;

public class Ex_02 {
    /**
     * Função para retornar a média aritmética de 3 numeros
     * @param num1 - primeiro numero
     * @param num2 - segundo numero
     * @param num3 - terceiro numero
     * @return media - a média dos três numeros recebidos
     */
    static double mediaAritm(int num1, int num2, int num3){
        double media;
        media = (num1 + num2 + num3) / 3;
        return media;
    }

    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2, num3;
        double media;

        //pedir numeros ao utilizador e guardar as variaveis
        System.out.print("Introduza o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Introduza o segundo número: ");
        num2 = input.nextInt();
        System.out.print("Introduza o terceiro número: ");
        num3 = input.nextInt();

        media = mediaAritm(num1,num2,num3);

        System.out.println();
        System.out.print("O menor número é o: " + media);
    }
}
