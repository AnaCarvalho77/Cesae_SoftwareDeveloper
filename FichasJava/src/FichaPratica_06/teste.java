package FichaPratica_06;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        int numAst, i;
        String ast;
        ast = "*";

        System.out.println("introduza um número: ");
        numAst = input.nextInt();

        for(i= 0; i < numAst; i++){
            System.out.print(ast);
        }
    }
}
