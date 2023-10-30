package FichaPratica_05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        int  i;
        double soma = 0;
        double[] num =new double[12];
        String mes = "";


        for(i = 0 ; i < 12; i++ ){
            switch (i) {
                case 0:
                    mes = "Janeiro";
                    break;
                case 1:
                   mes = "Fevereiro";
                    break;
                case 2:
                    mes = "Março";
                    break;
                case 3:
                    mes = "Abril";
                    break;
                case 4:
                    mes = "Maio";
                    break;
                case 5:
                    mes = "Junho";
                    break;
                case 6:
                    mes = "Julho";
                    break;
                case 7:
                    mes = "Agosto";
                    break;
                case 8:
                    mes = "Setembro";
                    break;
                case 9:
                    mes = "Outubro";
                    break;
                case 10:
                    mes = "Novembro";
                    break;
                case 11:
                    mes = "Dezembro";
                    break;
                default:
                    break;
            }
            System.out.printf("insira a comissão do mês de %s: ",mes);
            num [i] = input.nextInt();
            soma += num[i];

        }
        System.out.println("");
        System.out.println("o valor anual de cossissões é: " + soma);

        //Fechar objeto scanner
        input.close();
    }
}
