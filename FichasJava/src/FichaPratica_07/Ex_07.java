package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Ficheiros/exercicio_07.txt"));

        int contLinhas = 0, contPalavras = 0, cont= 0;



        while (in.hasNextLine()) {
            in.nextLine();
            contLinhas++;
            while(in.hasNext()){
                in.next();
                contPalavras++;
            }

        }
        System.out.println(contLinhas);
        System.out.println(contPalavras);



    }
}
