package FichaPratica_03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num = 0, limite, salto;

        //Ler numero limite
        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        //Ler numero salto
        System.out.print("Insira o salto: ");
        salto = input.nextInt();


        //imprimir numeros do intervalo
        while(num <= limite) {
            System.out.print(num +"\n" );
            num += salto;
        }
    }
}
