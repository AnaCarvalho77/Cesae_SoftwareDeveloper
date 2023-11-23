package Ex_01;

import java.util.ArrayList;

public class JatoParticular extends Avioes{
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;

    ArrayList<Instalacoes> instalacoes = new ArrayList<>();


    public JatoParticular(String nSerie, String modelo, double peso, double compFuselagem, double envergaduraAsas, double alturaCauda, double nMotores, double autonomia, double velocidadeMax, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(nSerie, modelo, peso, compFuselagem, envergaduraAsas, alturaCauda, nMotores, autonomia, velocidadeMax, preco);
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

    public void listarInstalacoesAviao(){
        for(Instalacoes i: instalacoes){
            System.out.println(i);
        }

    }

}
