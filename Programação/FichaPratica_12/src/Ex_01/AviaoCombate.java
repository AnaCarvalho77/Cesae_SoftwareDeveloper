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
@Override
    public void dadosAviao(){
        super.dadosAviao();
        System.out.println("país dse origem: " + this.camuflagem);
        System.out.println("camuflagem: " + this.camuflagem);
        System.out.print("As armas que tem são: ");
        System.out.print(this.armas);
        System.out.println();

    }


}
