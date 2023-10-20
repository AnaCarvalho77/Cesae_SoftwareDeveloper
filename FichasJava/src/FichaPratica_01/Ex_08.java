package FichaPratica_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int aux = 0, min, seg, horas, totalmin, totalseg, totalhoras;

        //Ler tempos música 1
        System.out.print("Introduza minutos da música 1: ");
        min = input.nextInt();
        System.out.print("Introduza segundos da música 1: ");
        seg = input.nextInt();

        //Ler tempos musica 2
        System.out.print("Introduza minutos da música 2: ");
        min += input.nextInt();
        System.out.print("Introduza segundos da música 2: ");
        seg += input.nextInt();

        //Ler tempos musica 3
        System.out.print("Introduza minutos da música 3: ");
        min += input.nextInt();
        System.out.print("Introduza segundos da música 3: ");
        seg += input.nextInt();

        //Ler tempos musica 4
        System.out.print("Introduza minutos da música 4: ");
        min += input.nextInt();
        System.out.print("Introduza segundos da música 4: ");
        seg += input.nextInt();

        //Ler tempos musica 5
        System.out.print("Introduza minutos da música 5: ");
        min += input.nextInt();
        System.out.print("Introduza segundos da música 5: ");
        seg += input.nextInt();

        //Calcular total
        horas = ((seg/60) + min) / 60;
        min = ((seg/60) + min) % 60;
        seg = seg / 60;





        //Apresentar resultados
        System.out.println("Total do Álbum: " + horas + "h " + min + "m " + seg + "s");
    }
}
