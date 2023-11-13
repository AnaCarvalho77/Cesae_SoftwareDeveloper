package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Ficheiros/exercicio_05_1999.txt"));

        int soma=0;



        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] itensDaLinha = linha.split(" ");
            for(int i=0; i< itensDaLinha.length; i++)
                soma+= Integer.parseInt(itensDaLinha[i]);
            }
        System.out.println(soma);
        }
    }

