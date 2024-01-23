package FichaPratica_02;
import java.util.Scanner;
public class Ex_04 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int opcao;

        //Ler opcao
        System.out.print("Insira o lugar: ");
        opcao = input.nextInt();


        //escolha
        switch (opcao) {
            case 1:System.out.println("1º Lugar: 10 pontos");
                break;
            case 2:
                System.out.println("2º Lugar: 8 pontos");
                break;
            case 3:
                System.out.println("3º Lugar: 6 pontos");
                break;
            case 4:
                System.out.println("4º Lugar: 5 pontos");
                break;
            case 5:
                System.out.println("5º Lugar: 4 pontos");
                break;
            case 6:
                System.out.println("6º Lugar: 3 pontos");
                break;
            case 7:
                System.out.println("7º Lugar: 2 pontos");
                break;
            case 8:
                System.out.println("8º Lugar: 1 pontos");
                break;
            default:
                System.out.println("Lugar sem pontos!");
        }


        //Fechar objeto scanner
        input.close();
    }
}
