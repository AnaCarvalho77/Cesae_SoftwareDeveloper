package Ficha_Extra_Funções;

import java.util.Scanner;

public class Ex_03 {
    /**
     * Metodo para calcular a área de um retangulo
     * @param base valor do comprimento do retangulo
     * @param altura vaor da altura do retangulo
     * @return area - valor da area do retangulo
     */
    static int calcularAreaRetangulo(int base, int altura){
        int area;
        area = base * altura;
        return area;
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);


        int comprimento, altura;

        System.out.print("Qual o valor da base: ");
        comprimento=input.nextInt();
        System.out.print("Qual o valor da altura: ");
        altura=input.nextInt();


        System.out.println("a área é: " + calcularAreaRetangulo(comprimento, altura));
    }
}
