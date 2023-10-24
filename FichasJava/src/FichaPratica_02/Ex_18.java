package FichaPratica_02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
            //Instanciar o Scanner
            Scanner input = new Scanner(System.in);

            //Declarar variáveis
            int codFunc, numDias;
            double vencDia =0, subAlimDia = 0, txIRS = 0, txSsFunc = 0, txSsEmp = 0, venc, subAlim, retIrs, segSsFunc, segSsEmp, vencLiquido;
            String cargo;

            //Ler código funcionário
            System.out.print("Insira o código do Funcionário: ");
            codFunc = input.nextInt();

            //Ler dias trabalhados
            System.out.print("Insira o número de dias trabalhados: ");
            numDias = input.nextInt();

            //Questionar cargo
            System.out.print("Escolha a letra correspondente ao seu cargo:\nE - Empregado\nC - Chefe\nA - Administrador\n");
            cargo = input.next();

        switch (cargo) {
            case "E":
                //Valores se empregado
                vencDia = 40;
                subAlimDia = 5;
                txSsFunc = 0.11;
                txSsEmp = 0.2375;
                System.out.println(vencDia + " " + subAlimDia + " " + txSsFunc + " " + txSsEmp + " ");
                break;
            case "C":
                //Valores se chefe
                vencDia = 60;
                subAlimDia = 7.5;
                txSsFunc = 0.11;
                txSsEmp = 0.2375;
                System.out.println(vencDia + " " + subAlimDia + " " + txSsFunc + " " + txSsEmp + " ");
                break;
            case "A":
                //Valores se administrador
                vencDia = 80;
                subAlimDia = 7.5;
                txSsFunc = 0.09;
                txSsEmp = 0.21;
                System.out.println(vencDia + "\n" + subAlimDia + "\n" + txSsFunc + "\n" + txSsEmp + "\n");
                break;
            default:
                System.out.println("Erro!opção não contemplado.");
            }

            //verificar a taxa de IRS
            venc = vencDia * numDias;
            if(venc < 1000){
                txIRS = 0.1;
            }else{
                txIRS = 0.2;
            }
            System.out.println("Vencimento iliquido:" + venc);

            subAlim = subAlimDia * numDias;
            System.out.println("Subsidio Alimentação:" + subAlim);

            retIrs = venc * txIRS;
            System.out.println("Retenção de IRS:" + retIrs);

            segSsFunc = venc * txSsFunc;

            segSsEmp = venc * txSsEmp;
            System.out.println("Segurança Social :" + (segSsEmp + segSsFunc));

            vencLiquido = venc + subAlim - retIrs - segSsFunc;
            System.out.println("Vencimento Líquido:" + vencLiquido);

        }
}
