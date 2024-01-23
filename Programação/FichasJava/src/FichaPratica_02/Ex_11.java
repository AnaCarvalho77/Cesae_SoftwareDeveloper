package FichaPratica_02;
import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double saldo, montante;
        int opcao;

        //Ler saldo
        System.out.print("Insira saldo: ");
        saldo = input.nextDouble();

        //Ler montante
        System.out.print("Insira montante: ");
        montante = input.nextDouble();


        //Recolher opcao utilizador
        System.out.print("Insira operação a realizar:\n1.creditar\n2.debitar\n ");
        opcao = input.nextInt();


        //escolha
        switch (opcao) {
            case 1:
                saldo += montante;
                break;
            case 2:
                saldo -= montante;
                break;

            default:
                System.out.println("Erro!operação não contemplada ou mal escrita");
        }


        //verificar se operação válida

        if (saldo >= 0)
            System.out.println("Saldo: " + saldo);
        else
            System.out.println("Inválido, saldo insuficiente");


        //Fechar objeto scanner
        input.close();
    }

}
