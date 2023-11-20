package Ex_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Carro carro1 = new Carro("Mercedes","A45",2023,150, 1800, 7, TipoCombustivel.GASOLEO);
        Carro carro2 = new Carro("Toyota","Land Cruiser",2021,200, 2000, 15, TipoCombustivel.GASOLINA);
        Carro carro3 = new Carro("Ferrari","SF90",2023,800, 5000, 25, TipoCombustivel.GASOLINA);
        Carro carro4 = new Carro("Toyota","Rav4",2021,180, 1800, 15, TipoCombustivel.GASOLINA);


        Carro vencedorCorrida1 = carro1.corrida(carro2, 2023);
        Carro vencedorCorrida2 = carro3.corrida(carro4, 2023);
      
        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2,2023);
        System.out.println("O vencedor é:");
     vencedorFinal.exibirDetalhes();


    }






}
