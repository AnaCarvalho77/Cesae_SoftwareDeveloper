package FichaPratica_02;
import java.util.Scanner;
public class Ex_09 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num1, num2, num3;

        //Ler nota1
        System.out.print("Insira numero 1: ");
        num1 = input.nextInt();

        //Ler nota2
        System.out.print("Insira numero 2: ");
        num2 = input.nextInt();

        //Ler nota3
        System.out.print("Insira numero 3: ");
        num3 = input.nextInt();

        //Ver qual o menor
        if (num1 < num2 && num1 < num3){
            System.out.println(num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2);
        } else if(num3 < num1 && num3 < num2) {
            System.out.println(num3);
        }

        //Fechar objeto scanner
        input.close();
    }
}
