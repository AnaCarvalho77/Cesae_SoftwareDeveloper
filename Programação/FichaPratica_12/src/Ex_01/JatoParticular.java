package Ex_01;

import java.util.ArrayList;

public class JatoParticular extends Avioes{
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;

    ArrayList<Instalacoes> instalacoes = new ArrayList<>();


    public JatoParticular(String nSerie, String modelo,int anoFabrico, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, int nMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(nSerie, modelo, anoFabrico, peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
    }

    public void addInstalacao(Instalacoes instalacaoNova){
        instalacoes.add(instalacaoNova);

    }

    public void removerInstalacao(Instalacoes instalacaoNova){
        instalacoes.remove(instalacaoNova);

    }

    @Override
    public void dadosAviao(){
        super.dadosAviao();
        System.out.println("loatação avião: " + this.lotacao);
        System.out.println("capacidade da bagagem: " + this.capacidadeBagagem);
        System.out.println("categoria avião: " + this.categoria);
        System.out.print("As instalações que tem são: ");
        System.out.print(this.instalacoes);
        System.out.println();

    }

}
