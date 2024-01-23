package FichaPratica_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int opcao;


        //Recolher opcao utilizador
        do{
            System.out.print("Escolha o número do menu:\n 1. Criar\n 2. Atualizar\n 3. Eliminar\n 4. Sair\n");
            opcao = input.nextInt();


            //escolha
            switch (opcao) {
                case 1:
                    System.out.println("Criar");
                    break;
                case 2:
                    System.out.println("Atualizar");
                    break;
                case 3:
                    System.out.println("Eliminar");
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Erro!número opção não contemplado.");
            }
        }while ( opcao!=4);
        //Fechar objeto scanner
        input.close();

    }
}
