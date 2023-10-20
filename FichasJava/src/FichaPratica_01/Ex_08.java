package FichaPratica_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int aux = 0, min1, min2, min3, seg1, seg2, seg3, min4, seg4, min5, seg5, totalmin, totalseg, totalhoras;

        //Ler tempos música 1
        System.out.print("Introduza minutos da música 1: ");
        min1 = input.nextInt();
        System.out.print("Introduza segundos da música 1: ");
        seg1 = input.nextInt();

        //Ler tempos musica 2
        System.out.print("Introduza minutos da música 2: ");
        min2 = input.nextInt();
        System.out.print("Introduza segundos da música 2: ");
        seg2 = input.nextInt();

        //Ler tempos musica 3
        System.out.print("Introduza minutos da música 3: ");
        min3 = input.nextInt();
        System.out.print("Introduza segundos da música 3: ");
        seg3 = input.nextInt();

        //Ler tempos musica 4
        System.out.print("Introduza minutos da música 4: ");
        min4 = input.nextInt();
        System.out.print("Introduza segundos da música 4: ");
        seg4 = input.nextInt();

        //Ler tempos musica 5
        System.out.print("Introduza minutos da música 5: ");
        min5 = input.nextInt();
        System.out.print("Introduza segundos da música 5: ");
        seg5 = input.nextInt();

        //Calcular total
        totalseg = (seg1 + seg2 + seg3 + seg4 + seg5) % 60;
        aux = (seg1 + seg2 + seg3 + seg4 + seg5) / 60;
        totalmin = (aux + min1 + min2 + min3 + min4 + min5) % 60;
        totalhoras = (aux + min1 + min2 + min3 + min4 + min5) / 60;




        //Apresentar resultados
        System.out.println("Total do Álbum: " + totalhoras + "h " + totalmin + "m " + totalseg + "s");
    }
}
