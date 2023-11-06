package FichaPratica_06;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        int num;


        System.out.println("introduza um número: ");
        num = input.nextInt();

        int resultado = 0, triangular = 0;


            for(int i = 1; i <= num && num!= resultado; i++){
                resultado +=i;
                if(num == resultado) {
                    System.out.println("triangular");
                }
            }
            if (num!=resultado)
                System.out.println("não triangular");

        }


}
