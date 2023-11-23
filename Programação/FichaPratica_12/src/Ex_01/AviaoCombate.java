package Ex_01;

import java.util.ArrayList;

public class AviaoCombate extends Avioes{
    private String paisOrigem;
    private boolean camuflagem;
    ArrayList<Armas> armas = new ArrayList<>(3);


    public AviaoCombate(String nSerie, String modelo, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, double nMotores, double autonomia, double velocidadeMax, double preco, String paisOrigem, boolean camuflagem) {
        super(nSerie, modelo, peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
    }

    public void addArmas(Armas armaNova){
       armas.add(armaNova);

    }

    public void removerArmas(Armas armaNova){
        armas.remove(armaNova);

    }

   public void listarArmasAviao(){
        for(Armas i: armas){
            System.out.println(i);
        }

   }

}
