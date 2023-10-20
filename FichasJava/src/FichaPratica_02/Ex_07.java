package FichaPratica_02;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double nota1, nota2, nota3, medPond;

        //Ler nota 1
        System.out.print("Insira nota 1: ");
        nota1 = input.nextDouble();

        //Ler nota 2
        System.out.print("Insira nota 2: ");
        nota2 = input.nextDouble();

        //Ler nota 3
        System.out.print("Insira nota 3: ");
        nota3 = input.nextDouble();

        //Cálculos
        medPond = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4) ;
        if (medPond >= 9.5)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        //Fechar objeto scanner
        input.close();
    }
}


