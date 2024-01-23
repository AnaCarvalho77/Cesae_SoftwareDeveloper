package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_05 {
    /**
     * Método para contar uma piada guardada numa biblioteca
     * @param num - numero recebido para aceder ao vetor da biblioteca
     * @return biliotecaPiada - conta a piada do numero recebido na biblioteca
     */
    static String contarPiada(int num) {
        String[] bibliotecaPiadas = new String[4];

        num = num - 1;

        bibliotecaPiadas[0] = "Que nome se dá a uma ferramenta perdida?Foice";
        bibliotecaPiadas[1] = "O que 17 alentejanos fazem em frente ao cinema?À espera que chegue mais um porque é para maior de 18.";
        bibliotecaPiadas[2] = "Qual é a panela que está sempre triste? A panela depressão.";
        bibliotecaPiadas[3] = "O que acontece se o Pai Natal morrer? Ele não estará mais em trenós.";

        return bibliotecaPiadas[num];
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        int numero;
        System.out.print("Introduza um número para ouvir uma piada: ");
        numero = input.nextInt();

        if(numero < 1 || numero > 4){
            System.out.println("não existe piada para esse número");
        }

        System.out.println(contarPiada(numero));
    }
}
