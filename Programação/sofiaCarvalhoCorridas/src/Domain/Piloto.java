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

    public void setFichasCorrida(int fichasCorrida) {
        this.fichasCorrida = fichasCorrida;
    }

    public void imprimirVeiculoAtual(){
        if(veiculoAtual!=null){
            System.out.print("\no veículo é: ");
            veiculoAtual.mostrarDetalhes();
        }else{
            System.out.println("Ainda não tem nenhum veiculo associado");
        }

    }

    public void usarItem(){
        if(veiculoAtual == null){
            System.out.println("Ainda não tem nenhum veiculo associado");
            return;
        }

        System.out.println("os itens do veículo são: ");
        if(veiculoAtual instanceof Carro){
            if(((Carro) veiculoAtual).getKitCorrida()!=null) {
                ((Carro) veiculoAtual).imprimirKitCorrida();
            }else {
                System.out.println("Nao tem itens adicionados!");
            }
        }else if(veiculoAtual instanceof Mota) {
            if (((Mota) veiculoAtual).getHabilidadesMota() != null) {
                ((Mota) veiculoAtual).mostrarHbilidadesMota();
            } else {
                System.out.println("Nao tem itens adicionados!");
            }
        }

    }
}
