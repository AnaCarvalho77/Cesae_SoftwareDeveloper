package FichaPratica_03;

import java.util.Scanner;

public class exemplo_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num, fatorial=1;

        // Ler num
        System.out.print("Insira um número: ");
        num = input.nextInt();

        fatorial=num;
        num--;

        while(num>0){
            fatorial=fatorial*(num);
            num--;
        }

        System.out.println("Fatorial: "+fatorial);

        //Fechar objeto scanner
        input.close();
    }
}
