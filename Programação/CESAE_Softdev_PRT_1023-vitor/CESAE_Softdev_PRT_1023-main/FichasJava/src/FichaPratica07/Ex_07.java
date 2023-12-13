package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("Ficheiros/exercicio_07.txt");

        Scanner scanner = new Scanner(ficheiro);
        Scanner scannerPalavras = new Scanner(ficheiro);

        int contadorLinhas=0, contadorPalavras=0;

        while (scanner.hasNextLine()){
            contadorLinhas++;
            scanner.nextLine();
        }

        while(scannerPalavras.hasNext()){
            contadorPalavras++;
            scannerPalavras.next();
        }

        System.out.println("Linhas: "+contadorLinhas);
        System.out.println("Palavras: "+contadorPalavras);

    }
}
