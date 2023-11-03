package FichaPratica_06;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int i, j, soma = 0;
        int[][] matriz = new int[4][4];

void fazerBarulho(){
    String animal, resultado;

            System.out.printf("insira o animal: ");
            animal = input.next();

            //escolha
            switch (animal.equalsIgnoreCase()) {
                case "Cão":
                    resultado = "Au au au";
                    System.out.println(resultado);
                    break;
                case "Gato":
                    resultado = "Miau";
                    System.out.println(resultado);
                    break;
                case "Peixe":
                    resultado = "Glub Glub";
                    System.out.println(resultado);
                    break;
                case "Vaca":
                    resultado = "Muuuu";
                    System.out.println(resultado);
                    break;

                case "Porco":
                    resultado = "Oinc Oinc";
                    System.out.println(resultado);
                    break;

                default:
                    System.out.println("Erro!operação não contemplada ou mal escrita");
            }
        }

        System.out.println("a soma da diagonal principal é: " + soma);


        //Fechar objeto scanner
        input.close();
    }
}
