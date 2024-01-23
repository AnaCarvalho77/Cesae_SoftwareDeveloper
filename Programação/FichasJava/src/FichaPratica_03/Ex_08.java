package FichaPratica_03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
//Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num = 0, media = 0, cont = 0;

        //pedir numero
        System.out.print("Insira um numero: ");
        num = input.nextInt();
        while (num != -1){
            cont ++;
            media += num;
            System.out.print("Insira um numero: ");
            num = input.nextInt();
        }

        media = media / cont;
        System.out.println("Média: " + media);
        }
    }

