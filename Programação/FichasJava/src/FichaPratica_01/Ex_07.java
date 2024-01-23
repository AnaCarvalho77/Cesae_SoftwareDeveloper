package FichaPratica_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double preco1, preco2, preco3, desconto = 0.1, total;

        //Ler valor1
        System.out.print("Insira o preco1: ");
        preco1 = input.nextDouble();

        //Ler valor2
        System.out.print("Insira o preco2: ");
        preco2 = input.nextDouble();

        //Ler valor3
        System.out.print("Insira o preco3: ");
        preco3 = input.nextDouble();

        //Calcular total
        total = (preco1 + preco2 + preco3) * (1-desconto);


        //Apresentar resultados
        System.out.println("Total:" + total);

    }
}
