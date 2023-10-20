package FichaPratica_02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2, num3;

        //Ler num1
        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        //Ler num3
        System.out.print("Insira número 2: ");
        num3 = input.nextInt();

        //Colocar ordem crescente
        if (num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println(num1 num2, num3);
            }else{
                System.out.println(num1 + num3 + num2);
            }
        }
        if (num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println("num2" + "num1" + "num3");
            }else{
                System.out.println(num2 + num3 + num1);
            }
        }
        if (num3 > num1 && num3 > num2){
            if(num1 > num2){
                System.out.println(num3 + num1 + num2);
            }else{
                System.out.println(num3 + num2 + num1);
            }
        }

        //Fechar objeto scanner
        input.close();
    }
}
