package Domain;

import java.util.ArrayList;

public class Piloto {
    private String nome;
    private int fichasCorrida;
    private Veiculo veiculoAtual;
    private int vitorias = 0;

    /**
     * Método Construtor da classe Piloto hque recebe como parametros:
     * @param nome (string) o nome do piloto
     * @param fichasCorrida (int) as fichas do piloto
     * @param veiculoAtual (Veiculo) o veiculo do piloto
     * @param vitorias (int) as vitorias do piloto
     */
    public Piloto(String nome, int fichasCorrida, Veiculo veiculoAtual, int vitorias) {
        this.nome = nome;
        this.fichasCorrida = fichasCorrida;
        this.veiculoAtual = veiculoAtual;
        this.vitorias = vitorias;
    }

    /**
     * Método para alterar o veiculo do piloto
     * @param veiculoAtual recebe o veiculo que vai ficar no piloto
     */
    public void setVeiculoAtual(Veiculo veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    /**
     * Método para saber o valor da variável FichasCorrida
     * @return (int) o valor das fichas de corrida do piloto
     */
    public int getFichasCorrida() {
        return fichasCorrida;
    }

    /**
     * Método para saber o veiculo do piloto
     * @return (Veiculo) retorna o veiculo do piloto
     */
    public Veiculo getVeiculoAtual() {
        return veiculoAtual;
    }

    /**
     * Método para saber o valor da variável Vitorias do Piloto
     * @return (int) retorna o número de vitorias do piloto
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * Método para alterar o valor da variável de fichas de corrida do Piloto
     * @param fichasCorrida recebe como parametro o valor a colocar
     */
    public void setFichasCorrida(int fichasCorrida) {
        this.fichasCorrida = fichasCorrida;
    }

    /**
     * Método para alterar o valor da variável de vitorias do Piloto
     * @param vitorias recebe como parametro o valor a colocar
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * Método para mostrar qual o veiculo atual do piloto e os seus detalhes
     */
    public void imprimirVeiculoAtual() {
        if (veiculoAtual != null) {
            veiculoAtual.mostrarDetalhes();
        } else {
            System.out.println("Ainda não tem nenhum veiculo associado");
        }

    }

    /**
     * Método para imprimir os itens do veiculo do piloto
     */
    public void usarItem() {
        if (veiculoAtual == null) {
            System.out.println("---Não tem Itens porque ainda não tem veículo");
            return;
        }

        System.out.println("---itens do veículo---");
        if (veiculoAtual instanceof Carro) {
            if (((Carro) veiculoAtual).getKitCorrida() != null) {
                ((Carro) veiculoAtual).imprimirKitCorrida();
            } else {
                System.out.println("Nao tem itens adicionados!");
            }
        } else if (veiculoAtual instanceof Mota) {
            if (((Mota) veiculoAtual).getHabilidadesMota() != null) {
                ((Mota) veiculoAtual).imprimirHabilidadesMota();
                System.out.println();
            } else {
                System.out.println("Nao tem itens adicionados!\n");
            }
        }
    }

    /**
     * Método para imprimir as fichas, veiculo, itens do veiculo e fichas do piloto
     */
    public void mostrarDetalhes() {
        System.out.println("\n********* Dados Atuais *********");
        System.out.println("---Fichas de corrida: " + this.fichasCorrida);
        System.out.print("---Veiculo atual: ");
        imprimirVeiculoAtual();
        usarItem();
        System.out.println("---Quantidade Vitórias: " + this.vitorias);
        System.out.println("*************************************");
    }

}
