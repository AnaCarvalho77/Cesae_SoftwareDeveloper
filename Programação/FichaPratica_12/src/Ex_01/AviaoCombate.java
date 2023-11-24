package Ex_01;

import java.util.ArrayList;

public class AviaoCombate extends Avioes{
    private String paisOrigem;
    private boolean camuflagem;
    ArrayList<Armas> armas = new ArrayList<>(3);

    public AviaoCombate(String nSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velocidadeMax, double preco) {
        super(nSerie, modelo, anoFabrico, peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco);
    }

    public AviaoCombate(String nSerie, String modelo, int anoFabrico, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(nSerie, modelo,anoFabrico, peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
    }

    public void addArmas(Armas armaNova){
       armas.add(armaNova);

    }

    public void removerArmas(Armas armaNova){
        armas.remove(armaNova);

    }

    public void dadosAviao(){
        System.out.println("numero de serie: " + this.getnSerie());
        System.out.println("modelo: " + this.getModelo());
        System.out.println("peso: " + this.getPeso());
        System.out.println("comprimento fuselagem: " + this.getCompFuselagem());
        System.out.println("envergadura asas: " + this.getEnvergaduraAsas());
        System.out.println("altura cauda: " + this.getAlturaCauda());
        System.out.println("numero motores: " + this.getnMotores());
        System.out.println("autonomia: " + this.getAutonomia());
        System.out.println("velocidade máxima: " + this.getVelocidadeMax());
        System.out.println("preço: " + this.getPreco());
        System.out.println("país dse origem: " + this.camuflagem);
        System.out.println("camuflagem: " + this.camuflagem);
        System.out.print("As armas que tem são: ");
        for(Armas i: armas) {
            System.out.print(i + " | ");
        }
        System.out.println();

    }


}
