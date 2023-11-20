package Ex_01;

public class main {
    public static void main(String[] args) {


        Carro carro1 = new Carro("Mercedes", "A45", 2023, 150, 1800, 7, TipoCombustivel.GASOLEO);
        Carro carro2 = new Carro("Toyota", "Land Cruiser", 2021, 200, 2000, 15, TipoCombustivel.GASOLINA);
        Carro carro3 = new Carro("Ferrari", "SF90", 2023, 800, 5000, 25, TipoCombustivel.GASOLINA);
        Carro carro4 = new Carro("Toyota", "Rav4", 2021, 180, 1800, 15, TipoCombustivel.GASOLINA);


        Carro vencedorCorrida1 = carro1.corrida(carro2, 2023);
        Carro vencedorCorrida2 = carro3.corrida(carro4, 2023);

        Carro vencedorFinal = vencedorCorrida1.corrida(vencedorCorrida2, 2023);
        System.out.println("O vencedor é:");
        vencedorFinal.exibirDetalhes();


        System.out.println("O consumo do " + carro1.getMarca() + " é de " + carro1.valorConsumido(97));
        System.out.println("O consumo do " + carro2.getMarca() + " é de " + carro2.valorConsumido(97));

        if (carro1.valorConsumido(97) > carro2.valorConsumido(97)) {
            System.out.println("o carro que gastou mais foi: " + carro1.getMarca());
        } else if (carro1.valorConsumido(97) < carro2.valorConsumido(97)) {
            System.out.println("o carro que gastou mais foi: " + carro2.getMarca());
        } else {
            System.out.println("os dois carros gastaram o mesmo");
        }


    }


}
