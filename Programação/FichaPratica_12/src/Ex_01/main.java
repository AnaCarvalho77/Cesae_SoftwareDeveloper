package Ex_01;

public class main {
    public static void main(String[] args) {
        Avioes boeing1 = new Avioes("0001","boeing 747-300",2015,178100.00,70.6,59.6,19.3,4, 9260,955,83000000.00);

        JatoParticular bombardier1 = new JatoParticular("0002","bombardier challenger 350", 2020,12791,20.9,21,6.1,2,5926,882,18000000.00, 9, 1542,Categoria.MidsizeJet);
        JatoParticular bombardier2 = new JatoParticular("0003","bombardier challenger 350", 2020,12791,20.9,21,6.1,2,5926,882,18000000.00, 9, 1542,Categoria.MidsizeJet);
        JatoParticular bombardier3 = new JatoParticular("0004","bombardier challenger 350", 2020,12791,20.9,21,6.1,2,5926,882,18000000.00, 9, 1542, Categoria.MidsizeJet);

        AviaoCombate armasCasa = new AviaoCombate();
        AviaoCombate casaC295 = new AviaoCombate("0007","CASA C-295M", 2016,23200,24.5,25.81,8.6,2,5400,576,28000000.00, "Espanha",true);
        armasCasa.addArmas(casaC295);
        AviaoCombate falcon50 = new AviaoCombate("0008","Falcon 50", 2008,9163,18.52,18.86,6.97,3,4600,915,18000000.00, "França", false);
        AviaoCombate f16Am = new AviaoCombate("0005","F16 AM", 2018,8495,15.03,9.45,5.09,1,4215,2175,14600000.00,"USA", true);
        AviaoCombate f16Bm = new AviaoCombate("0006","F16 BM", 2017,8495,15.03,9.45,5.09,1,4215,2175,14600000.00, "USA", false);




    }
}
