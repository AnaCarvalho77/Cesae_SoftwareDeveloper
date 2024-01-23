package FichaPratica_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int numero = 0, maximo;

        //Ler numero
        System.out.print("Insira o numero: ");
        maximo = input.nextInt();

        //imprimir numeros até ao solicitado
        while(numero <= maximo){
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}
