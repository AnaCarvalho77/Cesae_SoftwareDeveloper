package FichaPratica_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int comprimento, largura, perimetro, area;

        //Ler comprimento
        System.out.print("Insira o comprimento: ");
        comprimento = input.nextInt();

        //Ler largura
        System.out.print("Insira a largura: ");
        largura = input.nextInt();

        //Calcular perimetro
        perimetro = (comprimento*2) + (largura*2);

        //Calcular area
        area = comprimento * largura;


        //Apresentar resultados
        System.out.println("Perimetro:" + perimetro);
        System.out.println("Área:" + area);

    }
}
