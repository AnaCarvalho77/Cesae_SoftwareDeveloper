package FichaPratica_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double valor1, valor2, valor3, media, mediaPonderada;

        //Ler valor1
        System.out.print("Insira o valor1: ");
        valor1 = input.nextDouble();

        //Ler valor2
        System.out.print("Insira o valor2: ");
        valor2 = input.nextDouble();

        //Ler valor3
        System.out.print("Insira o valor3: ");
        valor3 = input.nextDouble();

        //Calcular media
        media = (valor1 + valor2 + valor3) / 3;

        //Calcular media ponderada
        mediaPonderada = ((valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5)) / (0.2 + 0.3 + 0.5);


        //Apresentar resultados
        System.out.println("Média:" + media);
        System.out.println("Média Ponderada:" + mediaPonderada);
    }
}
