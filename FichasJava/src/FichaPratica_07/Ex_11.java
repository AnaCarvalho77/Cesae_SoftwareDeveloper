package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) throws FileNotFoundException {

            Scanner fichOrigem = new Scanner(new File("Ficheiros/exercicio_11.csv"));



            String nomeMusica,Artista, genero;
            int horas, minutos;

            while(fichOrigem.hasNextLine()){
                String linha = fichOrigem.nextLine();
                String [] itens = linha.split(",");
                nomeMusica = itens[0];
                artista = itens[1];
                quant = Double.parseDouble(itens[2]);
                preco = Double.parseDouble(itens[3]);

                precoTotal += (quant*preco);

            }
            System.out.println("total vendas: "+ precoTotal);
        }

}
