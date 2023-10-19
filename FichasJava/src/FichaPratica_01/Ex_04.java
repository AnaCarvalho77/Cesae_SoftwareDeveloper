package FichaPratica_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double raio, pi = 3.1415, area;

        //Ler raio
        System.out.print("Insira o raio: ");
        raio = input.nextInt();

        //Calcular area
        area = pi * (raio*raio);


        //Apresentar resultados
        System.out.println("Área da circunferência:" + area);
    }
}
