package FichaPratica_02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        //Declarar variáveis
        int horas, minutos;

        //Ler horas
        System.out.print("Introduza horas: ");
        horas = input.nextInt();

        //Ler minutos
        System.out.print("Introduza minutos: ");
        minutos = input.nextInt();

        //verificar formato
        if(horas > 12){
            horas -= 12;
            System.out.println(horas + ":" + minutos + "PM");
        } else{
            System.out.println(horas + ":" + minutos + "AM");
        }

    }
}
