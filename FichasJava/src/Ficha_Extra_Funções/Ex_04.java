package Ficha_Extra_Funções;

import java.util.Scanner;

public class Ex_04 {
    /**
     * Metodo para imprimir a tabuada até 10 de um número recebido
     * @param num - número recebido
     */
    static void imprimirTabuada(int num){
        int tabuada;
        for(int i=1; i<=10; i++){
            tabuada = num * i;
            System.out.println(num + "x" + i + "=" + tabuada);
        }
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        int num;
        System.out.print("Digite um número: ");
        num = input.nextInt();

        imprimirTabuada(num);
    }
}
