package FichaPratica_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int numeroIni, numeroFim;

        //Ler numero inicio
        System.out.print("Insira o numero inicio: ");
        numeroIni = input.nextInt();

        //Ler numero final
        System.out.print("Insira o numero inicio: ");
        numeroFim = input.nextInt();

        //imprimir numeros do intervalo
        while(numeroIni <= numeroFim) {
            System.out.println(numeroIni);
            numeroIni = numeroIni + 1;
        }
    }
}
