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

        if (saldo){
            System.out.println(num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2);
        } else{
            System.out.println(num3);
        }

        //Fechar objeto scanner
        input.close();
    }
    }
}
