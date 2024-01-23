package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Ficheiros/exercicio_06.txt"));

        int maior=0, idade;
        String nome, nomeMaior = null;



        while (in.hasNextLine()) {
           String linha = in.nextLine();
           String[] itensDaLinha = linha.split(",");
           nome = itensDaLinha[0];
           idade = Integer.parseInt(itensDaLinha[1]);
           if(idade > maior){
               maior = idade;
               nomeMaior = nome;

           }
        }
        System.out.println(nomeMaior);
    }
}
