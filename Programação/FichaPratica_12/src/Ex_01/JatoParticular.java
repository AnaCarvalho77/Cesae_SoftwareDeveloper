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

        System.out.println("loatação avião: " + this.lotacao);
        System.out.println("capacidade da bagagem: " + this.capacidadeBagagem);
        System.out.println("categoria avião: " + this.categoria);
        System.out.print("As instalações que tem são: ");
        for(Instalacoes i: instalacoes) {
            System.out.print(i + " | ");
        }
        System.out.println();

    }

}
