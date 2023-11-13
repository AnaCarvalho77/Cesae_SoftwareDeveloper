package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/FichasJava/Ficheiros/exercicio_07.txt"));

        int contLinhas = 0, contPalavras = 0, cont= 0;



        while (in.hasNextLine()) {
            String linha = in.nextLine();
            contLinhas++;
            String[] palavras = linha.split(" ");
            contPalavras += palavras.length;

        }
        System.out.println(contLinhas);
        System.out.println(contPalavras);



    }
}
