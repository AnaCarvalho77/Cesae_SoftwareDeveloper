package FichaPratica_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int numeroIni = 2, numeroFim;

        //Ler numero final
        System.out.print("Insira o numero: ");
        numeroFim = input.nextInt();

        //imprimir numeros do intervalo
        while(numeroIni <= numeroFim) {
            if(numeroIni % 2 == 0){
                System.out.println(numeroIni);
            }
            numeroIni ++;
        }
    }
}
