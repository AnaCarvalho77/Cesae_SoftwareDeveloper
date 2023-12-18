package Domain;

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
}
