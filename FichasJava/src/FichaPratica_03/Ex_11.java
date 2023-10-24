package FichaPratica_03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        //Ler numeros
        while( num >= 0){
            System.out.print("Insira o numero: ");
            num = input.nextInt();
            if(num <= 25){
               cont1++;
            } else if (num <= 50){
                cont2++;
            } else if (num <= 75) {
                cont3++;
            } else if (num <=100){
                cont4++;
            }
            else{
                break;
            }

        }
        System.out.print("[00,25]: " + cont1 + "\n");
        System.out.print("[26,50]: " + cont2 + "\n");
        System.out.print("[51,75]: " + cont3 + "\n");
        System.out.print("[76,100]: " + cont4+ "\n");
    }
}
