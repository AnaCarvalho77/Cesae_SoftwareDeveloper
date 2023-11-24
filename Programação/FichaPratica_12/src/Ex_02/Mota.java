package Ex_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {
    public Mota(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo, tipoCombustivel);
    }

    public void imagem (String caminhoFicheiro) throws FileNotFoundException {

        //Trazer o ficheiro para o programa
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        //declarar variável
        String linha;

        //Enquanto o ficheiro tiver próxima linha ele vai imprimir
        while (fichOrigem.hasNextLine()) {
            linha = fichOrigem.nextLine();
            System.out.println(linha);
        }
    }
}
