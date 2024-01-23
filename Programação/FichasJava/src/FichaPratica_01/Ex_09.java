package FichaPratica_01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int codFunc, numDias;
        double vencDia = 40, subAlimDia = 5, txIRS = 0.1, txSsFunc = 0.11, txSsEmp = 0.2375, venc, subAlim, retIrs, segSsFunc, segSsEmp, vencLiquido;

        //Ler código funcionário
        System.out.print("Insira o código do Funcionário: ");
        codFunc = input.nextInt();

        //Ler dias trabalhados
        System.out.print("Insira o número de dias trabalhados: ");
        numDias = input.nextInt();

        //Calcular
       venc = vencDia * numDias;
       System.out.println("Vencimento iliquido:" + venc);

       subAlim = subAlimDia * numDias;
       System.out.println("Subsidio Alimentação:" + subAlim);

       retIrs = venc * txIRS;
       System.out.println("Retenção de IRS:" + retIrs);

       segSsFunc = venc * txSsFunc;
       System.out.println("Segurança Social Funcionário:" + segSsFunc);

       segSsEmp = venc * txSsEmp;
       System.out.println("Segurança Social Empresa:" + segSsEmp);

       vencLiquido = venc + subAlim - retIrs - segSsFunc;
       System.out.println("Vencimento Líquido:" + vencLiquido);

    }
}
