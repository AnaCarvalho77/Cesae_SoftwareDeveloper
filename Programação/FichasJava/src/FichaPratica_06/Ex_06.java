package FichaPratica_06;

import java.util.Scanner;

import static FichaPratica_06.Ex_03.*;
import static FichaPratica_06.Ex_05.*;

public class Ex_06 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int num, i, opcao, maior, menor;


        System.out.println("insira o tamanho do vetor: ");
        num = input.nextInt();

        //Declaração do vetor com o tamanho pedido
        int[] vetor =new int[num];

        for(i =0 ; i < vetor.length; i++ ){
            System.out.printf("insira um número [%d]: ",i);
            vetor [i] = input.nextInt();
        }

        System.out.println("Escolha uma das opções:\n7. Maior Elemento\n8. Menor Elemento\n9. Crescente ou Não Crescente");
        opcao = input.nextInt();

        //Menu de opcoes
        switch(opcao){

            case 7: // Maior Elemento
                maior = maior(vetor);
                System.out.println(maior);
                break;
            case 8: // Menor Elemento
                menor = menor(vetor);
                System.out.println(menor);
                break;
            case 9://Crescente ou não Crescente
                if (crescente(vetor)){
                    System.out.println("O vetor é crescente");
                }else{
                    System.out.println("O vetor não é crescente");
                }
                break;

            default:
                System.out.println("Erro!número opção não contemplado.");

        }

    }
}
