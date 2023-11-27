package Ex_02;

public class main {
    public static void main(String[] args) {

        Carro nissan = new Carro("nissan","qashqai",2016,110,1.6,5.5,TipoCombustivel.DIESEL,5);
        Carro toyota = new Carro("toyota","yaris",2014,90,1.4,5,TipoCombustivel.DIESEL,5);
        Camiao man = new Camiao("Man","TGX",2021,471,15.2,24,TipoCombustivel.DIESEL,500);
        Mota ktm = new Mota("KTM","450 SX-F",2023,63,449.9,3,TipoCombustivel.GASOLINA);


        Veiculo vencedorCorrida = nissan.corrida(toyota,2023);
        System.out.println("********* o carro vencedor foi *******");
        vencedorCorrida.imprimirDados();
        System.out.println();

        Veiculo vencedorCorrida2 = man.corrida(nissan,2023);
        System.out.println("************ o veiculo vencedor foi *************");
       vencedorCorrida2.imprimirDados();
        System.out.println();

        System.out.println("o custo da viagem foi: " + toyota.calcularCusto(150));
        System.out.println();

        man.viagem(300,300);
        System.out.println();
        man.viagem(200,550);








    }
}
