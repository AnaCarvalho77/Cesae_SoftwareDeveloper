package FichaPratica_02;
import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2;

        //Ler num1
        System.out.print("Insira número 1: ");
        num1 = input.nextInt();

        //Ler num2
        System.out.print("Insira número 2: ");
        num2 = input.nextInt();

        //Ver qual o maior
        if (num1 > num2)
            System.out.println("Maior: " + num1);
        else
            System.out.println("Maior: " + num2);

        //Fechar objeto scanner
        input.close();
    }

}
