package FichaPratica_02;
import java.util.Scanner;
public class Ex_08 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double nota1, nota2, nota3, media;

        //Ler nota1
        System.out.print("Insira nota 1: ");
        nota1 = input.nextDouble();

        //Ler nota2
        System.out.print("Insira nota 2: ");
        nota2 = input.nextDouble();

        //Ler nota3
        System.out.print("Insira nota 3: ");
        nota3 = input.nextDouble();

        //calculo media
        media = (nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4);

        //Ver qual o maior
        if (media >= 9.5)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");

        //Fechar objeto scanner
        input.close();
    }
}
