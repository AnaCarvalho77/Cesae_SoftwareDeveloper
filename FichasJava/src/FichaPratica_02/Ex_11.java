package FichaPratica_02;
import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        double saldo, montante;
        String opcao;

        //Ler saldo
        System.out.print("Insira saldo: ");
        saldo = input.nextDouble();

        //Ler montante
        System.out.print("Insira montante: ");
        montante = input.nextDouble();


        //Recolher opcao utilizador
        System.out.print("Insira operação a realizar escrevendo 'creditar' ou 'debitar': ");
        opcao = input.next();


        //escolha
        switch (opcao) {
            case "creditar":
                saldo += montante;
                break;
            case "debitar":
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
