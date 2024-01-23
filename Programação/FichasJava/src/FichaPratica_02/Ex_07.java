package FichaPratica_02;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int num, par;

        //Ler num1
        System.out.print("Insira número: ");
        num = input.nextInt();

        //Ver se par ou impar
        if (num % 2 == 0)
            System.out.println("É par");
        else
            System.out.println("É impar");

        //Fechar objeto scanner
        input.close();
    }
}


