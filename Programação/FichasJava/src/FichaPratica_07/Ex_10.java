package FichaPratica_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fichOrigem = new Scanner(new File("Ficheiros/exercicio_10.csv"));

    String linha = fichOrigem.nextLine();

    String tipoProduto,produto;
    double quant,preco,precoTotal = 0;

    while(fichOrigem.hasNextLine()){
      linha = fichOrigem.nextLine();
      String [] itens = linha.split(",");
        tipoProduto = itens[0];
        produto = itens[1];
        quant = Double.parseDouble(itens[2]);
        preco = Double.parseDouble(itens[3]);

        precoTotal += (quant*preco);

    }
        System.out.println("total vendas: "+ precoTotal);
    }
}
