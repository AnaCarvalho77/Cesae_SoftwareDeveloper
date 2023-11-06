package FichaPratica_06;

import java.util.Scanner;

public class Ex_02 {

    /**
     * Método que lê um numero inteiro positivo
     * @return Número int positivo
     */
    public static int IntPositivo() {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        int numero = 0;
        while (numero <= 0) {
            System.out.print("digite um número: ");
            numero = input.nextInt();
        }
        //Fechar objeto scanner
        input.close();

        return numero;
    }


    /**
     * imprime um numero de asteriscos passado por parametro
     * @param numAst Numero de ast a imprimir
     */
    public static void Asteriscos(int numAst) {
        int i;
        String ast;
        ast = "*";
        for (i = 0; i < numAst; i++) {
            System.out.print(ast);
        }
    }

    public static void main(String[] args) {
        int num, resultado;

        num = IntPositivo();
        Asteriscos(num);

    }
}
