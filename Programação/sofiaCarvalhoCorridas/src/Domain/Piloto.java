package Domain;

import java.util.ArrayList;

public class Piloto {
    private String nome;
    private int fichasCorrida;
    private Veiculo veiculoAtual;
    private int vitorias;

    public Piloto(String nome, int fichasCorrida, Veiculo veiculoAtual, int vitorias) {
        this.nome = nome;
        this.fichasCorrida = fichasCorrida;
        this.veiculoAtual = veiculoAtual;
        this.vitorias = vitorias;
    }

    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public int getFichasCorrida() {
        return fichasCorrida;
    }

    public String getNome() {
        return nome;
    }

    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    public int getVitorias() {
        return vitorias;
    }


    public void imprimirVeiculoAtual(){
        if(veiculoAtual!=null){
            System.out.print("\n o veículo é: ");
            veiculoAtual.mostrarDetalhes();
        }else{
            System.out.println("Ainda não tem nenhum veiculo associado");
        }

    }

    public void usarItem(){
        System.out.print("\n os itens do veículo são: ");
        if(veiculoAtual instanceof Carro){
            if( veiculoAtual!= null && ((Carro) veiculoAtual).getKitCorrida()!=null) {
                System.out.println(((Carro) veiculoAtual).getKitCorrida());
            }else {
                System.out.println("Nao tem itens adicionados!");
            }
        }else if(veiculoAtual instanceof Mota) {
            if (veiculoAtual != null && ((Mota) veiculoAtual).getHabilidadesMota() != null) {
                System.out.println(((Mota) veiculoAtual).getHabilidadesMota());
            } else {
                System.out.println("Nao tem itens adicionados!");
            }
        }

    }
}
