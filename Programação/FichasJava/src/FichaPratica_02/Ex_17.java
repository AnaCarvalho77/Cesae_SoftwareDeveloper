package FichaPratica_02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double saldo, credito;

        //Ler saldo
        System.out.print("Insira o saldo médio: \n");
        saldo = input.nextInt();
        System.out.print("Saldo médio de: " + saldo + "\n");


        //Cálculo valor crédito
        if (saldo < 0){
            System.out.print("Saldo negativo!!Sem crédtio\n");
        }else if (saldo <= 2000){
            System.out.print("Nenhum crédito\n");
        }else if (saldo <= 4000){
            credito = saldo * 0.2;
            System.out.print("Crédito de: " + credito + "\n");
        } else if (saldo <= 6000){
            credito = saldo * 0.3;
            System.out.print("Crédito de: " + credito + "\n");
        }else{
            credito = saldo * 0.4;
            System.out.print("Crédito de: " + credito + "\n");
        }




        //Fechar objeto scanner
        input.close();
    }
}
