package FichaPratica_02;
import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {

        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double salAnual, taxa;

        //Ler num1
        System.out.print("Insira salário anual: ");
        salAnual = input.nextDouble();


        //calculos
        if (salAnual <= 15000) {
            taxa = salAnual * 0.2;
            System.out.println("Paga taxa de 20%: " + taxa + "€");
        } else {
            taxa = salAnual * 0.3;
            System.out.println("Paga taxa de 30%: " + taxa + "€");
        }

        //Fechar objeto scanner
        input.close();

    }
}
